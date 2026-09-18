package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f91 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final org.telegram.ui.Components.c90 b;
    public final org.telegram.ui.Components.c90 c;
    public final ci.d d;
    public final ci.d e;

    public f91(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.c90 a2 = w7.b6.a(context, 15.0f, i10, true, f6Var);
        this.b = a2;
        a2.setGravity(17);
        addView(a2, w7.x5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.c90 a10 = w7.b6.a(context, 13.0f, i10, false, f6Var);
        this.c = a10;
        a10.setGravity(17);
        addView(a10, w7.x5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ci.d g10 = org.telegram.messenger.wl.g(24, context, f6Var, true);
        this.d = g10;
        ci.d g11 = org.telegram.messenger.wl.g(24, context, f6Var, true);
        this.e = g11;
        linearLayout.addView(g10, w7.x5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(g11, w7.x5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.x5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
