package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vy0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class f3 extends kt {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ h3 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(h3 h3Var, Context context, rt0 rt0Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, rt0Var, null, 4, true, null);
        this.a0 = h3Var;
        this.V = f6Var;
        this.W = z9;
    }

    @Override // org.telegram.ui.Components.kt
    public final boolean a() {
        return this.a0.r && super.a();
    }

    @Override // org.telegram.ui.Components.kt
    public final boolean b() {
        return this.a0.s;
    }

    @Override // org.telegram.ui.Components.kt
    public final int h() {
        return this.a0.a();
    }

    @Override // org.telegram.ui.Components.kt
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, hd.M0(2131745263, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.M0(2131749086, null));
        spannableStringBuilder2.setSpan(new u31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(hd.M0(2131744438, null));
        uy0 uy0Var = new uy0();
        uy0Var.a = 8 | uy0Var.a;
        spannableStringBuilder3.setSpan(new vy0(uy0Var, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, hd.M0(2131746336, null));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        h3 h3Var = this.a0;
        org.telegram.ui.Components.i6 i6Var = h3Var.y;
        org.telegram.ui.Components.z4 z4Var = h3Var.w;
        if (z4Var != null) {
            i6Var.u(z4Var.a(org.telegram.ui.ActionBar.k6.w0(h3Var.x <= 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.P5, this.V), false));
        }
        int min = Math.min(org.telegram.messenger.g0.L(48.0f), getHeight());
        boolean z9 = this.W;
        float f10 = z9 ? 0.0f : -org.telegram.messenger.g0.L(1.0f);
        i6Var.o(getScrollX(), (getHeight() + f10) - min, (getWidth() + getScrollX()) - org.telegram.messenger.g0.L((z9 ? 0 : 44) + 12), f10 + getHeight());
        i6Var.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a0.y || super.verifyDrawable(drawable);
    }
}
