package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.y11;
import org.telegram.ui.Components.z11;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b3 extends ru {
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ d3 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(d3 d3Var, Context context, vw0 vw0Var, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, vw0Var, null, 4, true, null);
        this.a0 = d3Var;
        this.V = u6Var;
        this.W = z10;
    }

    @Override // org.telegram.ui.Components.ru
    public final boolean a() {
        return this.a0.r && super.a();
    }

    @Override // org.telegram.ui.Components.ru
    public final int h() {
        return this.a0.a();
    }

    @Override // org.telegram.ui.Components.ru
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, LocaleController.getString(R.string.Spoiler));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new q61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new q61(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC)), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        y11 y11Var = new y11();
        y11Var.a |= 8;
        spannableStringBuilder3.setSpan(new z11(y11Var, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, LocaleController.getString(R.string.Regular));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        d3 d3Var = this.a0;
        org.telegram.ui.Components.r6 r6Var = d3Var.w;
        org.telegram.ui.Components.j5 j5Var = d3Var.s;
        if (j5Var != null) {
            r6Var.u(j5Var.a(org.telegram.ui.ActionBar.y6.w0(d3Var.v <= 0 ? org.telegram.ui.ActionBar.y6.p7 : org.telegram.ui.ActionBar.y6.P5, this.V), false));
        }
        int min = Math.min(AndroidUtilities.dp(48.0f), getHeight());
        boolean z10 = this.W;
        float f7 = z10 ? 0.0f : -AndroidUtilities.dp(1.0f);
        r6Var.o(getScrollX(), (getHeight() + f7) - min, (getWidth() + getScrollX()) - AndroidUtilities.dp((z10 ? 0 : 44) + 12), f7 + getHeight());
        r6Var.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a0.w || super.verifyDrawable(drawable);
    }
}
