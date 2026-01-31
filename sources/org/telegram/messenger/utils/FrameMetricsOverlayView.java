package org.telegram.messenger.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;

/* loaded from: classes3.dex */
public final class FrameMetricsOverlayView extends View {
    private final AtomicBoolean attachedToWindowManager;
    private final Paint bgPaint;
    private Window hostWindow;
    private Window.OnFrameMetricsAvailableListener listener;
    private WindowManager.LayoutParams lp;
    private Handler metricsHandler;
    private HandlerThread metricsThread;
    private final Runnable redraw;
    private final AtomicBoolean running;
    private final Paint textPaint;
    private final Handler uiHandler;
    private WindowManager wm;

    private enum Metric {
        UNKNOWN_DELAY_DURATION(0, "unknown delay", true),
        INPUT_HANDLING_DURATION(1, "input", true),
        ANIMATION_DURATION(2, "animation", true),
        LAYOUT_MEASURE_DURATION(3, "layout", true),
        DRAW_DURATION(4, "draw", true),
        SYNC_DURATION(5, "sync", true),
        COMMAND_ISSUE_DURATION(6, "cmd issue", true),
        SWAP_BUFFERS_DURATION(7, "swap buffers", true),
        GPU_DURATION(12, "gpu", true, 31),
        TOTAL_DURATION(8, "total", true);

        double avgMs;
        final boolean isDuration;
        final int key;
        final String label;
        long last;
        final int minApi;

        Metric(int i, String str, boolean z) {
            this(i, str, z, 24);
        }

        Metric(int i, String str, boolean z, int i2) {
            this.last = Long.MIN_VALUE;
            this.avgMs = 0.0d;
            this.key = i;
            this.label = str;
            this.isDuration = z;
            this.minApi = i2;
        }

        boolean isAvailable() {
            return Build.VERSION.SDK_INT >= this.minApi;
        }
    }

    public static FrameMetricsOverlayView attachToActivityCorner(Activity activity, int i, int i2) {
        FrameMetricsOverlayView frameMetricsOverlayView = new FrameMetricsOverlayView(activity);
        frameMetricsOverlayView.attachInternal(activity, i, i2);
        return frameMetricsOverlayView;
    }

