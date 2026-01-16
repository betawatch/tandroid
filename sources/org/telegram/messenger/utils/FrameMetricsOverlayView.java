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
import org.telegram.messenger.NotificationCenter;

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
        paint2.setTextSize(dp(context, 10));
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
        int dp = dp(activity, i2);
        WindowManager.LayoutParams layoutParams2 = this.lp;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = dp(activity, NotificationCenter.themeAccentListUpdated);
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
        int i;
        String format;
        float dp = dp(getContext(), 8);
        float dp2 = dp(getContext(), 14);
        int i2 = 0;
        for (Metric metric : Metric.values()) {
            i2++;
        }
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() > 0 ? getWidth() : dp(getContext(), NotificationCenter.themeAccentListUpdated), (2.0f * dp) + (i2 * dp2), dp(getContext(), 10), dp(getContext(), 10), this.bgPaint);
        float f = dp + dp2;
        Metric[] values = Metric.values();
        int length = values.length;
        int i3 = 0;
        while (i3 < length) {
            Metric metric2 = values[i3];
            if (metric2.isAvailable()) {
                long j = metric2.last;
                if (j >= 0) {
                    if (metric2.isDuration) {
                        i = 1;
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", metric2.label, Double.valueOf(j / 1000000.0d), Double.valueOf(metric2.avgMs));
                    } else {
                        i = 1;
                        format = String.format(Locale.US, "%-16s : %d", metric2.label, Long.valueOf(j));
                    }
                    canvas.drawText(format, dp, f, this.textPaint);
                    f += dp2;
                    i3 += i;
                }
            }
            i = 1;
            format = String.format(Locale.US, "%-16s : n/a", metric2.label);
            canvas.drawText(format, dp, f, this.textPaint);
            f += dp2;
            i3 += i;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(dp(getContext(), NotificationCenter.themeAccentListUpdated), (dp(getContext(), 8) * 2) + (dp(getContext(), 14) * Metric.values().length));
    }

    private static int dp(Context context, int i) {
        return Math.round(i * context.getResources().getDisplayMetrics().density);
    }
}
