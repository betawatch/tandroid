package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u3 extends xs {
    public final org.telegram.ui.Components.x4 Z1;
    public int a2;
    public final org.telegram.ui.Components.g6 b2;
    public final /* synthetic */ u4 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(u4 u4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.c2 = u4Var;
        this.Z1 = new org.telegram.ui.Components.x4(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.b2 = g6Var;
        g6Var.n(0.2f, 160L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a10 = this.Z1.a(org.telegram.ui.ActionBar.k6.w0(this.a2 < 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.P5, this.c2.f), false);
        org.telegram.ui.Components.g6 g6Var = this.b2;
        g6Var.u(a10);
        g6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        g6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        org.telegram.ui.Components.g6 g6Var = this.b2;
        if (g6Var != null) {
            this.a2 = 12 - charSequence.length();
            g6Var.a();
            String str = "";
            if (this.a2 <= 4) {
                str = "" + this.a2;
            }
            g6Var.t(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b2 || super.verifyDrawable(drawable);
    }
}
