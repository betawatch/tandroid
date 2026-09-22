package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p01;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class g3 extends bu {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ i3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(i3 i3Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10, org.telegram.ui.ActionBar.e6 e6Var2, boolean z10) {
        super(context, e6Var);
        this.f = i3Var;
        this.c = i10;
        this.d = e6Var2;
        this.e = z10;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        i3 i3Var = this.f;
        i3Var.v.r(i3Var.r.a(org.telegram.ui.ActionBar.i6.v0(i3Var.s <= 0 ? org.telegram.ui.ActionBar.i6.p7 : org.telegram.ui.ActionBar.i6.P5, this.d), false));
        i3Var.v.setBounds(getScrollX(), getHeight() - Math.min(AndroidUtilities.dp(52.0f), getHeight()), AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        i3Var.v.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (this.e && menu.findItem(R.id.menu_bold) == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                menu.removeItem(android.R.id.shareText);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new f51(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC)), 0, spannableStringBuilder2.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            o01 o01Var = new o01();
            o01Var.a |= 8;
            spannableStringBuilder3.setSpan(new p01(o01Var, 0), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 8, spannableStringBuilder3);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, LocaleController.getString(R.string.Regular));
        }
    }

    @Override // org.telegram.ui.Components.bu, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.du, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.du, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i3 i3Var = this.f;
        org.telegram.ui.Components.m6 m6Var = i3Var.v;
        if (m6Var == null || this.c <= 0) {
            return;
        }
        m6Var.b();
        i3Var.c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f.v || super.verifyDrawable(drawable);
    }
}
