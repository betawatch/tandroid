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
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.t41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b3 extends au {
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 R;
    public final /* synthetic */ boolean S;
    public final /* synthetic */ d3 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(d3 d3Var, Context context, hv0 hv0Var, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, hv0Var, null, 4, true, null);
        this.T = d3Var;
        this.R = c6Var;
        this.S = z10;
    }

    @Override // org.telegram.ui.Components.au
    public final boolean a() {
        return this.T.n && super.a();
    }

    @Override // org.telegram.ui.Components.au
    public final int h() {
        return this.T.a();
    }

    @Override // org.telegram.ui.Components.au
    public final void i(Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            menu.removeItem(android.R.id.shareText);
        }
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, LocaleController.getString(R.string.Spoiler));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new t41(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC)), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        h01 h01Var = new h01();
        h01Var.a |= 8;
        spannableStringBuilder3.setSpan(new i01(h01Var, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, LocaleController.getString(R.string.Regular));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        d3 d3Var = this.T;
        org.telegram.ui.Components.n6 n6Var = d3Var.v;
        org.telegram.ui.Components.f5 f5Var = d3Var.r;
        if (f5Var != null) {
            n6Var.r(f5Var.a(org.telegram.ui.ActionBar.g6.v0(d3Var.s <= 0 ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.P5, this.R), false));
        }
        int min = Math.min(AndroidUtilities.dp(48.0f), getHeight());
        boolean z10 = this.S;
        float f9 = z10 ? 0.0f : -AndroidUtilities.dp(1.0f);
        n6Var.l(getScrollX(), (getHeight() + f9) - min, (getWidth() + getScrollX()) - AndroidUtilities.dp((z10 ? 0 : 44) + 12), f9 + getHeight());
        n6Var.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.T.v || super.verifyDrawable(drawable);
    }
}
