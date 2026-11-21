package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.yt;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class g3 extends yt {
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 W;
    public final /* synthetic */ boolean a0;
    public final /* synthetic */ i3 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(i3 i3Var, Context context, du0 du0Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context, du0Var, null, 4, true, null);
        this.b0 = i3Var;
        this.W = h6Var;
        this.a0 = z10;
    }

    @Override // org.telegram.ui.Components.yt
    public final boolean a() {
        return this.b0.r && super.a();
    }

    @Override // org.telegram.ui.Components.yt
    public final boolean b() {
        return this.b0.s;
    }

    @Override // org.telegram.ui.Components.yt
    public final int h() {
        return this.b0.a();
    }

    @Override // org.telegram.ui.Components.yt
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, gd.N0(2131745021, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131753668, null));
        spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.N0(2131748894, null));
        spannableStringBuilder2.setSpan(new l41(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(gd.N0(2131744196, null));
        fz0 fz0Var = new fz0();
        fz0Var.a = 8 | fz0Var.a;
        spannableStringBuilder3.setSpan(new gz0(fz0Var, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, gd.N0(2131746141, null));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        i3 i3Var = this.b0;
        org.telegram.ui.Components.n6 n6Var = i3Var.y;
        org.telegram.ui.Components.g5 g5Var = i3Var.w;
        if (g5Var != null) {
            n6Var.u(g5Var.a(org.telegram.ui.ActionBar.m6.w0(i3Var.x <= 0 ? org.telegram.ui.ActionBar.m6.p7 : org.telegram.ui.ActionBar.m6.P5, this.W), false));
        }
        int min = Math.min(org.telegram.messenger.g0.L(48.0f), getHeight());
        boolean z10 = this.a0;
        float f10 = z10 ? 0.0f : -org.telegram.messenger.g0.L(1.0f);
        n6Var.o(getScrollX(), (getHeight() + f10) - min, (getWidth() + getScrollX()) - org.telegram.messenger.g0.L((z10 ? 0 : 44) + 12), f10 + getHeight());
        n6Var.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b0.y || super.verifyDrawable(drawable);
    }
}
