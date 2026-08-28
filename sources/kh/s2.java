package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public static int f(float f10) {
        return f10 < 0.5f ? i0.a.d(Utilities.clamp(f10 / 0.5f, 1.0f, 0.0f), -7544833, -1) : i0.a.d(Utilities.clamp((f10 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
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

    public final void c(qa qaVar) {
        h(this.p);
        e(1.0f, 320L, qaVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i = null;
        }
        if (j10 <= 0) {
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
        ofFloat.addUpdateListener(new bg.b(this, 27));
        this.i.addListener(new gh.o5(this, f10, runnable, 2));
        this.i.setDuration(j10);
        this.i.setInterpolator(gr.i);
        this.i.start();
    }

    public final void g() {
        int i9 = this.l;
        int i10 = this.n;
        p2 p2Var = this.b;
        if (i9 == i10 && this.j == p2Var.getMeasuredWidth() && this.k == p2Var.getMeasuredHeight() && Math.abs(this.m - this.h) <= 0.005f) {
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
            float f10 = this.j * 0.5f;
            float f11 = this.k * 0.4f;
            float min = (2.0f - this.h) * (Math.min(r1, r11) / 2.0f) * 1.35f;
            ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
            long[] jArr = {Color.valueOf(Color.red(this.n) / 255.0f, Color.green(this.n) / 255.0f, Color.blue(this.n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.n) / 255.0f, Color.green(this.n) / 255.0f, Color.blue(this.n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()};
            float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.r = android.support.v4.media.session.z.b(f10, f11, min, jArr, fArr);
        } else {
            this.r = new RadialGradient(this.j * 0.5f, this.k * 0.4f, (2.0f - this.h) * (Math.min(r1, r11) / 2.0f) * 1.35f, new int[]{i0.a.k(this.n, 0), this.n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
        }
        this.s.setShader(this.r);
        p2Var.invalidate();
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
        Activity findActivity = AndroidUtilities.findActivity(this.a);
        if (findActivity == null) {
            findActivity = LaunchActivity.C1;
        }
        if (findActivity == null || findActivity.isFinishing() || (window = findActivity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f10;
        window.setAttributes(attributes);
    }

    public final void i() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i9 >= arrayList.size()) {
                this.s.setAlpha((int) (this.p * 255.0f * this.h));
                this.b.invalidate();
                this.c.invalidate();
                return;
            }
            ((r2) arrayList.get(i9)).setInvert(this.h);
            ((r2) arrayList.get(i9)).invalidate();
            i9++;
        }
    }
}
