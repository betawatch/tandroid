package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.x41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w6 extends org.telegram.ui.Components.mt {
    public final org.telegram.ui.Components.w4 Y1;
    public int Z1;
    public final org.telegram.ui.Components.e6 a2;
    public final /* synthetic */ int b2;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, org.telegram.ui.ActionBar.p6 p6Var2) {
        super(context, p6Var);
        this.b2 = i10;
        this.c2 = p6Var2;
        this.Y1 = new org.telegram.ui.Components.w4(this);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.a2 = e6Var;
        e6Var.n(0.2f, 160L, org.telegram.ui.Components.gr.h);
        e6Var.w(i0.L(15.33f));
        e6Var.setCallback(this);
        e6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.Y1.a(org.telegram.ui.ActionBar.t6.w0(this.Z1 < 0 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.P5, this.c2), false);
        org.telegram.ui.Components.e6 e6Var = this.a2;
        e6Var.u(a2);
        e6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        e6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131753671, null));
        spannableStringBuilder.setSpan(new x41(i0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(cd.L0(2131749097, null));
        spannableStringBuilder2.setSpan(new x41(i0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_link, 8, cd.L0(2131751745, null));
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, cd.L0(2131746352, null));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        org.telegram.ui.Components.e6 e6Var = this.a2;
        if (e6Var != null) {
            this.Z1 = this.b2 - charSequence.length();
            e6Var.a();
            String str = "";
            if (this.Z1 <= 4) {
                str = "" + this.Z1;
            }
            e6Var.t(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a2 || super.verifyDrawable(drawable);
    }
}
