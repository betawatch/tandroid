// default package

import android.graphics.Paint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class koa extends l46 {
    public final Paint q;
    public int r;
    public final ylb s;

    public koa(ml1 ml1Var, ylb ylbVar) {
        super(ml1Var, false, null);
        Paint paint = new Paint();
        this.q = paint;
        this.r = 0;
        this.s = ylbVar;
        this.c.setStrokeWidth(gm.N(1.0f));
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // l46
    public final void a() {
        super.a();
        this.r = on2.f(0.3f, cmb.v0(cmb.c6, this.s), this.m);
    }
}
