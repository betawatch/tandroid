package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import lh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Components.jj0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l2 extends o8 {
    public final wa N;
    public final int O;
    public final ef.e P;

    public l2(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        this.N = new wa(1, 15);
        this.P = new ef.e(this, 5);
        this.O = i10 == 1 ? j6.fk : j6.Mj;
    }

    @Override // org.telegram.ui.Cells.o8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        ef.e eVar = this.P;
        if (isEnabled) {
            wa waVar = this.N;
            waVar.d();
            waVar.a(canvas, j6.w0(null, this.O, false));
            lf.j.d().a(15, eVar);
        } else {
            lf.j.d().f(eVar);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.o8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lf.j.d().f(this.P);
    }

    @Override // org.telegram.ui.Cells.o8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        jj0 jj0Var = this.e;
        float width = (jj0Var.getWidth() / 2.0f) + jj0Var.getX();
        float height = ((jj0Var.getHeight() / 2.0f) + (jj0Var.getY() + jj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.N.g(rectF);
    }
}
