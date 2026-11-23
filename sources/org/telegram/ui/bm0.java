package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bm0 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.j80 a;
    public final org.telegram.ui.Components.j80 b;
    public final /* synthetic */ dm0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm0(dm0 dm0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        this.c = dm0Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.n6.d6;
        jm0 jm0Var = dm0Var.q0;
        org.telegram.ui.ActionBar.u6.h(i7, this, jm0Var.getResourceProvider());
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
        p9Var.setImageDrawable(new org.telegram.ui.Components.nh0(R.raw.utyan_draw, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f)));
        addView(p9Var, c8.na.t(120, 120, 1, 0, 6, 0, 0));
        Context context2 = getContext();
        int i10 = org.telegram.ui.ActionBar.n6.y6;
        i6Var = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
        org.telegram.ui.Components.j80 a10 = c8.wa.a(context2, 14.0f, i10, false, i6Var);
        this.a = a10;
        a10.setGravity(17);
        a10.setText(org.telegram.messenger.gd.N0(dm0Var.n0 == 0 ? 2131750066 : 2131750065, null));
        addView(a10, c8.na.t(-1, -2, 1, 64, 8, 64, 8));
        Context context3 = getContext();
        int i11 = org.telegram.ui.ActionBar.n6.Xc;
        i6Var2 = ((org.telegram.ui.ActionBar.g2) jm0Var).resourceProvider;
        org.telegram.ui.Components.j80 a11 = c8.wa.a(context3, 14.0f, i11, false, i6Var2);
        this.b = a11;
        a11.setGravity(17);
        a11.setText(org.telegram.messenger.g0.J2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.N0(2131750067, null), new gf0(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        addView(a11, c8.na.t(-1, -2, 1, 32, 4, 32, 24));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        jm0 jm0Var = this.c.q0;
        setBackgroundColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6));
        this.a.setTextColor(jm0Var.getThemedColor(org.telegram.ui.ActionBar.n6.y6));
        int i7 = org.telegram.ui.ActionBar.n6.Xc;
        int themedColor = jm0Var.getThemedColor(i7);
        org.telegram.ui.Components.j80 j80Var = this.b;
        j80Var.setTextColor(themedColor);
        j80Var.setLinkTextColor(jm0Var.getThemedColor(i7));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
