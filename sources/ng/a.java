package ng;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a extends f {
    public final f6 q;
    public final Paint r;
    public int s;

    public a(mg.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.r = paint;
        this.s = 0;
        this.q = f6Var;
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // ng.f
    public final void a() {
        super.a();
        this.s = i0.a.f(0.3f, k6.w0(k6.d6, this.q), this.m);
    }
}
