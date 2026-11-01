package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jn0 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.p80 a;
    public final org.telegram.ui.Components.p80 b;
    public final /* synthetic */ ln0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn0(ln0 ln0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        this.c = ln0Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        rn0 rn0Var = ln0Var.p0;
        org.telegram.ui.ActionBar.a7.i(i10, this, rn0Var.getResourceProvider());
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getContext());
        g9Var.setImageDrawable(new org.telegram.ui.Components.ci0(R.raw.utyan_draw, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f)));
        addView(g9Var, w7.b6.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i11 = org.telegram.ui.ActionBar.t6.y6;
        p6Var = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
        org.telegram.ui.Components.p80 a2 = w7.g6.a(context2, 14.0f, i11, false, p6Var);
        this.a = a2;
        a2.setGravity(17);
        a2.setText(org.telegram.messenger.dd.L0(ln0Var.m0 == 0 ? 2131750092 : 2131750091, null));
        addView(a2, w7.b6.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i12 = org.telegram.ui.ActionBar.t6.Uc;
        p6Var2 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
        org.telegram.ui.Components.p80 a10 = w7.g6.a(context3, 14.0f, i12, false, p6Var2);
        this.b = a10;
        a10.setGravity(17);
        a10.setText(org.telegram.messenger.i0.I2(org.telegram.messenger.i0.T2(org.telegram.messenger.dd.L0(2131750093, null), new kg0(this, 14)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        addView(a10, w7.b6.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        rn0 rn0Var = this.c.p0;
        setBackgroundColor(rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
        this.a.setTextColor(rn0Var.getThemedColor(org.telegram.ui.ActionBar.t6.y6));
        int i10 = org.telegram.ui.ActionBar.t6.Uc;
        int themedColor = rn0Var.getThemedColor(i10);
        org.telegram.ui.Components.p80 p80Var = this.b;
        p80Var.setTextColor(themedColor);
        p80Var.setLinkTextColor(rn0Var.getThemedColor(i10));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
