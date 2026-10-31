package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k3 extends mt {
    public final /* synthetic */ int Y1;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 Z1;
    public final /* synthetic */ boolean a2;
    public final /* synthetic */ m3 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(m3 m3Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, org.telegram.ui.ActionBar.p6 p6Var2, boolean z10) {
        super(context, p6Var);
        this.b2 = m3Var;
        this.Y1 = i10;
        this.Z1 = p6Var2;
        this.a2 = z10;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m3 m3Var = this.b2;
        m3Var.y.u(m3Var.w.a(org.telegram.ui.ActionBar.t6.w0(m3Var.x <= 0 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.P5, this.Z1), false));
        m3Var.y.setBounds(getScrollX(), getHeight() - Math.min(org.telegram.messenger.i0.L(52.0f), getHeight()), org.telegram.messenger.i0.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        m3Var.y.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (this.a2 && menu.findItem(R.id.menu_bold) == null) {
            menu.removeItem(android.R.id.shareText);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131753671, null));
            spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(cd.L0(2131749097, null));
            spannableStringBuilder2.setSpan(new x41(org.telegram.messenger.i0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(cd.L0(2131744463, null));
            yz0 yz0Var = new yz0();
            yz0Var.a |= 8;
            spannableStringBuilder3.setSpan(new zz0(yz0Var, 0), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 8, spannableStringBuilder3);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, cd.L0(2131746352, null));
        }
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m3 m3Var = this.b2;
        org.telegram.ui.Components.e6 e6Var = m3Var.y;
        if (e6Var == null || this.Y1 <= 0) {
            return;
        }
        e6Var.a();
        m3Var.c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b2.y || super.verifyDrawable(drawable);
    }
}
