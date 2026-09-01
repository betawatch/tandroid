package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class o81 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final org.telegram.ui.Components.g90 b;
    public final org.telegram.ui.Components.g90 c;
    public final qh.d d;
    public final qh.d e;

    public o81(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = g6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.g90 a2 = k7.g6.a(context, 15.0f, i10, true, g6Var);
        this.b = a2;
        a2.setGravity(17);
        addView(a2, k7.c6.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.g90 a10 = k7.g6.a(context, 13.0f, i10, false, g6Var);
        this.c = a10;
        a10.setGravity(17);
        addView(a10, k7.c6.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        this.d = p10;
        qh.d p11 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        this.e = p11;
        linearLayout.addView(p10, k7.c6.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(p11, k7.c6.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, k7.c6.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
