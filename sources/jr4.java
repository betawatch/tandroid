// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jr4 extends View {
    public View E;
    public hr4 F;
    public final AtomicBoolean G;
    public final AtomicBoolean H;
    public final Handler I;
    public final o04 J;
    public int a;
    public long b;
    public int c;
    public gr4 d;
    public final AtomicInteger e;
    public int f;
    public final Paint h;
    public final Paint n;
    public WindowManager r;
    public WindowManager.LayoutParams s;
    public Window w;
    public HandlerThread x;
    public fr4 y;

    public jr4(LaunchActivity launchActivity) {
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
        this.J = new o04(this, (byte) 9);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(gm.L(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(gm.n1("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static jr4 a(LaunchActivity launchActivity, yd ydVar) {
        jr4 jr4Var = new jr4(launchActivity);
        jr4Var.setObservedView(ydVar);
        jr4Var.r = (WindowManager) launchActivity.getSystemService("window");
        jr4Var.w = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        jr4Var.s = layoutParams;
        layoutParams.gravity = 8388627;
        int L = gm.L(12.0f);
        WindowManager.LayoutParams layoutParams2 = jr4Var.s;
        layoutParams2.x = L;
        layoutParams2.y = L;
        layoutParams2.width = gm.L(260.0f);
        jr4Var.r.addView(jr4Var, jr4Var.s);
        jr4Var.H.set(true);
        if (jr4Var.G.getAndSet(true)) {
            return jr4Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        jr4Var.x = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(jr4Var.x.getLooper());
        fr4 fr4Var = new fr4();
        jr4Var.y = fr4Var;
        jr4Var.w.addOnFrameMetricsAvailableListener(fr4Var, handler);
        byte b = 0;
        jr4Var.d = new gr4(jr4Var, b);
        Choreographer.getInstance().postFrameCallback(jr4Var.d);
        View view = jr4Var.E;
        if (view != null) {
            jr4Var.F = new hr4(jr4Var, b);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(jr4Var.F);
            }
        }
        jr4Var.I.post(jr4Var.J);
        return jr4Var;
    }

    public static void c(FrameMetrics frameMetrics) {
        for (ir4 ir4Var : ir4.values()) {
            if (Build.VERSION.SDK_INT >= ir4Var.c) {
                long metric = frameMetrics.getMetric(ir4Var.a);
                ir4Var.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d2 = ir4Var.e;
                    if (d2 != 0.0d) {
                        d = ((d - d2) * 0.05d) + d2;
                    }
                    ir4Var.e = d;
                }
            } else {
                ir4Var.d = Long.MIN_VALUE;
            }
        }
    }

    public final void b() {
        fr4 fr4Var;
        this.G.set(false);
        this.I.removeCallbacks(this.J);
        Window window = this.w;
        if (window != null && (fr4Var = this.y) != null) {
            window.removeOnFrameMetricsAvailableListener(fr4Var);
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
        jr4 jr4Var = this;
        float L = gm.L(8.0f);
        float L2 = gm.L(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, jr4Var.getWidth() > 0 ? jr4Var.getWidth() : gm.L(260.0f), ((ir4.values().length + 9) * L2) + (2.0f * L), gm.L(10.0f), gm.L(10.0f), jr4Var.h);
        float f = L + L2;
        ir4[] values = ir4.values();
        int length = values.length;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        float f2 = L2;
        long j = 0;
        int i = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (true) {
            float f3 = f2;
            Paint paint = jr4Var.n;
            if (i >= length) {
                long j5 = j4;
                long max = Math.max(j, Math.max(j2, j3));
                double d6 = d4;
                long j6 = j3;
                double d7 = d5;
                long j7 = j2;
                double d8 = d3;
                double max2 = Math.max(d8, Math.max(d7, d6));
                float f4 = f + f3;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j / 1000000.0d), Double.valueOf(d8)), L, f4, paint);
                float f5 = f4 + f3;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j7 / 1000000.0d), Double.valueOf(d7)), L, f5, paint);
                float f6 = f5 + f3;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j6 / 1000000.0d), Double.valueOf(d6)), L, f6, paint);
                float f7 = f6 + f3;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j5 / 1000000.0d), Double.valueOf(d2)), L, f7, paint);
                float f8 = f7 + f3;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), L, f8, paint);
                float f9 = f8 + f3 + f3;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.c)), L, f9, paint);
                canvas.drawText(String.format(locale, "%-16s : %d /s", this.E != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.f)), L, f9 + f3, paint);
                return;
            }
            int i2 = length;
            ir4 ir4Var = values[i];
            int i3 = i;
            boolean z = Build.VERSION.SDK_INT >= ir4Var.c;
            String str = ir4Var.b;
            long j8 = j4;
            if (z) {
                long j9 = ir4Var.d;
                if (j9 >= 0) {
                    format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str, Double.valueOf(j9 / 1000000.0d), Double.valueOf(ir4Var.e));
                    switch (ir4Var.ordinal()) {
                        case 0:
                        case 7:
                            j4 = j8 + ir4Var.d;
                            d2 += ir4Var.e;
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            j += ir4Var.d;
                            d3 += ir4Var.e;
                            j4 = j8;
                            break;
                        case 5:
                            long j10 = ir4Var.d;
                            j += j10;
                            d = ir4Var.e;
                            d3 += d;
                            j2 += j10;
                            d5 += d;
                            j4 = j8;
                            break;
                        case 6:
                            j2 += ir4Var.d;
                            d = ir4Var.e;
                            d5 += d;
                            j4 = j8;
                            break;
                        case 8:
                            j3 += ir4Var.d;
                            d4 += ir4Var.e;
                            j4 = j8;
                            break;
                        default:
                            j4 = j8;
                            break;
                    }
                    canvas.drawText(format, L, f, paint);
                    f += f3;
                    i = i3 + 1;
                    jr4Var = this;
                    f2 = f3;
                    length = i2;
                }
            }
            format = String.format(Locale.US, "%-16s : n/a", str);
            j4 = j8;
            canvas.drawText(format, L, f, paint);
            f += f3;
            i = i3 + 1;
            jr4Var = this;
            f2 = f3;
            length = i2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gm.L(210.0f), ((ir4.values().length + 9) * gm.L(11.0f)) + (gm.L(8.0f) << 1));
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
        this.F = new hr4(this, (byte) 0);
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.addOnDrawListener(this.F);
        }
    }
}
