package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class r5 extends mt {
    public final org.telegram.ui.Components.f5 e2;
    public int f2;
    public final org.telegram.ui.Components.m6 g2;
    public final /* synthetic */ q6 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(q6 q6Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.h2 = q6Var;
        this.e2 = new org.telegram.ui.Components.f5(this);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.g2 = m6Var;
        m6Var.n(0.2f, 160L, lr.h);
        m6Var.w(org.telegram.messenger.g0.L(15.33f));
        m6Var.setCallback(this);
        m6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a10 = this.e2.a(org.telegram.ui.ActionBar.n6.w0(this.f2 < 0 ? org.telegram.ui.ActionBar.n6.p7 : org.telegram.ui.ActionBar.n6.P5, this.h2.f), false);
        org.telegram.ui.Components.m6 m6Var = this.g2;
        m6Var.u(a10);
        m6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        m6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.m6 m6Var = this.g2;
        if (m6Var != null) {
            this.f2 = 12 - charSequence.length();
            m6Var.a();
            String str = "";
            if (this.f2 <= 4) {
                str = "" + this.f2;
            }
            m6Var.t(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.g2 || super.verifyDrawable(drawable);
    }
}
