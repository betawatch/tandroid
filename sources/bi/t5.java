package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ot;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t5 extends ot {
    public final org.telegram.ui.Components.g5 e2;
    public int f2;
    public final org.telegram.ui.Components.n6 g2;
    public final /* synthetic */ s6 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(s6 s6Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.h2 = s6Var;
        this.e2 = new org.telegram.ui.Components.g5(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.g2 = n6Var;
        n6Var.n(0.2f, 160L, nr.h);
        n6Var.w(org.telegram.messenger.g0.L(15.33f));
        n6Var.setCallback(this);
        n6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a10 = this.e2.a(org.telegram.ui.ActionBar.m6.w0(this.f2 < 0 ? org.telegram.ui.ActionBar.m6.p7 : org.telegram.ui.ActionBar.m6.P5, this.h2.f), false);
        org.telegram.ui.Components.n6 n6Var = this.g2;
        n6Var.u(a10);
        n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        n6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.rt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.n6 n6Var = this.g2;
        if (n6Var != null) {
            this.f2 = 12 - charSequence.length();
            n6Var.a();
            String str = "";
            if (this.f2 <= 4) {
                str = "" + this.f2;
            }
            n6Var.t(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.g2 || super.verifyDrawable(drawable);
    }
}
