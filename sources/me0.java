// default package

import android.graphics.Paint;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class me0 extends o46 {
    public final vnb q;
    public final Paint r;
    public int s;

    public me0(nk1 nk1Var, vnb vnbVar) {
        super(nk1Var, false, null);
        Paint paint = new Paint();
        this.r = paint;
        this.s = 0;
        this.q = vnbVar;
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // o46
    public final void a() {
        super.a();
        this.s = vm2.f(0.3f, aob.v0(aob.d6, this.q), this.m);
    }
}
