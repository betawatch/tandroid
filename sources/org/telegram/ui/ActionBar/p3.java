package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p3 {
    public final RectF a = new RectF();
    public final q3 b;
    public final h3 c;
    public final f3 d;
    public final Paint e;
    public final Matrix f;
    public final float[] g;
    public final float[] h;
    public float i;
    public ValueAnimator j;
    public final dc k;
    public final Paint l;
    public final RectF m;
    public final Path n;
    public final Paint o;
    public final RadialGradient p;
    public final Matrix q;
    public final Paint r;

    public p3(q3 q3Var, h3 h3Var, f3 f3Var) {
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
        this.b = q3Var;
        this.c = h3Var;
        this.d = f3Var;
        this.k = new dc(q3Var);
        paint.setColor(h3Var.r);
    }

    public final void a(float f7) {
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i, f7);
        this.j = ofFloat;
        ofFloat.addUpdateListener(new bg.k(this, 19));
        this.j.addListener(new v0(this, f7, 1));
        if (Math.abs(f7) < 0.1f) {
            org.telegram.messenger.i0.n(this.j, 285.0d, 20.0d);
        } else {
            this.j.setInterpolator(gr.h);
        }
        this.j.start();
    }
}
