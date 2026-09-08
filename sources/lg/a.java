package lg;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a extends f {
    public final f6 q;
    public final Paint r;
    public int s;

    public a(kg.a aVar, f6 f6Var) {
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

    @Override // lg.f
    public final void a() {
        super.a();
        this.s = i0.a.d(0.3f, j6.v0(j6.d6, this.q), this.m);
    }
}
