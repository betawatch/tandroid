// default package

import android.graphics.Paint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ke0 extends k26 {
    public final wjb q;
    public final Paint r;
    public int s;

    public ke0(ek1 ek1Var, wjb wjbVar) {
        super(ek1Var, false, null);
        Paint paint = new Paint();
        this.r = paint;
        this.s = 0;
        this.q = wjbVar;
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // k26
    public final void a() {
        super.a();
        this.s = bm2.f(0.3f, bkb.v0(bkb.c6, this.q), this.m);
    }
}
