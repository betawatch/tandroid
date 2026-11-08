package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h extends f {
    public final Paint q;
    public int r;
    public final f6 s;

    public h(mg.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.q = paint;
        this.r = 0;
        this.s = f6Var;
        this.c.setStrokeWidth(g0.N(1.0f));
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // ng.f
    public final void a() {
        super.a();
        this.r = i0.a.f(0.3f, k6.w0(k6.d6, this.s), this.m);
    }
}
