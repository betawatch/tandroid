package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.ei0;
import rh.s8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b2 extends p8 {
    public final s8 W;
    public final int a0;
    public final gg.c b0;

    public b2(int i10, Context context, p6 p6Var) {
        super(context, p6Var);
        this.W = new s8(1, 15);
        this.b0 = new gg.c(this, 26);
        this.a0 = i10 == 1 ? t6.Tk : t6.Ak;
    }

    @Override // org.telegram.ui.Cells.p8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean e = sc.e(131072);
        gg.c cVar = this.b0;
        if (e) {
            s8 s8Var = this.W;
            s8Var.d();
            s8Var.a(canvas, t6.x0(null, this.a0, false));
            rf.g.d().a(15, cVar);
        } else {
            rf.g.d().f(cVar);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.p8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rf.g.d().f(this.b0);
    }

    @Override // org.telegram.ui.Cells.p8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ei0 ei0Var = this.e;
        float width = (ei0Var.getWidth() / 2.0f) + ei0Var.getX();
        float height = ((ei0Var.getHeight() / 2.0f) + (ei0Var.getY() + ei0Var.getPaddingTop())) - org.telegram.messenger.i0.L(3.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(width - org.telegram.messenger.i0.L(16.0f), height - org.telegram.messenger.i0.L(16.0f), width + org.telegram.messenger.i0.L(16.0f), height + org.telegram.messenger.i0.L(16.0f));
        this.W.g(rectF);
    }
}
