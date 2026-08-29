package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import jh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.aj0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n2 extends m8 {
    public final va M;
    public final int N;
    public final m2 O;

    public n2(Context context, int i10, c6 c6Var) {
        super(context, c6Var);
        this.M = new va(1, 15);
        this.O = new m2(this, 0);
        this.N = i10 == 1 ? g6.fk : g6.Mj;
    }

    @Override // org.telegram.ui.Cells.m8, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean isEnabled = LiteMode.isEnabled(131072);
        m2 m2Var = this.O;
        if (isEnabled) {
            va vaVar = this.M;
            vaVar.d();
            vaVar.a(canvas, g6.w0(null, this.N, false));
            jf.j.d().a(15, m2Var);
        } else {
            jf.j.d().f(m2Var);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.m8, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jf.j.d().f(this.O);
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        aj0 aj0Var = this.e;
        float width = (aj0Var.getWidth() / 2.0f) + aj0Var.getX();
        float height = ((aj0Var.getHeight() / 2.0f) + (aj0Var.getY() + aj0Var.getPaddingTop())) - AndroidUtilities.dp(3.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - AndroidUtilities.dp(16.0f), height - AndroidUtilities.dp(16.0f), width + AndroidUtilities.dp(16.0f), height + AndroidUtilities.dp(16.0f));
        this.M.g(rectF);
    }
}
