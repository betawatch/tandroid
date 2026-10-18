package ei;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class s2 {
    public final Context a;
    public final p2 b;
    public final p2 c;
    public final WindowManager e;
    public final View f;
    public final WindowManager.LayoutParams g;
    public ValueAnimator i;
    public int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public RadialGradient r;
    public final Paint s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float o = 0.75f;
    public float p = 1.0f;
    public final Matrix q = new Matrix();

    public s2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.s = paint;
        this.a = context;
        this.e = windowManager;
        this.f = view;
        this.g = layoutParams;
        this.b = new p2(this, context, 0);
        this.c = new p2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f7) {
        return f7 < 0.5f ? i0.a.f(Utilities.clamp(f7 / 0.5f, 1.0f, 0.0f), -7544833, -1) : i0.a.f(Utilities.clamp((f7 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(r2 r2Var) {
        r2Var.setInvert(this.h);
        this.d.add(r2Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.r != null) {
            g();
            this.r.setLocalMatrix(this.q);
            Paint paint = this.s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.j, this.k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            p2 p2Var = this.c;
            rectF.set(0.0f, 0.0f, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(pa paVar) {
        h(this.p);
        e(1.0f, 320L, paVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i = null;
        }
        if (j10 <= 0) {
            this.h = f7;
            i();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.i = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 25));
        this.i.addListener(new ai.o7(this, f7, runnable, 2));
        this.i.setDuration(j10);
        this.i.setInterpolator(bs.i);
        this.i.start();
    }

    public final void g() {
        int i10 = this.l;
        int i11 = this.n;
        p2 p2Var = this.b;
        if (i10 == i11 && this.j == p2Var.getMeasuredWidth() && this.k == p2Var.getMeasuredHeight() && Math.abs(this.m - this.h) <= 0.005f) {
            return;
        }
        this.l = this.n;
        this.j = p2Var.getMeasuredWidth();
        int measuredHeight = p2Var.getMeasuredHeight();
        this.k = measuredHeight;
        this.m = this.h;
        if (this.j <= 0 || measuredHeight <= 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            float f7 = this.j * 0.5f;
            float f10 = this.k * 0.4f;
            float min = (2.0f - this.h) * (Math.min(r1, r11) / 2.0f) * 1.35f;
            ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
            long[] jArr = {Color.valueOf(Color.red(this.n) / 255.0f, Color.green(this.n) / 255.0f, Color.blue(this.n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.n) / 255.0f, Color.green(this.n) / 255.0f, Color.blue(this.n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()};
            float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.r = android.support.v4.media.session.x.b(f7, f10, min, jArr, fArr);
        } else {
            this.r = new RadialGradient(this.j * 0.5f, this.k * 0.4f, (2.0f - this.h) * (Math.min(r1, r11) / 2.0f) * 1.35f, new int[]{i0.a.o(this.n, 0), this.n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
        }
        this.s.setShader(this.r);
        p2Var.invalidate();
        this.c.invalidate();
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f;
        if (view != null && (layoutParams = this.g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.a);
        if (findActivity == null) {
            findActivity = LaunchActivity.H1;
        }
        if (findActivity == null || findActivity.isFinishing() || (window = findActivity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f7;
        window.setAttributes(attributes);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                this.s.setAlpha((int) (this.p * 255.0f * this.h));
                this.b.invalidate();
                this.c.invalidate();
                return;
            }
            ((r2) arrayList.get(i10)).setInvert(this.h);
            ((r2) arrayList.get(i10)).invalidate();
            i10++;
        }
    }
}
