package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g3 extends mt {
    public final org.telegram.ui.Components.b5 c;
    public int d;
    public final org.telegram.ui.Components.i6 e;
    public final /* synthetic */ j4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(j4 j4Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.f = j4Var;
        this.c = new org.telegram.ui.Components.b5(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.e = i6Var;
        i6Var.k(0.2f, 160L, gr.h);
        i6Var.t(AndroidUtilities.dp(15.33f));
        i6Var.setCallback(this);
        i6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.c.a(org.telegram.ui.ActionBar.f6.v0(this.d < 0 ? org.telegram.ui.ActionBar.f6.p7 : org.telegram.ui.ActionBar.f6.P5, this.f.f), false);
        org.telegram.ui.Components.i6 i6Var = this.e;
        i6Var.r(a2);
        i6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        i6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        org.telegram.ui.Components.i6 i6Var = this.e;
        if (i6Var != null) {
            this.d = 12 - charSequence.length();
            i6Var.b();
            String str = "";
            if (this.d <= 4) {
                str = "" + this.d;
            }
            i6Var.q(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }
}
