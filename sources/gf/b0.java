package gf;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b0 extends View {
    public z A;
    public final AtomicBoolean B;
    public final AtomicBoolean C;
    public final Handler D;
    public final a8.b E;
    public int a;
    public long b;
    public int c;
    public e2.f d;
    public final AtomicInteger e;
    public int f;
    public final Paint h;
    public final Paint n;
    public WindowManager r;
    public WindowManager.LayoutParams s;
    public Window v;
    public HandlerThread w;
    public y x;
    public View y;

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
        this.B = new AtomicBoolean(false);
        this.C = new AtomicBoolean(false);
        this.D = new Handler(Looper.getMainLooper());
        this.E = new a8.b(this, 21);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        for (a0 a0Var : a0.values()) {
            if (Build.VERSION.SDK_INT >= a0Var.c) {
                long metric = frameMetrics.getMetric(a0Var.a);
                a0Var.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = a0Var.e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    a0Var.e = d;
                }
            } else {
                a0Var.d = Long.MIN_VALUE;
            }
        }
    }

    public static b0 b(LaunchActivity launchActivity, org.telegram.ui.n0 n0Var) {
        b0 b0Var = new b0(launchActivity);
        b0Var.setObservedView(n0Var);
        b0Var.r = (WindowManager) launchActivity.getSystemService("window");
        b0Var.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        b0Var.s = layoutParams;
        layoutParams.gravity = 8388627;
        int dp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = b0Var.s;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        b0Var.r.addView(b0Var, b0Var.s);
        b0Var.C.set(true);
        if (b0Var.B.getAndSet(true)) {
            return b0Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        b0Var.w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(b0Var.w.getLooper());
        y yVar = new y();
        b0Var.x = yVar;
        b0Var.v.addOnFrameMetricsAvailableListener(yVar, handler);
        b0Var.d = new e2.f(b0Var, 2);
        Choreographer.getInstance().postFrameCallback(b0Var.d);
        View view = b0Var.y;
        if (view != null) {
            b0Var.A = new z(b0Var);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(b0Var.A);
            }
        }
        b0Var.D.post(b0Var.E);
        return b0Var;
    }

    public final void c() {
        y yVar;
        this.B.set(false);
        this.D.removeCallbacks(this.E);
        Window window = this.v;
        if (window != null && (yVar = this.x) != null) {
            window.removeOnFrameMetricsAvailableListener(yVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.y;
        if (view != null && this.A != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.A);
            }
            this.A = null;
        }
        HandlerThread handlerThread = this.w;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.r != null && this.C.getAndSet(false)) {
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
        b0 b0Var = this;
        float dp = AndroidUtilities.dp(8.0f);
        float dp2 = AndroidUtilities.dp(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, b0Var.getWidth() > 0 ? b0Var.getWidth() : AndroidUtilities.dp(260.0f), ((a0.values().length + 9) * dp2) + (2.0f * dp), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), b0Var.h);
        float f10 = dp + dp2;
        a0[] values = a0.values();
        int length = values.length;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        double d13 = 0.0d;
        float f11 = dp2;
        long j10 = 0;
        int i10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            float f12 = f11;
            Paint paint = b0Var.n;
            if (i10 >= length) {
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
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j10 / 1000000.0d), Double.valueOf(d16)), dp, f13, paint);
                float f14 = f13 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j16 / 1000000.0d), Double.valueOf(d15)), dp, f14, paint);
                float f15 = f14 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j15 / 1000000.0d), Double.valueOf(d14)), dp, f15, paint);
                float f16 = f15 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j14 / 1000000.0d), Double.valueOf(d10)), dp, f16, paint);
                float f17 = f16 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), dp, f17, paint);
                float f18 = f17 + f12 + f12;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.c)), dp, f18, paint);
                canvas.drawText(String.format(locale, "%-16s : %d /s", this.y != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.f)), dp, f18 + f12, paint);
                return;
            }
            int i11 = length;
            a0 a0Var = values[i10];
            int i12 = i10;
            boolean z10 = Build.VERSION.SDK_INT >= a0Var.c;
            String str = a0Var.b;
            long j17 = j13;
            if (z10) {
                long j18 = a0Var.d;
                if (j18 >= 0) {
                    format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str, Double.valueOf(j18 / 1000000.0d), Double.valueOf(a0Var.e));
                    switch (a0Var) {
                        case EF8:
                        case EF84:
                            j13 = j17 + a0Var.d;
                            d10 += a0Var.e;
                            break;
                        case EF18:
                        case EF28:
                        case EF38:
                        case EF48:
                            j10 += a0Var.d;
                            d11 += a0Var.e;
                            j13 = j17;
                            break;
                        case EF59:
                            long j19 = a0Var.d;
                            j10 += j19;
                            d = a0Var.e;
                            d11 += d;
                            j11 += j19;
                            d13 += d;
                            j13 = j17;
                            break;
                        case EF69:
                            j11 += a0Var.d;
                            d = a0Var.e;
                            d13 += d;
                            j13 = j17;
                            break;
                        case EF99:
                            j12 += a0Var.d;
                            d12 += a0Var.e;
                            j13 = j17;
                            break;
                        default:
                            j13 = j17;
                            break;
                    }
                    canvas.drawText(format, dp, f10, paint);
                    f10 += f12;
                    i10 = i12 + 1;
                    b0Var = this;
                    f11 = f12;
                    length = i11;
                }
            }
            format = String.format(Locale.US, "%-16s : n/a", str);
            j13 = j17;
            canvas.drawText(format, dp, f10, paint);
            f10 += f12;
            i10 = i12 + 1;
            b0Var = this;
            f11 = f12;
            length = i11;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), ((a0.values().length + 9) * AndroidUtilities.dp(11.0f)) + (AndroidUtilities.dp(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.y;
        if (view3 != null && this.A != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.A);
            }
            this.A = null;
        }
        this.y = view;
        if (!this.B.get() || (view2 = this.y) == null) {
            return;
        }
        this.A = new z(this);
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.addOnDrawListener(this.A);
        }
    }
}
