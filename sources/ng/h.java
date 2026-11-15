package ng;

import android.graphics.Paint;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class h extends f {
    public final Paint q;
    public int r;
    public final e6 s;

    public h(mg.a aVar, e6 e6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.q = paint;
        this.r = 0;
        this.s = e6Var;
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
        this.r = i0.a.f(0.3f, j6.w0(j6.d6, this.s), this.m);
    }
}
