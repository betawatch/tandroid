package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i3 extends mt {
    public final /* synthetic */ int e2;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 f2;
    public final /* synthetic */ boolean g2;
    public final /* synthetic */ k3 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(k3 k3Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7, org.telegram.ui.ActionBar.i6 i6Var2, boolean z10) {
        super(context, i6Var);
        this.h2 = k3Var;
        this.e2 = i7;
        this.f2 = i6Var2;
        this.g2 = z10;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        k3 k3Var = this.h2;
        k3Var.y.u(k3Var.w.a(org.telegram.ui.ActionBar.n6.w0(k3Var.x <= 0 ? org.telegram.ui.ActionBar.n6.p7 : org.telegram.ui.ActionBar.n6.P5, this.f2), false));
        k3Var.y.setBounds(getScrollX(), getHeight() - Math.min(org.telegram.messenger.g0.L(52.0f), getHeight()), org.telegram.messenger.g0.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        k3Var.y.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (this.g2 && menu.findItem(R.id.menu_bold) == null) {
            menu.removeItem(android.R.id.shareText);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131753669, null));
            spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.M0(2131748895, null));
            spannableStringBuilder2.setSpan(new i41(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(gd.M0(2131744202, null));
            dz0 dz0Var = new dz0();
            dz0Var.a |= 8;
            spannableStringBuilder3.setSpan(new ez0(dz0Var, 0), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 8, spannableStringBuilder3);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, gd.M0(2131746142, null));
        }
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        k3 k3Var = this.h2;
        org.telegram.ui.Components.m6 m6Var = k3Var.y;
        if (m6Var == null || this.e2 <= 0) {
            return;
        }
        m6Var.a();
        k3Var.c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.h2.y || super.verifyDrawable(drawable);
    }
}
