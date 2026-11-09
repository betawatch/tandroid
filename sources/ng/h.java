package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h extends f {
    public final Paint q;
    public int r;
    public final g6 s;

    public h(mg.a aVar, g6 g6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.q = paint;
        this.r = 0;
        this.s = g6Var;
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
        this.r = i0.a.f(0.3f, l6.w0(l6.d6, this.s), this.m);
    }
}
