package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class bm0 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.x70 a;
    public final org.telegram.ui.Components.x70 b;
    public final /* synthetic */ dm0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm0(dm0 dm0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        this.c = dm0Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.l6.d6;
        jm0 jm0Var = dm0Var.p0;
        org.telegram.ui.ActionBar.s6.h(i7, this, jm0Var.getResourceProvider());
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getContext());
        l9Var.setImageDrawable(new org.telegram.ui.Components.ah0(R.raw.utyan_draw, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(l9Var, c8.ha.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.l6.y6;
        g6Var = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
        org.telegram.ui.Components.x70 a10 = c8.qa.a(context2, 14.0f, i10, false, g6Var);
        this.a = a10;
        a10.setGravity(17);
        a10.setText(org.telegram.messenger.id.M0(dm0Var.m0 == 0 ? 2131750083 : 2131750082, null));
        addView(a10, c8.ha.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.l6.Uc;
        g6Var2 = ((org.telegram.ui.ActionBar.f2) jm0Var).resourceProvider;
        org.telegram.ui.Components.x70 a11 = c8.qa.a(context3, 14.0f, i11, false, g6Var2);
        this.b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750084, null), new gf0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        addView(a11, c8.ha.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        jm0 jm0Var = this.c.p0;
        setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.d6));
        this.a.setTextColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.y6));
        int i7 = org.telegram.ui.ActionBar.l6.Uc;
        int themedColor = jm0Var.getThemedColor(i7);
        org.telegram.ui.Components.x70 x70Var = this.b;
        x70Var.setTextColor(themedColor);
        x70Var.setLinkTextColor(jm0Var.getThemedColor(i7));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
