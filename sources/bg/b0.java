package bg;

import a8.ra;
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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b0 extends View {
    public View D;
    public z E;
    public final AtomicBoolean F;
    public final AtomicBoolean G;
    public final Handler H;
    public final ra I;
    public int a;
    public long b;
    public int c;
    public y d;
    public final AtomicInteger e;
    public int f;
    public final Paint h;
    public final Paint n;
    public WindowManager r;
    public WindowManager.LayoutParams s;
    public Window w;
    public HandlerThread x;
    public x y;

    public b0(LaunchActivity launchActivity) {
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
        this.I = new ra(this, 12);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(org.telegram.messenger.g0.L(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        for (a0 a0Var : a0.values()) {
            if (Build.VERSION.SDK_INT >= a0Var.c) {
                long metric = frameMetrics.getMetric(a0Var.a);
                a0Var.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d2 = a0Var.e;
                    if (d2 != 0.0d) {
                        d = ((d - d2) * 0.05d) + d2;
                    }
                    a0Var.e = d;
                }
            } else {
                a0Var.d = Long.MIN_VALUE;
            }
        }
    }

    public static b0 b(LaunchActivity launchActivity, org.telegram.ui.k0 k0Var) {
        b0 b0Var = new b0(launchActivity);
        b0Var.setObservedView(k0Var);
        b0Var.r = (WindowManager) launchActivity.getSystemService("window");
        b0Var.w = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        b0Var.s = layoutParams;
        layoutParams.gravity = 8388627;
        int L = org.telegram.messenger.g0.L(12);
        WindowManager.LayoutParams layoutParams2 = b0Var.s;
        layoutParams2.x = L;
        layoutParams2.y = L;
        layoutParams2.width = org.telegram.messenger.g0.L(260.0f);
        b0Var.r.addView(b0Var, b0Var.s);
        b0Var.G.set(true);
        if (b0Var.F.getAndSet(true)) {
            return b0Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        b0Var.x = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(b0Var.x.getLooper());
        x xVar = new x();
        b0Var.y = xVar;
        b0Var.w.addOnFrameMetricsAvailableListener(xVar, handler);
        b0Var.d = new y(b0Var, 0);
        Choreographer.getInstance().postFrameCallback(b0Var.d);
        View view = b0Var.D;
        if (view != null) {
            b0Var.E = new z(0, b0Var);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(b0Var.E);
            }
        }
        b0Var.H.post(b0Var.I);
        return b0Var;
    }

    public final void c() {
        x xVar;
        this.F.set(false);
        this.H.removeCallbacks(this.I);
        Window window = this.w;
        if (window != null && (xVar = this.y) != null) {
            window.removeOnFrameMetricsAvailableListener(xVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.D;
        if (view != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        HandlerThread handlerThread = this.x;
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
        this.w = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String format;
        double d;
        b0 b0Var = this;
        float L = org.telegram.messenger.g0.L(8.0f);
        float L2 = org.telegram.messenger.g0.L(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, b0Var.getWidth() > 0 ? b0Var.getWidth() : org.telegram.messenger.g0.L(260.0f), ((a0.values().length + 9) * L2) + (2.0f * L), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), b0Var.h);
        float f10 = L + L2;
        a0[] values = a0.values();
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
            Paint paint = b0Var.n;
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
                canvas.drawText(String.format(locale, "%-16s : %d /s", this.D != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.f)), L, f18 + f12, paint);
                return;
            }
            int i10 = length;
            a0 a0Var = values[i7];
            int i11 = i7;
            boolean z9 = Build.VERSION.SDK_INT >= a0Var.c;
            String str = a0Var.b;
            long j16 = j12;
            if (z9) {
                long j17 = a0Var.d;
                if (j17 >= 0) {
                    format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str, Double.valueOf(j17 / 1000000.0d), Double.valueOf(a0Var.e));
                    switch (a0Var.ordinal()) {
                        case 0:
                        case 7:
                            j12 = j16 + a0Var.d;
                            d2 += a0Var.e;
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            j3 += a0Var.d;
                            d10 += a0Var.e;
                            j12 = j16;
                            break;
                        case 5:
                            long j18 = a0Var.d;
                            j3 += j18;
                            d = a0Var.e;
                            d10 += d;
                            j10 += j18;
                            d12 += d;
                            j12 = j16;
                            break;
                        case 6:
                            j10 += a0Var.d;
                            d = a0Var.e;
                            d12 += d;
                            j12 = j16;
                            break;
                        case 8:
                            j11 += a0Var.d;
                            d11 += a0Var.e;
                            j12 = j16;
                            break;
                        default:
                            j12 = j16;
                            break;
                    }
                    canvas.drawText(format, L, f10, paint);
                    f10 += f12;
                    i7 = i11 + 1;
                    b0Var = this;
                    f11 = f12;
                    length = i10;
                }
            }
            format = String.format(Locale.US, "%-16s : n/a", str);
            j12 = j16;
            canvas.drawText(format, L, f10, paint);
            f10 += f12;
            i7 = i11 + 1;
            b0Var = this;
            f11 = f12;
            length = i10;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(210.0f), ((a0.values().length + 9) * org.telegram.messenger.g0.L(11.0f)) + (org.telegram.messenger.g0.L(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.D;
        if (view3 != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        this.D = view;
        if (!this.F.get() || (view2 = this.D) == null) {
            return;
        }
        this.E = new z(0, this);
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.addOnDrawListener(this.E);
        }
    }
}
