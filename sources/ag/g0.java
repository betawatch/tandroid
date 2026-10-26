package ag;

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
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g0 extends View {
    public e0 E;
    public final AtomicBoolean F;
    public final AtomicBoolean G;
    public final Handler H;
    public final a5.d I;
    public int a;
    public long b;
    public int c;
    public d0 d;
    public final AtomicInteger e;
    public int f;
    public final Paint h;
    public final Paint n;
    public WindowManager r;
    public WindowManager.LayoutParams s;
    public Window v;
    public HandlerThread w;
    public c0 x;
    public View y;

    public g0(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.e = new AtomicInteger(0);
        this.f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.n = paint2;
        this.F = new AtomicBoolean(false);
        this.G = new AtomicBoolean(false);
        this.H = new Handler(Looper.getMainLooper());
        this.I = new a5.d(this, 3);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        for (f0 f0Var : f0.values()) {
            if (Build.VERSION.SDK_INT >= f0Var.c) {
                long metric = frameMetrics.getMetric(f0Var.a);
                f0Var.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = f0Var.e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    f0Var.e = d;
                }
            } else {
                f0Var.d = Long.MIN_VALUE;
            }
        }
    }

    public static g0 b(LaunchActivity launchActivity, org.telegram.ui.k0 k0Var) {
        g0 g0Var = new g0(launchActivity);
        g0Var.setObservedView(k0Var);
        g0Var.r = (WindowManager) launchActivity.getSystemService("window");
        g0Var.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        g0Var.s = layoutParams;
        layoutParams.gravity = 8388627;
        int dp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = g0Var.s;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        g0Var.r.addView(g0Var, g0Var.s);
        g0Var.G.set(true);
        if (g0Var.F.getAndSet(true)) {
            return g0Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        g0Var.w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(g0Var.w.getLooper());
        c0 c0Var = new c0();
        g0Var.x = c0Var;
        g0Var.v.addOnFrameMetricsAvailableListener(c0Var, handler);
        g0Var.d = new d0(g0Var, 0);
        Choreographer.getInstance().postFrameCallback(g0Var.d);
        View view = g0Var.y;
        if (view != null) {
            g0Var.E = new e0(0, g0Var);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(g0Var.E);
            }
        }
        g0Var.H.post(g0Var.I);
        return g0Var;
    }

    public final void c() {
        c0 c0Var;
        this.F.set(false);
        this.H.removeCallbacks(this.I);
        Window window = this.v;
        if (window != null && (c0Var = this.x) != null) {
            window.removeOnFrameMetricsAvailableListener(c0Var);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.y;
        if (view != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        HandlerThread handlerThread = this.w;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.r != null && this.G.getAndSet(false)) {
            try {
                this.r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.r = null;
        this.s = null;
        this.v = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String format;
        double d;
        g0 g0Var = this;
        float dp = AndroidUtilities.dp(8.0f);
        float dp2 = AndroidUtilities.dp(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, g0Var.getWidth() > 0 ? g0Var.getWidth() : AndroidUtilities.dp(260.0f), ((f0.values().length + 9) * dp2) + (2.0f * dp), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), g0Var.h);
        float f7 = dp + dp2;
        f0[] values = f0.values();
        int length = values.length;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        double d13 = 0.0d;
        float f10 = dp2;
        long j10 = 0;
        int i10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            float f11 = f10;
            Paint paint = g0Var.n;
            if (i10 >= length) {
                long j14 = j13;
                long max = Math.max(j10, Math.max(j11, j12));
                double d14 = d12;
                long j15 = j12;
                double d15 = d13;
                long j16 = j11;
                double d16 = d11;
                double max2 = Math.max(d16, Math.max(d15, d14));
                float f12 = f7 + f11;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j10 / 1000000.0d), Double.valueOf(d16)), dp, f12, paint);
                float f13 = f12 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j16 / 1000000.0d), Double.valueOf(d15)), dp, f13, paint);
                float f14 = f13 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j15 / 1000000.0d), Double.valueOf(d14)), dp, f14, paint);
                float f15 = f14 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j14 / 1000000.0d), Double.valueOf(d10)), dp, f15, paint);
                float f16 = f15 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), dp, f16, paint);
                float f17 = f16 + f11 + f11;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.c)), dp, f17, paint);
                canvas.drawText(String.format(locale, "%-16s : %d /s", this.y != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.f)), dp, f17 + f11, paint);
                return;
            }
            int i11 = length;
            f0 f0Var = values[i10];
            int i12 = i10;
            boolean z10 = Build.VERSION.SDK_INT >= f0Var.c;
            String str = f0Var.b;
            long j17 = j13;
            if (z10) {
                long j18 = f0Var.d;
                if (j18 >= 0) {
                    format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str, Double.valueOf(j18 / 1000000.0d), Double.valueOf(f0Var.e));
                    switch (f0Var) {
                        case EF8:
                        case EF84:
                            j13 = j17 + f0Var.d;
                            d10 += f0Var.e;
                            break;
                        case EF18:
                        case EF28:
                        case EF38:
                        case EF48:
                            j10 += f0Var.d;
                            d11 += f0Var.e;
                            j13 = j17;
                            break;
                        case EF59:
                            long j19 = f0Var.d;
                            j10 += j19;
                            d = f0Var.e;
                            d11 += d;
                            j11 += j19;
                            d13 += d;
                            j13 = j17;
                            break;
                        case EF69:
                            j11 += f0Var.d;
                            d = f0Var.e;
                            d13 += d;
                            j13 = j17;
                            break;
                        case EF99:
                            j12 += f0Var.d;
                            d12 += f0Var.e;
                            j13 = j17;
                            break;
                        default:
                            j13 = j17;
                            break;
                    }
                    canvas.drawText(format, dp, f7, paint);
                    f7 += f11;
                    i10 = i12 + 1;
                    g0Var = this;
                    f10 = f11;
                    length = i11;
                }
            }
            format = String.format(Locale.US, "%-16s : n/a", str);
            j13 = j17;
            canvas.drawText(format, dp, f7, paint);
            f7 += f11;
            i10 = i12 + 1;
            g0Var = this;
            f10 = f11;
            length = i11;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), ((f0.values().length + 9) * AndroidUtilities.dp(11.0f)) + (AndroidUtilities.dp(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.y;
        if (view3 != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        this.y = view;
        if (!this.F.get() || (view2 = this.y) == null) {
            return;
        }
        this.E = new e0(0, this);
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.addOnDrawListener(this.E);
        }
    }
}
