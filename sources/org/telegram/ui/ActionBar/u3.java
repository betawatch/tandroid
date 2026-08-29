package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u3 {
    public final RectF a = new RectF();
    public final v3 b;
    public final l3 c;
    public final j3 d;
    public final Paint e;
    public final Matrix f;
    public final float[] g;
    public final float[] h;
    public float i;
    public ValueAnimator j;
    public final uc k;
    public final Paint l;
    public final RectF m;
    public final Path n;
    public final Paint o;
    public final RadialGradient p;
    public final Matrix q;
    public final Paint r;

    public u3(v3 v3Var, l3 l3Var, j3 j3Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new Matrix();
        this.g = new float[8];
        this.h = new float[8];
        this.i = 0.0f;
        this.l = new Paint(1);
        this.m = new RectF();
        this.n = new Path();
        this.o = new Paint(3);
        this.p = new RadialGradient(0.0f, 0.0f, 255.0f, new int[]{0, 805306368}, new float[]{0.5f, 1.0f}, Shader.TileMode.CLAMP);
        this.q = new Matrix();
        this.r = new Paint(1);
        this.b = v3Var;
        this.c = l3Var;
        this.d = j3Var;
        this.k = new uc(v3Var);
        paint.setColor(l3Var.p);
    }

    public final void a(float f9) {
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i, f9);
        this.j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.j.addListener(new a1(this, f9, 1));
        if (Math.abs(f9) < 0.1f) {
            AndroidUtilities.applySpring(this.j, 285.0d, 20.0d);
        } else {
            this.j.setInterpolator(jr.h);
        }
        this.j.start();
    }
}
