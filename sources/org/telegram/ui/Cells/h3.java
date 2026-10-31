package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h3 extends wt {
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ j3 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(j3 j3Var, Context context, uu0 uu0Var, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context, uu0Var, null, 4, true, null);
        this.a0 = j3Var;
        this.V = p6Var;
        this.W = z10;
    }

    @Override // org.telegram.ui.Components.wt
    public final boolean a() {
        return this.a0.r && super.a();
    }

    @Override // org.telegram.ui.Components.wt
    public final boolean b() {
        return this.a0.s;
    }

    @Override // org.telegram.ui.Components.wt
    public final int h() {
        return this.a0.a();
    }

    @Override // org.telegram.ui.Components.wt
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, cd.L0(2131745280, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131753671, null));
        spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(cd.L0(2131749097, null));
        spannableStringBuilder2.setSpan(new x41(org.telegram.messenger.i0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(cd.L0(2131744463, null));
        yz0 yz0Var = new yz0();
        yz0Var.a = 8 | yz0Var.a;
        spannableStringBuilder3.setSpan(new zz0(yz0Var, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, cd.L0(2131746352, null));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        j3 j3Var = this.a0;
        org.telegram.ui.Components.e6 e6Var = j3Var.y;
        org.telegram.ui.Components.w4 w4Var = j3Var.w;
        if (w4Var != null) {
            e6Var.u(w4Var.a(org.telegram.ui.ActionBar.t6.w0(j3Var.x <= 0 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.P5, this.V), false));
        }
        int min = Math.min(org.telegram.messenger.i0.L(48.0f), getHeight());
        boolean z10 = this.W;
        float f7 = z10 ? 0.0f : -org.telegram.messenger.i0.L(1.0f);
        e6Var.o(getScrollX(), (getHeight() + f7) - min, (getWidth() + getScrollX()) - org.telegram.messenger.i0.L((z10 ? 0 : 44) + 12), f7 + getHeight());
        e6Var.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a0.y || super.verifyDrawable(drawable);
    }
}
