package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i3 {
    public final RectF a = new RectF();
    public final j3 b;
    public final b3 c;
    public final z2 d;
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

    public i3(j3 j3Var, b3 b3Var, z2 z2Var) {
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
        this.b = j3Var;
        this.c = b3Var;
        this.d = z2Var;
        this.k = new dc(j3Var);
        paint.setColor(b3Var.r);
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.i, f10);
        this.j = ofFloat;
        ofFloat.addUpdateListener(new hi.j3(this, 15));
        this.j.addListener(new t0(this, f10, 1));
        if (Math.abs(f10) < 0.1f) {
            org.telegram.messenger.g0.n(this.j, 285.0d, 20.0d);
        } else {
            this.j.setInterpolator(er.h);
        }
        this.j.start();
    }
}
