package org.telegram.messenger.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;

/* loaded from: classes3.dex */
public final class FrameMetricsOverlayView extends View {
    private final AtomicBoolean attachedToWindowManager;
    private final Paint bgPaint;
    private Choreographer.FrameCallback choreographerCallback;
    private Window hostWindow;
    private Window.OnFrameMetricsAvailableListener listener;
    private WindowManager.LayoutParams lp;
    private Handler metricsHandler;
    private HandlerThread metricsThread;
    private View observedView;
    private final AtomicInteger onDrawCountAccum;
    private ViewTreeObserver.OnDrawListener onDrawListener;
    private int onDrawPerSecond;
    private final Runnable redraw;
    private final AtomicBoolean running;
    private final Paint textPaint;
    private final Handler uiHandler;
    private int vsyncCountAccum;
    private int vsyncPerSecond;
    private long vsyncWindowStartNs;
    private WindowManager wm;

    /* JADX INFO: Access modifiers changed from: private */
    enum Metric {
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

    public static FrameMetricsOverlayView attachToActivityCorner(Activity activity, int i, int i2, View view) {
        FrameMetricsOverlayView frameMetricsOverlayView = new FrameMetricsOverlayView(activity);
        frameMetricsOverlayView.setObservedView(view);
        frameMetricsOverlayView.attachInternal(activity, i, i2);
        return frameMetricsOverlayView;
    }

