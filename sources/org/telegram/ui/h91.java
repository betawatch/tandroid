package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class h91 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final org.telegram.ui.Components.k90 b;
    public final org.telegram.ui.Components.k90 c;
    public final ci.d d;
    public final ci.d e;

    public h91(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        setOrientation(1);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.k90 a2 = w7.d6.a(context, 15.0f, i10, true, f6Var);
        this.b = a2;
        a2.setGravity(17);
        addView(a2, w7.y5.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.k90 a10 = w7.d6.a(context, 13.0f, i10, false, f6Var);
        this.c = a10;
        a10.setGravity(17);
        addView(a10, w7.y5.r(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ci.d g10 = org.telegram.messenger.rk.g(24, context, f6Var, true);
        this.d = g10;
        ci.d g11 = org.telegram.messenger.rk.g(24, context, f6Var, true);
        this.e = g11;
        linearLayout.addView(g10, w7.y5.p(0, 42, 1.0f, 112, 0, 0, 12, 0));
        linearLayout.addView(g11, w7.y5.p(0, 42, 1.0f, 112, 0, 0, 0, 0));
        addView(linearLayout, w7.y5.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override // org.telegram.ui.ActionBar.z5
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
