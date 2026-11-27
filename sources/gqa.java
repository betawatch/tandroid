// default package

import android.graphics.Paint;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
