package cg;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 extends View {
    public View E;
    public y F;
    public final AtomicBoolean G;
    public final AtomicBoolean H;
    public final Handler I;
    public final a3.o J;
    public int a;
    public long b;
    public int c;
    public x d;
    public final AtomicInteger e;
    public int f;
    public final Paint h;
    public final Paint n;
    public WindowManager r;
    public WindowManager.LayoutParams s;
    public Window w;
    public HandlerThread x;
    public w y;

    public a0(LaunchActivity launchActivity) {
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
        this.J = new a3.o(this, 13);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(org.telegram.messenger.g0.L(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        for (z zVar : z.values()) {
            if (Build.VERSION.SDK_INT >= zVar.c) {
                long metric = frameMetrics.getMetric(zVar.a);
                zVar.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = zVar.e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    zVar.e = d;
                }
            } else {
                zVar.d = Long.MIN_VALUE;
            }
        }
    }

    public static a0 b(LaunchActivity launchActivity, org.telegram.ui.l0 l0Var) {
        a0 a0Var = new a0(launchActivity);
        a0Var.setObservedView(l0Var);
        a0Var.r = (WindowManager) launchActivity.getSystemService("window");
        a0Var.w = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        a0Var.s = layoutParams;
        layoutParams.gravity = 8388627;
        int L = org.telegram.messenger.g0.L(12);
        WindowManager.LayoutParams layoutParams2 = a0Var.s;
        layoutParams2.x = L;
        layoutParams2.y = L;
        layoutParams2.width = org.telegram.messenger.g0.L(260.0f);
        a0Var.r.addView(a0Var, a0Var.s);
        a0Var.H.set(true);
        if (a0Var.G.getAndSet(true)) {
            return a0Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        a0Var.x = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(a0Var.x.getLooper());
        w wVar = new w();
        a0Var.y = wVar;
        a0Var.w.addOnFrameMetricsAvailableListener(wVar, handler);
        a0Var.d = new x(a0Var, 0);
        Choreographer.getInstance().postFrameCallback(a0Var.d);
        View view = a0Var.E;
        if (view != null) {
            a0Var.F = new y(0, a0Var);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(a0Var.F);
            }
        }
        a0Var.I.post(a0Var.J);
        return a0Var;
    }

    public final void c() {
        w wVar;
        this.G.set(false);
        this.I.removeCallbacks(this.J);
        Window window = this.w;
        if (window != null && (wVar = this.y) != null) {
            window.removeOnFrameMetricsAvailableListener(wVar);
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
        a0 a0Var = this;
        float L = org.telegram.messenger.g0.L(8.0f);
        float L2 = org.telegram.messenger.g0.L(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, a0Var.getWidth() > 0 ? a0Var.getWidth() : org.telegram.messenger.g0.L(260.0f), ((z.values().length + 9) * L2) + (2.0f * L), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), a0Var.h);
        float f10 = L + L2;
        z[] values = z.values();
        int length = values.length;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        double d13 = 0.0d;
        float f11 = L2;
        long j10 = 0;
        int i3 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            float f12 = f11;
            Paint paint = a0Var.n;
            if (i3 >= length) {
                long j14 = j13;
                long max = Math.max(j10, Math.max(j11, j12));
                double d14 = d12;
                long j15 = j12;
                double d15 = d13;
                long j16 = j11;
                double d16 = d11;
                double max2 = Math.max(d16, Math.max(d15, d14));
                float f13 = f10 + f12;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j10 / 1000000.0d), Double.valueOf(d16)), L, f13, paint);
                float f14 = f13 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j16 / 1000000.0d), Double.valueOf(d15)), L, f14, paint);
                float f15 = f14 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j15 / 1000000.0d), Double.valueOf(d14)), L, f15, paint);
                float f16 = f15 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j14 / 1000000.0d), Double.valueOf(d10)), L, f16, paint);
                float f17 = f16 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), L, f17, paint);
                float f18 = f17 + f12 + f12;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.c)), L, f18, paint);
                canvas.drawText(String.format(locale, "%-16s : %d /s", this.E != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.f)), L, f18 + f12, paint);
                return;
            }
            int i10 = length;
            z zVar = values[i3];
            int i11 = i3;
            boolean z10 = Build.VERSION.SDK_INT >= zVar.c;
            String str = zVar.b;
            long j17 = j13;
            if (z10) {
                long j18 = zVar.d;
                if (j18 >= 0) {
                    format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str, Double.valueOf(j18 / 1000000.0d), Double.valueOf(zVar.e));
                    switch (zVar) {
                        case EF7:
                        case EF81:
                            j13 = j17 + zVar.d;
                            d10 += zVar.e;
                            break;
                        case EF17:
                        case EF27:
                        case EF37:
                        case EF47:
                            j10 += zVar.d;
                            d11 += zVar.e;
                            j13 = j17;
                            break;
                        case EF57:
                            long j19 = zVar.d;
                            j10 += j19;
                            d = zVar.e;
                            d11 += d;
                            j11 += j19;
                            d13 += d;
                            j13 = j17;
                            break;
                        case EF67:
                            j11 += zVar.d;
                            d = zVar.e;
                            d13 += d;
                            j13 = j17;
                            break;
                        case EF96:
                            j12 += zVar.d;
                            d12 += zVar.e;
                            j13 = j17;
                            break;
                        default:
                            j13 = j17;
                            break;
                    }
                    canvas.drawText(format, L, f10, paint);
                    f10 += f12;
                    i3 = i11 + 1;
                    a0Var = this;
                    f11 = f12;
                    length = i10;
                }
            }
            format = String.format(Locale.US, "%-16s : n/a", str);
            j13 = j17;
            canvas.drawText(format, L, f10, paint);
            f10 += f12;
            i3 = i11 + 1;
            a0Var = this;
            f11 = f12;
            length = i10;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(210.0f), ((z.values().length + 9) * org.telegram.messenger.g0.L(11.0f)) + (org.telegram.messenger.g0.L(8.0f) * 2));
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
        this.F = new y(0, this);
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.addOnDrawListener(this.F);
        }
    }
}
