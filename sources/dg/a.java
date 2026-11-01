package dg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a extends g {
    public final p6 q;
    public final Paint r;
    public int s;

    public a(cg.a aVar, p6 p6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.r = paint;
        this.s = 0;
        this.q = p6Var;
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // dg.g
    public final void a() {
        super.a();
        this.s = i0.b.f(0.3f, t6.w0(t6.d6, this.q), this.m);
    }
}
