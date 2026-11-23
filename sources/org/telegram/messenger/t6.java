package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class t6 extends org.telegram.ui.Components.ot {
    public final org.telegram.ui.Components.g5 e2;
    public int f2;
    public final org.telegram.ui.Components.n6 g2;
    public final /* synthetic */ int h2;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, org.telegram.ui.ActionBar.h6 h6Var2) {
        super(context, h6Var);
        this.h2 = i7;
        this.i2 = h6Var2;
        this.e2 = new org.telegram.ui.Components.g5(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.g2 = n6Var;
        n6Var.n(0.2f, 160L, org.telegram.ui.Components.nr.h);
        n6Var.w(g0.L(15.33f));
        n6Var.setCallback(this);
        n6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a10 = this.e2.a(org.telegram.ui.ActionBar.m6.w0(this.f2 < 0 ? org.telegram.ui.ActionBar.m6.p7 : org.telegram.ui.ActionBar.m6.P5, this.i2), false);
        org.telegram.ui.Components.n6 n6Var = this.g2;
        n6Var.u(a10);
        n6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        n6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.N0(2131753668, null));
        spannableStringBuilder.setSpan(new l41(g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.N0(2131748894, null));
        spannableStringBuilder2.setSpan(new l41(g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_link, 8, hd.N0(2131751732, null));
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, hd.N0(2131746141, null));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.rt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.n6 n6Var = this.g2;
        if (n6Var != null) {
            this.f2 = this.h2 - charSequence.length();
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
