package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xt;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class u2 extends xt {
    public final org.telegram.ui.Components.c5 c;
    public int d;
    public final j6 e;
    public final /* synthetic */ x3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(x3 x3Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.f = x3Var;
        this.c = new org.telegram.ui.Components.c5(this);
        j6 j6Var = new j6(false, true, true, false);
        this.e = j6Var;
        j6Var.k(0.2f, 160L, pr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.setCallback(this);
        j6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.c.a(k6.v0(this.d < 0 ? k6.p7 : k6.P5, this.f.f), false);
        j6 j6Var = this.e;
        j6Var.r(a2);
        j6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        j6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.zt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        j6 j6Var = this.e;
        if (j6Var != null) {
            this.d = 12 - charSequence.length();
            j6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            j6Var.q(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }
}
