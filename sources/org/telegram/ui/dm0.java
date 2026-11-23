package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class dm0 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.m80 a;
    public final org.telegram.ui.Components.m80 b;
    public final /* synthetic */ fm0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm0(fm0 fm0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        this.c = fm0Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.m6.d6;
        lm0 lm0Var = fm0Var.q0;
        org.telegram.ui.ActionBar.t6.h(i7, this, lm0Var.getResourceProvider());
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(getContext());
        q9Var.setImageDrawable(new org.telegram.ui.Components.oh0(R.raw.utyan_draw, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(q9Var, c8.ma.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.m6.y6;
        h6Var = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
        org.telegram.ui.Components.m80 a10 = c8.va.a(context2, 14.0f, i10, false, h6Var);
        this.a = a10;
        a10.setGravity(17);
        a10.setText(org.telegram.messenger.hd.N0(fm0Var.n0 == 0 ? 2131750066 : 2131750065, null));
        addView(a10, c8.ma.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.m6.Xc;
        h6Var2 = ((org.telegram.ui.ActionBar.g2) lm0Var).resourceProvider;
        org.telegram.ui.Components.m80 a11 = c8.va.a(context3, 14.0f, i11, false, h6Var2);
        this.b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131750067, null), new hf0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        addView(a11, c8.ma.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        lm0 lm0Var = this.c.q0;
        setBackgroundColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6));
        this.a.setTextColor(lm0Var.getThemedColor(org.telegram.ui.ActionBar.m6.y6));
        int i7 = org.telegram.ui.ActionBar.m6.Xc;
        int themedColor = lm0Var.getThemedColor(i7);
        org.telegram.ui.Components.m80 m80Var = this.b;
        m80Var.setTextColor(themedColor);
        m80Var.setLinkTextColor(lm0Var.getThemedColor(i7));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
