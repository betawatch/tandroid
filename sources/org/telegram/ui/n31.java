package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class n31 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public final org.telegram.ui.Components.k80 b;
    public final org.telegram.ui.Components.k80 c;
    public final hi.d d;
    public final hi.d e;

    public n31(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.a = i6Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.Components.k80 a10 = c8.va.a(context, 15.0f, i7, true, i6Var);
        this.b = a10;
        a10.setGravity(17);
        addView(a10, c8.ma.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.k80 a11 = c8.va.a(context, 13.0f, i7, false, i6Var);
        this.c = a11;
        a11.setGravity(17);
        addView(a11, c8.ma.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        hi.d g10 = org.telegram.messenger.n10.g(24, context, i6Var, true);
        this.d = g10;
        hi.d g11 = org.telegram.messenger.n10.g(24, context, i6Var, true);
        this.e = g11;
        linearLayout.addView(g10, c8.ma.q(0, 42, 1.0f, org.telegram.messenger.ks.x1, 0, 0, 12, 0));
        linearLayout.addView(g11, c8.ma.q(0, 42, 1.0f, org.telegram.messenger.ks.x1, 0, 0, 0, 0));
        addView(linearLayout, c8.ma.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
    }
}
