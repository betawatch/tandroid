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
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d3 extends ju {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ f3 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(f3 f3Var, Context context, pv0 pv0Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, pv0Var, null, 4, true, null);
        this.a0 = f3Var;
        this.V = e6Var;
        this.W = z10;
    }

    @Override // org.telegram.ui.Components.ju
    public final boolean a() {
        return this.a0.n && super.a();
    }

    @Override // org.telegram.ui.Components.ju
    public final int h() {
        return this.a0.a();
    }

    @Override // org.telegram.ui.Components.ju
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
        o01 o01Var = new o01();
        o01Var.a |= 8;
        spannableStringBuilder3.setSpan(new p01(o01Var, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, LocaleController.getString(R.string.Regular));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        f3 f3Var = this.a0;
        org.telegram.ui.Components.m6 m6Var = f3Var.v;
        org.telegram.ui.Components.f5 f5Var = f3Var.r;
        if (f5Var != null) {
            m6Var.r(f5Var.a(org.telegram.ui.ActionBar.i6.v0(f3Var.s <= 0 ? org.telegram.ui.ActionBar.i6.p7 : org.telegram.ui.ActionBar.i6.P5, this.V), false));
        }
        int min = Math.min(AndroidUtilities.dp(48.0f), getHeight());
        boolean z10 = this.W;
        float f7 = z10 ? 0.0f : -AndroidUtilities.dp(1.0f);
        m6Var.l(getScrollX(), (getHeight() + f7) - min, (getWidth() + getScrollX()) - AndroidUtilities.dp((z10 ? 0 : 44) + 12), f7 + getHeight());
        m6Var.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a0.v || super.verifyDrawable(drawable);
    }
}
