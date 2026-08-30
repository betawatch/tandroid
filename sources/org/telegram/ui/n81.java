package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class n81 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final org.telegram.ui.Components.e90 b;
    public final org.telegram.ui.Components.e90 c;
    public final ph.d d;
    public final ph.d e;

    public n81(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.e90 a2 = k7.f6.a(context, 15.0f, i10, true, f6Var);
        this.b = a2;
        a2.setGravity(17);
        addView(a2, k7.b6.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.e90 a10 = k7.f6.a(context, 13.0f, i10, false, f6Var);
        this.c = a10;
        a10.setGravity(17);
        addView(a10, k7.b6.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        this.d = p10;
        ph.d p11 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        this.e = p11;
        linearLayout.addView(p10, k7.b6.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(p11, k7.b6.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, k7.b6.t(-1, -2, 55, 24, 18, 24, 16));
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
