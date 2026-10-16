package lg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class a extends f {
    public final c6 q;
    public final Paint r;
    public int s;

    public a(kg.a aVar, c6 c6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.r = paint;
        this.s = 0;
        this.q = c6Var;
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // lg.f
    public final void a() {
        super.a();
        this.s = i0.a.d(0.3f, g6.w0(g6.d6, this.q), this.m);
    }
}
