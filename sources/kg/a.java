package kg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class a extends f {
    public final e6 q;
    public final Paint r;
    public int s;

    public a(jg.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.r = paint;
        this.s = 0;
        this.q = e6Var;
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // kg.f
    public final void a() {
        super.a();
        this.s = i0.a.d(0.3f, i6.v0(i6.d6, this.q), this.m);
    }
}
