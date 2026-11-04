package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.uy0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f3 extends jt {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 W;
    public final /* synthetic */ boolean a0;
    public final /* synthetic */ h3 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(h3 h3Var, Context context, qt0 qt0Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, qt0Var, null, 4, true, null);
        this.b0 = h3Var;
        this.W = e6Var;
        this.a0 = z10;
    }

    @Override // org.telegram.ui.Components.jt
    public final boolean a() {
        return this.b0.r && super.a();
    }

    @Override // org.telegram.ui.Components.jt
    public final boolean b() {
        return this.b0.s;
    }

    @Override // org.telegram.ui.Components.jt
    public final int h() {
        return this.b0.a();
    }

    @Override // org.telegram.ui.Components.jt
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, bd.M0(2131745272, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bd.M0(2131749095, null));
        spannableStringBuilder2.setSpan(new o31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(bd.M0(2131744447, null));
        ty0 ty0Var = new ty0();
        ty0Var.a = 8 | ty0Var.a;
        spannableStringBuilder3.setSpan(new uy0(ty0Var, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, bd.M0(2131746345, null));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        h3 h3Var = this.b0;
        org.telegram.ui.Components.g6 g6Var = h3Var.y;
        org.telegram.ui.Components.x4 x4Var = h3Var.w;
        if (x4Var != null) {
            g6Var.u(x4Var.a(org.telegram.ui.ActionBar.k6.w0(h3Var.x <= 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.P5, this.W), false));
        }
        int min = Math.min(org.telegram.messenger.g0.L(48.0f), getHeight());
        boolean z10 = this.a0;
        float f10 = z10 ? 0.0f : -org.telegram.messenger.g0.L(1.0f);
        g6Var.o(getScrollX(), (getHeight() + f10) - min, (getWidth() + getScrollX()) - org.telegram.messenger.g0.L((z10 ? 0 : 44) + 12), f10 + getHeight());
        g6Var.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b0.y || super.verifyDrawable(drawable);
    }
}
