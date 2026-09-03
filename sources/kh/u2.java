package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ut;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u2 extends ut {
    public final org.telegram.ui.Components.c5 c;
    public int d;
    public final j6 e;
    public final /* synthetic */ w3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(w3 w3Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f = w3Var;
        this.c = new org.telegram.ui.Components.c5(this);
        j6 j6Var = new j6(false, true, true, false);
        this.e = j6Var;
        j6Var.k(0.2f, 160L, mr.h);
        j6Var.t(AndroidUtilities.dp(15.33f));
        j6Var.setCallback(this);
        j6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.c.a(org.telegram.ui.ActionBar.j6.v0(this.d < 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.P5, this.f.f), false);
        j6 j6Var = this.e;
        j6Var.r(a2);
        j6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        j6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.wt, android.widget.TextView
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
