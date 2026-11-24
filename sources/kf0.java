// default package

import android.graphics.Paint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kf0 extends l46 {
    public final ylb q;
    public final Paint r;
    public int s;

    public kf0(ml1 ml1Var, ylb ylbVar) {
        super(ml1Var, false, null);
        Paint paint = new Paint();
        this.r = paint;
        this.s = 0;
        this.q = ylbVar;
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // l46
    public final void a() {
        super.a();
        this.s = on2.f(0.3f, cmb.v0(cmb.c6, this.q), this.m);
    }
}