    public void detach() {
        stop();
        if (this.wm != null && this.attachedToWindowManager.getAndSet(false)) {
            try {
                this.wm.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.wm = null;
        this.lp = null;
        this.hostWindow = null;
    }

    public FrameMetricsOverlayView(Context context) {
        super(context.getApplicationContext());
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        this.textPaint = paint2;
        this.running = new AtomicBoolean(false);
        this.attachedToWindowManager = new AtomicBoolean(false);
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.redraw = new Runnable() { // from class: org.telegram.messenger.utils.FrameMetricsOverlayView.1
            @Override // java.lang.Runnable
            public void run() {
                if (FrameMetricsOverlayView.this.running.get()) {
                    FrameMetricsOverlayView.this.invalidate();
                    FrameMetricsOverlayView.this.uiHandler.postDelayed(this, 300L);
                }
            }
        };
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(10.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        setWillNotDraw(false);
    }

    private void attachInternal(Activity activity, int i, int i2) {
        this.wm = (WindowManager) activity.getSystemService("window");
        this.hostWindow = activity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        this.lp = layoutParams;
        layoutParams.gravity = i;
        int dp = AndroidUtilities.dp(i2);
        WindowManager.LayoutParams layoutParams2 = this.lp;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        this.wm.addView(this, this.lp);
        this.attachedToWindowManager.set(true);
        start();
    }

    private void start() {
        if (this.running.getAndSet(true)) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        this.metricsThread = handlerThread;
        handlerThread.start();
        this.metricsHandler = new Handler(this.metricsThread.getLooper());
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = new Window.OnFrameMetricsAvailableListener() { // from class: org.telegram.messenger.utils.FrameMetricsOverlayView$$ExternalSyntheticLambda3
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                FrameMetricsOverlayView.lambda$start$0(window, frameMetrics, i);
            }
        };
        this.listener = onFrameMetricsAvailableListener;
        this.hostWindow.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, this.metricsHandler);
        this.uiHandler.post(this.redraw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$start$0(Window window, FrameMetrics frameMetrics, int i) {
        long metric;
        for (Metric metric2 : Metric.values()) {
            if (!metric2.isAvailable()) {
                metric2.last = Long.MIN_VALUE;
            } else {
                metric = frameMetrics.getMetric(metric2.key);
                metric2.last = metric;
                if (metric2.isDuration && metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d2 = metric2.avgMs;
                    if (d2 != 0.0d) {
                        d = ((d - d2) * 0.05d) + d2;
                    }
                    metric2.avgMs = d;
                }
            }
        }
    }

    private void stop() {
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener;
        this.running.set(false);
        this.uiHandler.removeCallbacks(this.redraw);
        Window window = this.hostWindow;
        if (window != null && (onFrameMetricsAvailableListener = this.listener) != null) {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
        HandlerThread handlerThread = this.metricsThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Metric[] metricArr;
        int i;
        long j;
        int i2;
        double d;
        long j2;
        double d2;
        String format;
        String str;
        double d3;
        long j3;
        Canvas canvas2 = canvas;
        float dp = AndroidUtilities.dp(8.0f);
        float dp2 = AndroidUtilities.dp(14.0f);
        char c = 0;
        int i3 = 0;
        for (Metric metric : Metric.values()) {
            i3++;
        }
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() > 0 ? getWidth() : AndroidUtilities.dp(260.0f), (2.0f * dp) + ((i3 + 6) * dp2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.bgPaint);
        float f = dp + dp2;
        Metric[] values = Metric.values();
        int length = values.length;
        double d4 = 0.0d;
        long j4 = 0;
        double d5 = 0.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        int i4 = 0;
        while (i4 < length) {
            Metric metric2 = values[i4];
            if (metric2.isAvailable()) {
                long j9 = metric2.last;
                if (j9 >= j4) {
                    if (metric2.isDuration) {
                        Locale locale = Locale.US;
                        String str2 = metric2.label;
                        Double valueOf = Double.valueOf(j9 / 1000000.0d);
                        metricArr = values;
                        i = length;
                        Double valueOf2 = Double.valueOf(metric2.avgMs);
                        Object[] objArr = new Object[3];
                        objArr[c] = str2;
                        objArr[1] = valueOf;
                        objArr[2] = valueOf2;
                        format = String.format(locale, "%-16s : %5.2f / %5.2f ms", objArr);
                        switch (metric2) {
                            case UNKNOWN_DELAY_DURATION:
                            case SWAP_BUFFERS_DURATION:
                                double d8 = d6;
                                str = format;
                                i2 = i4;
                                d3 = d5;
                                j3 = j7;
                                d2 = d8;
                                j8 += metric2.last;
                                d7 += metric2.avgMs;
                                j2 = j3;
                                double d9 = d3;
                                format = str;
                                d = d9;
                                break;
                            case INPUT_HANDLING_DURATION:
                            case ANIMATION_DURATION:
                            case LAYOUT_MEASURE_DURATION:
                            case DRAW_DURATION:
                                double d10 = d6;
                                str = format;
                                i2 = i4;
                                d3 = d5;
                                j3 = j7;
                                d2 = d10;
                                j5 += metric2.last;
                                d4 += metric2.avgMs;
                                j2 = j3;
                                double d92 = d3;
                                format = str;
                                d = d92;
                                break;
                            case SYNC_DURATION:
                                double d11 = d6;
                                str = format;
                                double d12 = d5;
                                j3 = j7;
                                d2 = d11;
                                long j10 = metric2.last;
                                i2 = i4;
                                j5 += j10;
                                double d13 = metric2.avgMs;
                                d4 += d13;
                                j6 += j10;
                                d3 = d12 + d13;
                                j2 = j3;
                                double d922 = d3;
                                format = str;
                                d = d922;
                                break;
                            case COMMAND_ISSUE_DURATION:
                                long j11 = j7;
                                d2 = d6;
                                j6 += metric2.last;
                                i2 = i4;
                                j2 = j11;
                                format = format;
                                d = d5 + metric2.avgMs;
                                break;
                            case GPU_DURATION:
                                j7 += metric2.last;
                                d6 += metric2.avgMs;
                            default:
                                i2 = i4;
                                d = d5;
                                j2 = j7;
                                d2 = d6;
                                break;
                        }
                        canvas.drawText(format, dp, f, this.textPaint);
                        f += dp2;
                        d5 = d;
                        d6 = d2;
                        length = i;
                        j4 = 0;
                        c = 0;
                        j7 = j2;
                        canvas2 = canvas;
                        i4 = i2 + 1;
                        values = metricArr;
                    } else {
                        metricArr = values;
                        i = length;
                        j = j6;
                        i2 = i4;
                        j2 = j7;
                        d2 = d6;
                        d = d5;
                        format = String.format(Locale.US, "%-16s : %d", metric2.label, Long.valueOf(j9));
                        j6 = j;
                        canvas.drawText(format, dp, f, this.textPaint);
                        f += dp2;
                        d5 = d;
                        d6 = d2;
                        length = i;
                        j4 = 0;
                        c = 0;
                        j7 = j2;
                        canvas2 = canvas;
                        i4 = i2 + 1;
                        values = metricArr;
                    }
                }
            }
            metricArr = values;
            i = length;
            j = j6;
            long j12 = j8;
            i2 = i4;
            d = d5;
            j2 = j7;
            d2 = d6;
            format = String.format(Locale.US, "%-16s : n/a", metric2.label);
            j8 = j12;
            j6 = j;
            canvas.drawText(format, dp, f, this.textPaint);
            f += dp2;
            d5 = d;
            d6 = d2;
            length = i;
            j4 = 0;
            c = 0;
            j7 = j2;
            canvas2 = canvas;
            i4 = i2 + 1;
            values = metricArr;
        }
        Canvas canvas3 = canvas2;
        double d14 = d5;
        long j13 = j5;
        long j14 = j6;
        long j15 = j7;
        double d15 = d6;
        long max = Math.max(j13, Math.max(j14, j15));
        double max2 = Math.max(d4, Math.max(d14, d15));
        float f2 = f + dp2;
        Locale locale2 = Locale.US;
        canvas3.drawText(String.format(locale2, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j13 / 1000000.0d), Double.valueOf(d4)), dp, f2, this.textPaint);
        float f3 = f2 + dp2;
        canvas3.drawText(String.format(locale2, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j14 / 1000000.0d), Double.valueOf(d14)), dp, f3, this.textPaint);
        float f4 = f3 + dp2;
        canvas3.drawText(String.format(locale2, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j15 / 1000000.0d), Double.valueOf(d15)), dp, f4, this.textPaint);
        float f5 = f4 + dp2;
        canvas3.drawText(String.format(locale2, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j8 / 1000000.0d), Double.valueOf(d7)), dp, f5, this.textPaint);
        canvas3.drawText(String.format(locale2, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), dp, f5 + dp2, this.textPaint);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(AndroidUtilities.dp(260.0f), (AndroidUtilities.dp(8.0f) * 2) + (AndroidUtilities.dp(14.0f) * (Metric.values().length + 6)));
    }
}
