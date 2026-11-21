package bg;

import a8.sa;
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
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class c0 extends View {
    public View E;
    public a0 F;
    public final AtomicBoolean G;
    public final AtomicBoolean H;
    public final Handler I;
    public final sa J;
    public int a;
    public long b;
    public int c;
    public z d;
    public final AtomicInteger e;
    public int f;
    public final Paint h;
    public final Paint n;
    public WindowManager r;
    public WindowManager.LayoutParams s;
    public Window w;
    public HandlerThread x;
    public y y;

    public c0(LaunchActivity launchActivity) {
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
        this.G = new AtomicBoolean(false);
        this.H = new AtomicBoolean(false);
        this.I = new Handler(Looper.getMainLooper());
        this.J = new sa(this, 14);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(org.telegram.messenger.g0.L(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        for (b0 b0Var : b0.values()) {
            if (Build.VERSION.SDK_INT >= b0Var.c) {
                long metric = frameMetrics.getMetric(b0Var.a);
                b0Var.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d2 = b0Var.e;
                    if (d2 != 0.0d) {
                        d = ((d - d2) * 0.05d) + d2;
                    }
                    b0Var.e = d;
                }
            } else {
                b0Var.d = Long.MIN_VALUE;
            }
        }
    }

    public static c0 b(LaunchActivity launchActivity, org.telegram.ui.k0 k0Var) {
        c0 c0Var = new c0(launchActivity);
        c0Var.setObservedView(k0Var);
        c0Var.r = (WindowManager) launchActivity.getSystemService("window");
        c0Var.w = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        c0Var.s = layoutParams;
        layoutParams.gravity = 8388627;
        int L = org.telegram.messenger.g0.L(12);
        WindowManager.LayoutParams layoutParams2 = c0Var.s;
        layoutParams2.x = L;
        layoutParams2.y = L;
        layoutParams2.width = org.telegram.messenger.g0.L(260.0f);
        c0Var.r.addView(c0Var, c0Var.s);
        c0Var.H.set(true);
        if (c0Var.G.getAndSet(true)) {
            return c0Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        c0Var.x = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(c0Var.x.getLooper());
        y yVar = new y();
        c0Var.y = yVar;
        c0Var.w.addOnFrameMetricsAvailableListener(yVar, handler);
        c0Var.d = new z(c0Var, 0);
        Choreographer.getInstance().postFrameCallback(c0Var.d);
        View view = c0Var.E;
        if (view != null) {
            c0Var.F = new a0(0, c0Var);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(c0Var.F);
            }
        }
        c0Var.I.post(c0Var.J);
        return c0Var;
    }

    public final void c() {
        y yVar;
        this.G.set(false);
        this.I.removeCallbacks(this.J);
        Window window = this.w;
        if (window != null && (yVar = this.y) != null) {
            window.removeOnFrameMetricsAvailableListener(yVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.E;
        if (view != null && this.F != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.F);
            }
            this.F = null;
        }
        HandlerThread handlerThread = this.x;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.r != null && this.H.getAndSet(false)) {
            try {
                this.r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.r = null;
        this.s = null;
        this.w = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String format;
        double d;
        c0 c0Var = this;
        float L = org.telegram.messenger.g0.L(8.0f);
        float L2 = org.telegram.messenger.g0.L(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, c0Var.getWidth() > 0 ? c0Var.getWidth() : org.telegram.messenger.g0.L(260.0f), ((b0.values().length + 9) * L2) + (2.0f * L), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), c0Var.h);
        float f10 = L + L2;
        b0[] values = b0.values();
        int length = values.length;
        double d2 = 0.0d;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        float f11 = L2;
        long j3 = 0;
        int i7 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            float f12 = f11;
            Paint paint = c0Var.n;
            if (i7 >= length) {
                long j13 = j12;
                long max = Math.max(j3, Math.max(j10, j11));
                double d13 = d11;
                long j14 = j11;
                double d14 = d12;
                long j15 = j10;
                double d15 = d10;
                double max2 = Math.max(d15, Math.max(d14, d13));
                float f13 = f10 + f12;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j3 / 1000000.0d), Double.valueOf(d15)), L, f13, paint);
                float f14 = f13 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j15 / 1000000.0d), Double.valueOf(d14)), L, f14, paint);
                float f15 = f14 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j14 / 1000000.0d), Double.valueOf(d13)), L, f15, paint);
                float f16 = f15 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j13 / 1000000.0d), Double.valueOf(d2)), L, f16, paint);
                float f17 = f16 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), L, f17, paint);
                float f18 = f17 + f12 + f12;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.c)), L, f18, paint);
                canvas.drawText(String.format(locale, "%-16s : %d /s", this.E != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.f)), L, f18 + f12, paint);
                return;
            }
            int i10 = length;
            b0 b0Var = values[i7];
            int i11 = i7;
            boolean z10 = Build.VERSION.SDK_INT >= b0Var.c;
            String str = b0Var.b;
            long j16 = j12;
            if (z10) {
                long j17 = b0Var.d;
                if (j17 >= 0) {
                    format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str, Double.valueOf(j17 / 1000000.0d), Double.valueOf(b0Var.e));
                    switch (b0Var.ordinal()) {
                        case 0:
                        case 7:
                            j12 = j16 + b0Var.d;
                            d2 += b0Var.e;
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            j3 += b0Var.d;
                            d10 += b0Var.e;
                            j12 = j16;
                            break;
                        case 5:
                            long j18 = b0Var.d;
                            j3 += j18;
                            d = b0Var.e;
                            d10 += d;
                            j10 += j18;
                            d12 += d;
                            j12 = j16;
                            break;
                        case 6:
                            j10 += b0Var.d;
                            d = b0Var.e;
                            d12 += d;
                            j12 = j16;
                            break;
                        case 8:
                            j11 += b0Var.d;
                            d11 += b0Var.e;
                            j12 = j16;
                            break;
                        default:
                            j12 = j16;
                            break;
                    }
                    canvas.drawText(format, L, f10, paint);
                    f10 += f12;
                    i7 = i11 + 1;
                    c0Var = this;
                    f11 = f12;
                    length = i10;
                }
            }
            format = String.format(Locale.US, "%-16s : n/a", str);
            j12 = j16;
            canvas.drawText(format, L, f10, paint);
            f10 += f12;
            i7 = i11 + 1;
            c0Var = this;
            f11 = f12;
            length = i10;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(210.0f), ((b0.values().length + 9) * org.telegram.messenger.g0.L(11.0f)) + (org.telegram.messenger.g0.L(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.E;
        if (view3 != null && this.F != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.F);
            }
            this.F = null;
        }
        this.E = view;
        if (!this.G.get() || (view2 = this.E) == null) {
            return;
        }
        this.F = new a0(0, this);
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.addOnDrawListener(this.F);
        }
    }
}
