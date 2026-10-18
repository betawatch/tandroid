package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.qu;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class d3 extends qu {
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ f3 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(f3 f3Var, Context context, jw0 jw0Var, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, jw0Var, null, 4, true, null);
        this.a0 = f3Var;
        this.V = d6Var;
        this.W = z10;
    }

    @Override // org.telegram.ui.Components.qu
    public final boolean a() {
        return this.a0.n && super.a();
    }

    @Override // org.telegram.ui.Components.qu
    public final int h() {
        return this.a0.a();
    }

    @Override // org.telegram.ui.Components.qu
    public final void i(Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, LocaleController.getString(R.string.Spoiler));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new c61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new c61(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC)), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        l11 l11Var = new l11();
        l11Var.a |= 8;
        spannableStringBuilder3.setSpan(new m11(l11Var, 0), 0, spannableStringBuilder3.length(), 33);
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
        org.telegram.ui.Components.p6 p6Var = f3Var.v;
        org.telegram.ui.Components.i5 i5Var = f3Var.r;
        if (i5Var != null) {
            p6Var.u(i5Var.a(org.telegram.ui.ActionBar.h6.w0(f3Var.s <= 0 ? org.telegram.ui.ActionBar.h6.p7 : org.telegram.ui.ActionBar.h6.P5, this.V), false));
        }
        int min = Math.min(AndroidUtilities.dp(48.0f), getHeight());
        boolean z10 = this.W;
        float f7 = z10 ? 0.0f : -AndroidUtilities.dp(1.0f);
        p6Var.o(getScrollX(), (getHeight() + f7) - min, (getWidth() + getScrollX()) - AndroidUtilities.dp((z10 ? 0 : 44) + 12), f7 + getHeight());
        p6Var.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a0.v || super.verifyDrawable(drawable);
    }
}
