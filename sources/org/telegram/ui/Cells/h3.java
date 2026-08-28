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
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.wz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h3 extends mt {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ j3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(j3 j3Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9, org.telegram.ui.ActionBar.b6 b6Var2, boolean z10) {
        super(context, b6Var);
        this.f = j3Var;
        this.c = i9;
        this.d = b6Var2;
        this.e = z10;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        j3 j3Var = this.f;
        j3Var.v.r(j3Var.r.a(org.telegram.ui.ActionBar.f6.v0(j3Var.s <= 0 ? org.telegram.ui.ActionBar.f6.p7 : org.telegram.ui.ActionBar.f6.P5, this.d), false));
        j3Var.v.setBounds(getScrollX(), getHeight() - Math.min(AndroidUtilities.dp(52.0f), getHeight()), AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        j3Var.v.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (this.e && menu.findItem(R.id.menu_bold) == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                menu.removeItem(android.R.id.shareText);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new i41(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC)), 0, spannableStringBuilder2.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            vz0 vz0Var = new vz0();
            vz0Var.a |= 8;
            spannableStringBuilder3.setSpan(new wz0(vz0Var, 0), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 8, spannableStringBuilder3);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, LocaleController.getString(R.string.Regular));
        }
    }

    @Override // org.telegram.ui.Components.mt, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ot, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        j3 j3Var = this.f;
        org.telegram.ui.Components.i6 i6Var = j3Var.v;
        if (i6Var == null || this.c <= 0) {
            return;
        }
        i6Var.b();
        j3Var.c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f.v || super.verifyDrawable(drawable);
    }
}
