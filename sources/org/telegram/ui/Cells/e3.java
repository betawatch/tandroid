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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class e3 extends ju {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ g3 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(g3 g3Var, Context context, bw0 bw0Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, bw0Var, null, 4, true, null);
        this.a0 = g3Var;
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
        spannableStringBuilder.setSpan(new u51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new u51(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC)), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        d11 d11Var = new d11();
        d11Var.a |= 8;
        spannableStringBuilder3.setSpan(new e11(d11Var, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, LocaleController.getString(R.string.Regular));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        g3 g3Var = this.a0;
        org.telegram.ui.Components.o6 o6Var = g3Var.v;
        org.telegram.ui.Components.h5 h5Var = g3Var.r;
        if (h5Var != null) {
            o6Var.r(h5Var.a(org.telegram.ui.ActionBar.j6.v0(g3Var.s <= 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.P5, this.V), false));
        }
        int min = Math.min(AndroidUtilities.dp(48.0f), getHeight());
        boolean z10 = this.W;
        float f7 = z10 ? 0.0f : -AndroidUtilities.dp(1.0f);
        o6Var.l(getScrollX(), (getHeight() + f7) - min, (getWidth() + getScrollX()) - AndroidUtilities.dp((z10 ? 0 : 44) + 12), f7 + getHeight());
        o6Var.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a0.v || super.verifyDrawable(drawable);
    }
}
