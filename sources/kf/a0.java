package kf;

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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a0 extends View {
    public y B;
    public final AtomicBoolean C;
    public final AtomicBoolean D;
    public final Handler E;
    public final androidx.activity.i F;
    public int a;
    public long b;
    public int c;
    public bf.b d;
    public final AtomicInteger e;
    public int f;
    public final Paint h;
    public final Paint n;
    public WindowManager r;
    public WindowManager.LayoutParams s;
    public Window v;
    public HandlerThread w;
    public x x;
    public View y;

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
        this.C = new AtomicBoolean(false);
        this.D = new AtomicBoolean(false);
        this.E = new Handler(Looper.getMainLooper());
        this.F = new androidx.activity.i(this, 26);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
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

    public static a0 b(LaunchActivity launchActivity, org.telegram.ui.n0 n0Var) {
        a0 a0Var = new a0(launchActivity);
        a0Var.setObservedView(n0Var);
        a0Var.r = (WindowManager) launchActivity.getSystemService("window");
        a0Var.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        a0Var.s = layoutParams;
        layoutParams.gravity = 8388627;
        int dp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = a0Var.s;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        a0Var.r.addView(a0Var, a0Var.s);
        a0Var.D.set(true);
        if (a0Var.C.getAndSet(true)) {
            return a0Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        a0Var.w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(a0Var.w.getLooper());
        x xVar = new x();
        a0Var.x = xVar;
        a0Var.v.addOnFrameMetricsAvailableListener(xVar, handler);
        a0Var.d = new bf.b(a0Var, 3);
        Choreographer.getInstance().postFrameCallback(a0Var.d);
        View view = a0Var.y;
        if (view != null) {
            a0Var.B = new y(a0Var);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(a0Var.B);
            }
        }
        a0Var.E.post(a0Var.F);
        return a0Var;
    }

    public final void c() {
        x xVar;
        this.C.set(false);
        this.E.removeCallbacks(this.F);
        Window window = this.v;
        if (window != null && (xVar = this.x) != null) {
            window.removeOnFrameMetricsAvailableListener(xVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.y;
        if (view != null && this.B != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.B);
            }
            this.B = null;
        }
        HandlerThread handlerThread = this.w;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.r != null && this.D.getAndSet(false)) {
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
        a0 a0Var = this;
        float dp = AndroidUtilities.dp(8.0f);
        float dp2 = AndroidUtilities.dp(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, a0Var.getWidth() > 0 ? a0Var.getWidth() : AndroidUtilities.dp(260.0f), ((z.values().length + 9) * dp2) + (2.0f * dp), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), a0Var.h);
        float f10 = dp + dp2;
        z[] values = z.values();
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
            Paint paint = a0Var.n;
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
            z zVar = values[i10];
            int i12 = i10;
            boolean z4 = Build.VERSION.SDK_INT >= zVar.c;
            String str = zVar.b;
            long j17 = j13;
            if (z4) {
                long j18 = zVar.d;
                if (j18 >= 0) {
                    format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str, Double.valueOf(j18 / 1000000.0d), Double.valueOf(zVar.e));
                    switch (zVar) {
                        case EF8:
                        case EF84:
                            j13 = j17 + zVar.d;
                            d10 += zVar.e;
                            break;
                        case EF18:
                        case EF28:
                        case EF38:
                        case EF48:
                            j10 += zVar.d;
                            d11 += zVar.e;
                            j13 = j17;
                            break;
                        case EF59:
                            long j19 = zVar.d;
                            j10 += j19;
                            d = zVar.e;
                            d11 += d;
                            j11 += j19;
                            d13 += d;
                            j13 = j17;
                            break;
                        case EF69:
                            j11 += zVar.d;
                            d = zVar.e;
                            d13 += d;
                            j13 = j17;
                            break;
                        case EF99:
                            j12 += zVar.d;
                            d12 += zVar.e;
                            j13 = j17;
                            break;
                        default:
                            j13 = j17;
                            break;
                    }
                    canvas.drawText(format, dp, f10, paint);
                    f10 += f12;
                    i10 = i12 + 1;
                    a0Var = this;
                    f11 = f12;
                    length = i11;
                }
            }
            format = String.format(Locale.US, "%-16s : n/a", str);
            j13 = j17;
            canvas.drawText(format, dp, f10, paint);
            f10 += f12;
            i10 = i12 + 1;
            a0Var = this;
            f11 = f12;
            length = i11;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), ((z.values().length + 9) * AndroidUtilities.dp(11.0f)) + (AndroidUtilities.dp(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.y;
        if (view3 != null && this.B != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.B);
            }
            this.B = null;
        }
        this.y = view;
        if (!this.C.get() || (view2 = this.y) == null) {
            return;
        }
        this.B = new y(this);
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.addOnDrawListener(this.B);
        }
    }
}
