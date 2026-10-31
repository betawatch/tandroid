package dg;

import android.graphics.Paint;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends g {
    public final Paint q;
    public int r;
    public final p6 s;

    public i(cg.a aVar, p6 p6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.q = paint;
        this.r = 0;
        this.s = p6Var;
        this.c.setStrokeWidth(i0.N(1.0f));
        Paint paint2 = this.c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.c.setAntiAlias(false);
    }

    @Override // dg.g
    public final void a() {
        super.a();
        this.r = i0.b.f(0.3f, t6.w0(t6.d6, this.s), this.m);
    }
}
