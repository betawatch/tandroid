package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.u31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class t6 extends org.telegram.ui.Components.ys {
    public final org.telegram.ui.Components.y4 Y1;
    public int Z1;
    public final org.telegram.ui.Components.h6 a2;
    public final /* synthetic */ int b2;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7, org.telegram.ui.ActionBar.h6 h6Var2) {
        super(context, h6Var);
        this.b2 = i7;
        this.c2 = h6Var2;
        this.Y1 = new org.telegram.ui.Components.y4(this);
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(false, true, true);
        this.a2 = h6Var3;
        h6Var3.n(0.2f, 160L, org.telegram.ui.Components.wq.h);
        h6Var3.w(g0.L(15.33f));
        h6Var3.setCallback(this);
        h6Var3.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a10 = this.Y1.a(org.telegram.ui.ActionBar.m6.w0(this.Z1 < 0 ? org.telegram.ui.ActionBar.m6.p7 : org.telegram.ui.ActionBar.m6.P5, this.c2), false);
        org.telegram.ui.Components.h6 h6Var = this.a2;
        h6Var.u(a10);
        h6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        h6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131753671, null));
        spannableStringBuilder.setSpan(new u31(g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(id.M0(2131749087, null));
        spannableStringBuilder2.setSpan(new u31(g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_link, 8, id.M0(2131751744, null));
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, id.M0(2131746337, null));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ct, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        org.telegram.ui.Components.h6 h6Var = this.a2;
        if (h6Var != null) {
            this.Z1 = this.b2 - charSequence.length();
            h6Var.a();
            String str = "";
            if (this.Z1 <= 4) {
                str = "" + this.Z1;
            }
            h6Var.t(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a2 || super.verifyDrawable(drawable);
    }
}
