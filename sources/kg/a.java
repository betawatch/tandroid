package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class a extends f {
    public final d6 q;
    public final Paint r;
    public int s;

    public a(jg.a aVar, d6 d6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.r = paint;
        this.s = 0;
        this.q = d6Var;
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // kg.f
    public final void a() {
        super.a();
        this.s = i0.a.d(0.3f, h6.v0(h6.d6, this.q), this.m);
    }
}
