package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d3 extends ut {
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 R;
    public final /* synthetic */ boolean S;
    public final /* synthetic */ g3 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(g3 g3Var, Context context, xu0 xu0Var, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, xu0Var, null, 4, true, null);
        this.T = g3Var;
        this.R = b6Var;
        this.S = z10;
    }

    @Override // org.telegram.ui.Components.ut
    public final boolean a() {
        return this.T.n && super.a();
    }

    @Override // org.telegram.ui.Components.ut
    public final int h() {
        return this.T.a();
    }

    @Override // org.telegram.ui.Components.ut
    public final void i(Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            menu.removeItem(android.R.id.shareText);
        }
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, LocaleController.getString(R.string.Spoiler));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new i41(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC)), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        vz0 vz0Var = new vz0();
        vz0Var.a |= 8;
        spannableStringBuilder3.setSpan(new wz0(vz0Var, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, LocaleController.getString(R.string.Regular));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        g3 g3Var = this.T;
        org.telegram.ui.Components.i6 i6Var = g3Var.v;
        org.telegram.ui.Components.b5 b5Var = g3Var.r;
        if (b5Var != null) {
            i6Var.r(b5Var.a(org.telegram.ui.ActionBar.f6.v0(g3Var.s <= 0 ? org.telegram.ui.ActionBar.f6.p7 : org.telegram.ui.ActionBar.f6.P5, this.R), false));
        }
        int min = Math.min(AndroidUtilities.dp(48.0f), getHeight());
        boolean z10 = this.S;
        float f10 = z10 ? 0.0f : -AndroidUtilities.dp(1.0f);
        i6Var.l(getScrollX(), (getHeight() + f10) - min, (getWidth() + getScrollX()) - AndroidUtilities.dp((z10 ? 0 : 44) + 12), f10 + getHeight());
        i6Var.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.T.v || super.verifyDrawable(drawable);
    }
}