    public void setObservedView(View view) {
        detachOnDrawListener();
        this.observedView = view;
        if (this.running.get()) {
            attachOnDrawListener();
        }
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
        this.vsyncCountAccum = 0;
        this.vsyncWindowStartNs = 0L;
        this.vsyncPerSecond = 0;
        this.onDrawCountAccum = new AtomicInteger(0);
        this.onDrawPerSecond = 0;
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
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
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
                FrameMetricsOverlayView.$r8$lambda$m42WIPdz4HTot3OVFKZ-a0YbcXM(window, frameMetrics, i);
            }
        };
        this.listener = onFrameMetricsAvailableListener;
        this.hostWindow.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, this.metricsHandler);
        this.choreographerCallback = new Choreographer.FrameCallback() { // from class: org.telegram.messenger.utils.FrameMetricsOverlayView$$ExternalSyntheticLambda4
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                FrameMetricsOverlayView.$r8$lambda$gltRIaOZHlqXqiv9bXSxIVoxzrU(FrameMetricsOverlayView.this, j);
            }
        };
        Choreographer.getInstance().postFrameCallback(this.choreographerCallback);
        attachOnDrawListener();
        this.uiHandler.post(this.redraw);
    }

    public static /* synthetic */ void $r8$lambda$m42WIPdz4HTot3OVFKZ-a0YbcXM(Window window, FrameMetrics frameMetrics, int i) {
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

    public static /* synthetic */ void $r8$lambda$gltRIaOZHlqXqiv9bXSxIVoxzrU(FrameMetricsOverlayView frameMetricsOverlayView, long j) {
        if (frameMetricsOverlayView.running.get()) {
            long j2 = frameMetricsOverlayView.vsyncWindowStartNs;
            if (j2 == 0) {
                frameMetricsOverlayView.vsyncWindowStartNs = j;
            } else if (j - j2 >= 1000000000) {
                frameMetricsOverlayView.vsyncPerSecond = frameMetricsOverlayView.vsyncCountAccum;
                frameMetricsOverlayView.onDrawPerSecond = frameMetricsOverlayView.onDrawCountAccum.getAndSet(0);
                frameMetricsOverlayView.vsyncCountAccum = 0;
                frameMetricsOverlayView.vsyncWindowStartNs = j;
            } else {
                frameMetricsOverlayView.vsyncCountAccum++;
            }
            Choreographer.getInstance().postFrameCallback(frameMetricsOverlayView.choreographerCallback);
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
        if (this.choreographerCallback != null) {
            Choreographer.getInstance().removeFrameCallback(this.choreographerCallback);
            this.choreographerCallback = null;
        }
        detachOnDrawListener();
        HandlerThread handlerThread = this.metricsThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    private void attachOnDrawListener() {
        if (this.observedView == null) {
            return;
        }
        this.onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: org.telegram.messenger.utils.FrameMetricsOverlayView$$ExternalSyntheticLambda5
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                FrameMetricsOverlayView.this.onDrawCountAccum.incrementAndGet();
            }
        };
        ViewTreeObserver viewTreeObserver = this.observedView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnDrawListener(this.onDrawListener);
        }
    }

    private void detachOnDrawListener() {
        View view = this.observedView;
        if (view == null || this.onDrawListener == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnDrawListener(this.onDrawListener);
        }
        this.onDrawListener = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        double d;
        float f;
        int i2;
        String str;
        String str2;
        float dp = AndroidUtilities.dp(8.0f);
        float dp2 = AndroidUtilities.dp(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() > 0 ? getWidth() : AndroidUtilities.dp(260.0f), (2.0f * dp) + ((Metric.values().length + 9) * dp2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.bgPaint);
        float f2 = dp + dp2;
        Metric[] values = Metric.values();
        int length = values.length;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        float f3 = dp2;
        long j = 0;
        long j2 = 0;
        int i3 = 0;
        long j3 = 0;
        long j4 = 0;
        while (i3 < length) {
            Metric[] metricArr = values;
            Metric metric = metricArr[i3];
            if (metric.isAvailable()) {
                i = length;
                d = d2;
                long j5 = metric.last;
                if (j5 >= 0) {
                    if (metric.isDuration) {
                        f = f3;
                        str = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", metric.label, Double.valueOf(j5 / 1000000.0d), Double.valueOf(metric.avgMs));
                        switch (metric) {
                            case UNKNOWN_DELAY_DURATION:
                            case SWAP_BUFFERS_DURATION:
                                j4 += metric.last;
                                d4 += metric.avgMs;
                                str = str;
                                d2 = d;
                                break;
                            case INPUT_HANDLING_DURATION:
                            case ANIMATION_DURATION:
                            case LAYOUT_MEASURE_DURATION:
                            case DRAW_DURATION:
                                j3 += metric.last;
                                d2 = d + metric.avgMs;
                                str = str;
                                break;
                            case SYNC_DURATION:
                                long j6 = metric.last;
                                j3 += j6;
                                double d6 = metric.avgMs;
                                j += j6;
                                d3 += d6;
                                str = str;
                                d2 = d + d6;
                                break;
                            case COMMAND_ISSUE_DURATION:
                                j += metric.last;
                                d3 += metric.avgMs;
                                d2 = d;
                                break;
                            case GPU_DURATION:
                                j2 += metric.last;
                                d5 += metric.avgMs;
                                d2 = d;
                                break;
                            default:
                                d2 = d;
                                break;
                        }
                        i2 = 1;
                        canvas.drawText(str, dp, f2, this.textPaint);
                        f2 += f;
                        i3 += i2;
                        values = metricArr;
                        length = i;
                        f3 = f;
                    } else {
                        f = f3;
                        str2 = String.format(Locale.US, "%-16s : %d", metric.label, Long.valueOf(j5));
                        j4 = j4;
                        d2 = d;
                        i2 = 1;
                        str = str2;
                        canvas.drawText(str, dp, f2, this.textPaint);
                        f2 += f;
                        i3 += i2;
                        values = metricArr;
                        length = i;
                        f3 = f;
                    }
                }
            } else {
                i = length;
                d = d2;
            }
            f = f3;
            long j7 = j4;
            i2 = 1;
            str2 = String.format(Locale.US, "%-16s : n/a", metric.label);
            j4 = j7;
            d2 = d;
            str = str2;
            canvas.drawText(str, dp, f2, this.textPaint);
            f2 += f;
            i3 += i2;
            values = metricArr;
            length = i;
            f3 = f;
        }
        double d7 = d2;
        float f4 = f3;
        float f5 = f2;
        long j8 = j3;
        long max = Math.max(j8, Math.max(j, j2));
        double d8 = d5;
        long j9 = j2;
        double max2 = Math.max(d7, Math.max(d3, d8));
        float f6 = f5 + f4;
        Locale locale = Locale.US;
        canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j8 / 1000000.0d), Double.valueOf(d7)), dp, f6, this.textPaint);
        float f7 = f6 + f4;
        canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j / 1000000.0d), Double.valueOf(d3)), dp, f7, this.textPaint);
        float f8 = f7 + f4;
        canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j9 / 1000000.0d), Double.valueOf(d8)), dp, f8, this.textPaint);
        float f9 = f8 + f4;
        canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j4 / 1000000.0d), Double.valueOf(d4)), dp, f9, this.textPaint);
        float f10 = f9 + f4;
        canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), dp, f10, this.textPaint);
        float f11 = f10 + f4 + f4;
        canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.vsyncPerSecond)), dp, f11, this.textPaint);
        canvas.drawText(String.format(locale, "%-16s : %d /s", this.observedView != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.onDrawPerSecond)), dp, f11 + f4, this.textPaint);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), (AndroidUtilities.dp(8.0f) * 2) + (AndroidUtilities.dp(11.0f) * (Metric.values().length + 9)));
    }
}
