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
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.t01;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c3 extends cu {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 S;
    public final /* synthetic */ boolean T;
    public final /* synthetic */ e3 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(e3 e3Var, Context context, qv0 qv0Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, qv0Var, null, 4, true, null);
        this.U = e3Var;
        this.S = f6Var;
        this.T = z4;
    }

    @Override // org.telegram.ui.Components.cu
    public final boolean a() {
        return this.U.n && super.a();
    }

    @Override // org.telegram.ui.Components.cu
    public final int h() {
        return this.U.a();
    }

    @Override // org.telegram.ui.Components.cu
    public final void i(Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            menu.removeItem(android.R.id.shareText);
        }
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, LocaleController.getString(R.string.Spoiler));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new f51(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC)), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        s01 s01Var = new s01();
        s01Var.a |= 8;
        spannableStringBuilder3.setSpan(new t01(s01Var, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, LocaleController.getString(R.string.Regular));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        e3 e3Var = this.U;
        org.telegram.ui.Components.j6 j6Var = e3Var.v;
        org.telegram.ui.Components.c5 c5Var = e3Var.r;
        if (c5Var != null) {
            j6Var.r(c5Var.a(org.telegram.ui.ActionBar.j6.v0(e3Var.s <= 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.P5, this.S), false));
        }
        int min = Math.min(AndroidUtilities.dp(48.0f), getHeight());
        boolean z4 = this.T;
        float f10 = z4 ? 0.0f : -AndroidUtilities.dp(1.0f);
        j6Var.l(getScrollX(), (getHeight() + f10) - min, (getWidth() + getScrollX()) - AndroidUtilities.dp((z4 ? 0 : 44) + 12), f10 + getHeight());
        j6Var.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.U.v || super.verifyDrawable(drawable);
    }
}
