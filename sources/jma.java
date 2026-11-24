// default package

import android.graphics.Paint;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jma extends k26 {
    public final Paint q;
    public int r;
    public final wjb s;

    public jma(ek1 ek1Var, wjb wjbVar) {
        super(ek1Var, false, null);
        Paint paint = new Paint();
        this.q = paint;
        this.r = 0;
        this.s = wjbVar;
        this.c.setStrokeWidth(gl.N(1.0f));
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // k26
    public final void a() {
        super.a();
        this.r = bm2.f(0.3f, bkb.v0(bkb.c6, this.s), this.m);
    }
}
