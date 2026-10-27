package mg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a extends f {
    public final u6 q;
    public final Paint r;
    public int s;

    public a(lg.a aVar, u6 u6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.r = paint;
        this.s = 0;
        this.q = u6Var;
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // mg.f
    public final void a() {
        super.a();
        this.s = i0.a.f(0.3f, y6.w0(y6.d6, this.q), this.m);
    }
}
