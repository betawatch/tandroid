// default package

import android.graphics.Paint;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gqa extends o46 {
    public final Paint q;
    public int r;
    public final vnb s;

    public gqa(nk1 nk1Var, vnb vnbVar) {
        super(nk1Var, false, null);
        Paint paint = new Paint();
        this.q = paint;
        this.r = 0;
        this.s = vnbVar;
        this.c.setStrokeWidth(hl.N(1.0f));
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // o46
    public final void a() {
        super.a();
        this.r = vm2.f(0.3f, aob.v0(aob.d6, this.s), this.m);
    }
}
