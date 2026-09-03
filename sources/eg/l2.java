package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import lh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.jj0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l2 extends n8 {
    public final wa N;
    public final int O;
    public final e3.h P;

    public l2(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        this.N = new wa(1, 15);
        this.P = new e3.h(this, 6);
        this.O = i10 == 1 ? j6.fk : j6.Mj;
    }

    @Override // org.telegram.ui.Cells.n8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        e3.h hVar = this.P;
        if (isEnabled) {
            wa waVar = this.N;
            waVar.d();
            waVar.a(canvas, j6.w0(null, this.O, false));
            kf.j.d().a(15, hVar);
        } else {
            kf.j.d().f(hVar);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.n8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kf.j.d().f(this.P);
    }

    @Override // org.telegram.ui.Cells.n8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
