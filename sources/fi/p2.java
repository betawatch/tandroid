package fi;

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
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class p2 {
    public final Context a;
    public final m2 b;
    public final m2 c;
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

    public p2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.s = paint;
        this.a = context;
        this.e = windowManager;
        this.f = view;
        this.g = layoutParams;
        this.b = new m2(this, context, 0);
        this.c = new m2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f10) {
        return f10 < 0.5f ? i0.a.f(Utilities.i(f10 / 0.5f, 1.0f, 0.0f), -7544833, -1) : i0.a.f(Utilities.i((f10 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(o2 o2Var) {
        o2Var.setInvert(this.h);
        this.d.add(o2Var);
    }

    public final void b(Canvas canvas, boolean z9) {
        if (this.r != null) {
            g();
            this.r.setLocalMatrix(this.q);
            Paint paint = this.s;
            if (z9) {
                canvas.drawRect(0.0f, 0.0f, this.j, this.k, paint);
                return;
            }
            RectF rectF = org.telegram.messenger.g0.P;
            m2 m2Var = this.c;
            rectF.set(0.0f, 0.0f, m2Var.getMeasuredWidth(), m2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) - 2, org.telegram.messenger.g0.L(12.0f) - 2, paint);
        }
    }

    public final void c(r9 r9Var) {
        h(this.p);
        e(1.0f, 320L, r9Var);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i = null;
        }
        if (j3 <= 0) {
            this.h = f10;
            i();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.i = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 27));
        this.i.addListener(new bi.o7(this, f10, runnable, 2));
        this.i.setDuration(j3);
        this.i.setInterpolator(xq.i);
        this.i.start();
    }

    public final void g() {
        int i7 = this.l;
        int i10 = this.n;
        m2 m2Var = this.b;
        if (i7 == i10 && this.j == m2Var.getMeasuredWidth() && this.k == m2Var.getMeasuredHeight() && Math.abs(this.m - this.h) <= 0.005f) {
            return;
        }
        this.l = this.n;
        this.j = m2Var.getMeasuredWidth();
        int measuredHeight = m2Var.getMeasuredHeight();
        this.k = measuredHeight;
        this.m = this.h;
        if (this.j <= 0 || measuredHeight <= 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            float f10 = this.j * 0.5f;
            float f11 = this.k * 0.4f;
            float min = (2.0f - this.h) * (Math.min(r1, r11) / 2.0f) * 1.35f;
            ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
            long[] jArr = {Color.valueOf(Color.red(this.n) / 255.0f, Color.green(this.n) / 255.0f, Color.blue(this.n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.n) / 255.0f, Color.green(this.n) / 255.0f, Color.blue(this.n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()};
            float[] fArr = {org.telegram.messenger.g0.T1(0.9f, 0.22f, this.h), 1.0f};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.r = android.support.v4.media.session.w.b(f10, f11, min, jArr, fArr);
        } else {
            this.r = new RadialGradient(this.j * 0.5f, this.k * 0.4f, (2.0f - this.h) * (Math.min(r1, r11) / 2.0f) * 1.35f, new int[]{i0.a.o(this.n, 0), this.n}, new float[]{org.telegram.messenger.g0.T1(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
        }
        this.s.setShader(this.r);
        m2Var.invalidate();
        this.c.invalidate();
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f;
        if (view != null && (layoutParams = this.g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity W = org.telegram.messenger.g0.W(this.a);
        if (W == null) {
            W = LaunchActivity.G1;
        }
        if (W == null || W.isFinishing() || (window = W.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f10;
        window.setAttributes(attributes);
    }

    public final void i() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
                this.s.setAlpha((int) (this.p * 255.0f * this.h));
                this.b.invalidate();
                this.c.invalidate();
                return;
            }
            ((o2) arrayList.get(i7)).setInvert(this.h);
            ((o2) arrayList.get(i7)).invalidate();
            i7++;
        }
    }
}
