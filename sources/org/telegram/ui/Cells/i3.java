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
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class i3 extends bu {
    public final /* synthetic */ int c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ k3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(k3 k3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10, org.telegram.ui.ActionBar.f6 f6Var2, boolean z10) {
        super(context, f6Var);
        this.f = k3Var;
        this.c = i10;
        this.d = f6Var2;
        this.e = z10;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        k3 k3Var = this.f;
        k3Var.v.r(k3Var.r.a(org.telegram.ui.ActionBar.j6.v0(k3Var.s <= 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.P5, this.d), false));
        k3Var.v.setBounds(getScrollX(), getHeight() - Math.min(AndroidUtilities.dp(52.0f), getHeight()), AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        k3Var.v.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        if (this.e && menu.findItem(R.id.menu_bold) == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                menu.removeItem(android.R.id.shareText);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new v51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new v51(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC)), 0, spannableStringBuilder2.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            e11 e11Var = new e11();
            e11Var.a |= 8;
            spannableStringBuilder3.setSpan(new f11(e11Var, 0), 0, spannableStringBuilder3.length(), 33);
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
        k3 k3Var = this.f;
        org.telegram.ui.Components.n6 n6Var = k3Var.v;
        if (n6Var == null || this.c <= 0) {
            return;
        }
        n6Var.b();
        k3Var.c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f.v || super.verifyDrawable(drawable);
    }
}
