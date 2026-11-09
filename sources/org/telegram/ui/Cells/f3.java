package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f3 extends lt {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 V;
    public final /* synthetic */ boolean W;
    public final /* synthetic */ h3 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(h3 h3Var, Context context, tt0 tt0Var, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context, tt0Var, null, 4, true, null);
        this.a0 = h3Var;
        this.V = g6Var;
        this.W = z9;
    }

    @Override // org.telegram.ui.Components.lt
    public final boolean a() {
        return this.a0.r && super.a();
    }

    @Override // org.telegram.ui.Components.lt
    public final boolean b() {
        return this.a0.s;
    }

    @Override // org.telegram.ui.Components.lt
    public final int h() {
        return this.a0.a();
    }

    @Override // org.telegram.ui.Components.lt
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, id.M0(2131745262, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131753671, null));
        spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(id.M0(2131749087, null));
        spannableStringBuilder2.setSpan(new v31(org.telegram.messenger.g0.o1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(id.M0(2131744437, null));
        vy0 vy0Var = new vy0();
        vy0Var.a = 8 | vy0Var.a;
        spannableStringBuilder3.setSpan(new wy0(vy0Var, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, id.M0(2131746337, null));
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
            i6Var.u(z4Var.a(org.telegram.ui.ActionBar.l6.w0(h3Var.x <= 0 ? org.telegram.ui.ActionBar.l6.p7 : org.telegram.ui.ActionBar.l6.P5, this.V), false));
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
