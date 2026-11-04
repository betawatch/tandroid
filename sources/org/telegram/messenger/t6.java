package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.o31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t6 extends org.telegram.ui.Components.xs {
    public final org.telegram.ui.Components.x4 Z1;
    public int a2;
    public final org.telegram.ui.Components.g6 b2;
    public final /* synthetic */ int c2;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3, org.telegram.ui.ActionBar.e6 e6Var2) {
        super(context, e6Var);
        this.c2 = i3;
        this.d2 = e6Var2;
        this.Z1 = new org.telegram.ui.Components.x4(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.b2 = g6Var;
        g6Var.n(0.2f, 160L, org.telegram.ui.Components.xq.h);
        g6Var.w(g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a10 = this.Z1.a(org.telegram.ui.ActionBar.k6.w0(this.a2 < 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.P5, this.d2), false);
        org.telegram.ui.Components.g6 g6Var = this.b2;
        g6Var.u(a10);
        g6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        g6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new o31(g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bd.M0(2131749095, null));
        spannableStringBuilder2.setSpan(new o31(g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_link, 8, bd.M0(2131751745, null));
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, bd.M0(2131746345, null));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        org.telegram.ui.Components.g6 g6Var = this.b2;
        if (g6Var != null) {
            this.a2 = this.c2 - charSequence.length();
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
