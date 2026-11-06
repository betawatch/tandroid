package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.ys;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class i3 extends ys {
    public final /* synthetic */ int Y1;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 Z1;
    public final /* synthetic */ boolean a2;
    public final /* synthetic */ k3 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(k3 k3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7, org.telegram.ui.ActionBar.f6 f6Var2, boolean z9) {
        super(context, f6Var);
        this.b2 = k3Var;
        this.Y1 = i7;
        this.Z1 = f6Var2;
        this.a2 = z9;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        k3 k3Var = this.b2;
        k3Var.y.u(k3Var.w.a(org.telegram.ui.ActionBar.k6.w0(k3Var.x <= 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.P5, this.Z1), false));
        k3Var.y.setBounds(getScrollX(), getHeight() - Math.min(org.telegram.messenger.g0.L(52.0f), getHeight()), org.telegram.messenger.g0.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        k3Var.y.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (this.a2 && menu.findItem(R.id.menu_bold) == null) {
            menu.removeItem(android.R.id.shareText);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131753671, null));
            spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.M0(2131749086, null));
            spannableStringBuilder2.setSpan(new u31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(hd.M0(2131744438, null));
            uy0 uy0Var = new uy0();
            uy0Var.a |= 8;
            spannableStringBuilder3.setSpan(new vy0(uy0Var, 0), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 8, spannableStringBuilder3);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, hd.M0(2131746336, null));
        }
    }

    @Override // org.telegram.ui.Components.ys, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ct, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ct, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        k3 k3Var = this.b2;
        org.telegram.ui.Components.i6 i6Var = k3Var.y;
        if (i6Var == null || this.Y1 <= 0) {
            return;
        }
        i6Var.a();
        k3Var.c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b2.y || super.verifyDrawable(drawable);
    }
}
