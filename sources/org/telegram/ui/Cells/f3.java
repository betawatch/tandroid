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
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.ut;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f3 extends ut {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ h3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(h3 h3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, org.telegram.ui.ActionBar.f6 f6Var2, boolean z4) {
        super(context, f6Var);
        this.f = h3Var;
        this.c = i10;
        this.d = f6Var2;
        this.e = z4;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        h3 h3Var = this.f;
        h3Var.v.r(h3Var.r.a(org.telegram.ui.ActionBar.j6.v0(h3Var.s <= 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.P5, this.d), false));
        h3Var.v.setBounds(getScrollX(), getHeight() - Math.min(AndroidUtilities.dp(52.0f), getHeight()), AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        h3Var.v.draw(canvas);
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
            s01 s01Var = new s01();
            s01Var.a |= 8;
            spannableStringBuilder3.setSpan(new t01(s01Var, 0), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 8, spannableStringBuilder3);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, LocaleController.getString(R.string.Regular));
        }
    }

    @Override // org.telegram.ui.Components.ut, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.wt, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.wt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        h3 h3Var = this.f;
        org.telegram.ui.Components.j6 j6Var = h3Var.v;
        if (j6Var == null || this.c <= 0) {
            return;
        }
        j6Var.b();
        h3Var.c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f.v || super.verifyDrawable(drawable);
    }
}
