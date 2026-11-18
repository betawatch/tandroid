package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class h extends f {
    public final Paint q;
    public int r;
    public final i6 s;

    public h(mg.a aVar, i6 i6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.q = paint;
        this.r = 0;
        this.s = i6Var;
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
        this.r = i0.a.f(0.3f, n6.w0(n6.d6, this.s), this.m);
    }
}
