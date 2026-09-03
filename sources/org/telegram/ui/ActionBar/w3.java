package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class w3 {
    public final RectF a = new RectF();
    public final x3 b;
    public final n3 c;
    public final l3 d;
    public final Paint e;
    public final Matrix f;
    public final float[] g;
    public final float[] h;
    public float i;
    public ValueAnimator j;
    public final rc k;
    public final Paint l;
    public final RectF m;
    public final Path n;
    public final Paint o;
    public final RadialGradient p;
    public final Matrix q;
    public final Paint r;

    public w3(x3 x3Var, n3 n3Var, l3 l3Var) {
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
        this.b = x3Var;
        this.c = n3Var;
        this.d = l3Var;
        this.k = new rc(x3Var);
        paint.setColor(n3Var.p);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i, f10);
        this.j = ofFloat;
        ofFloat.addUpdateListener(new x0(this, 5));
        this.j.addListener(new a1(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            AndroidUtilities.applySpring(this.j, 285.0d, 20.0d);
        } else {
            this.j.setInterpolator(pr.h);
        }
        this.j.start();
    }
}
