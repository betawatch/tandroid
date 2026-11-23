package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.wt;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g3 extends wt {
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 W;
    public final /* synthetic */ boolean a0;
    public final /* synthetic */ i3 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(i3 i3Var, Context context, cu0 cu0Var, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, cu0Var, null, 4, true, null);
        this.b0 = i3Var;
        this.W = i6Var;
        this.a0 = z10;
    }

    @Override // org.telegram.ui.Components.wt
    public final boolean a() {
        return this.b0.r && super.a();
    }

    @Override // org.telegram.ui.Components.wt
    public final boolean b() {
        return this.b0.s;
    }

    @Override // org.telegram.ui.Components.wt
    public final int h() {
        return this.b0.a();
    }

    @Override // org.telegram.ui.Components.wt
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, gd.N0(2131745021, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131753668, null));
        spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.N0(2131748894, null));
        spannableStringBuilder2.setSpan(new k41(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(gd.N0(2131744192, null));
        ez0 ez0Var = new ez0();
        ez0Var.a = 8 | ez0Var.a;
        spannableStringBuilder3.setSpan(new fz0(ez0Var, 0), 0, spannableStringBuilder3.length(), 33);
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
        org.telegram.ui.Components.m6 m6Var = i3Var.y;
        org.telegram.ui.Components.f5 f5Var = i3Var.w;
        if (f5Var != null) {
            m6Var.u(f5Var.a(org.telegram.ui.ActionBar.n6.w0(i3Var.x <= 0 ? org.telegram.ui.ActionBar.n6.p7 : org.telegram.ui.ActionBar.n6.P5, this.W), false));
        }
        int min = Math.min(org.telegram.messenger.g0.L(48.0f), getHeight());
        boolean z10 = this.a0;
        float f10 = z10 ? 0.0f : -org.telegram.messenger.g0.L(1.0f);
        m6Var.o(getScrollX(), (getHeight() + f10) - min, (getWidth() + getScrollX()) - org.telegram.messenger.g0.L((z10 ? 0 : 44) + 12), f10 + getHeight());
        m6Var.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b0.y || super.verifyDrawable(drawable);
    }
}
