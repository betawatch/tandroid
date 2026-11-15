package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j31 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final org.telegram.ui.Components.z70 b;
    public final org.telegram.ui.Components.z70 c;
    public final hi.d d;
    public final hi.d e;

    public j31(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = e6Var;
        setOrientation(1);
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.z70 a10 = c8.sa.a(context, 15.0f, i7, true, e6Var);
        this.b = a10;
        a10.setGravity(17);
        addView(a10, c8.ja.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.z70 a11 = c8.sa.a(context, 13.0f, i7, false, e6Var);
        this.c = a11;
        a11.setGravity(17);
        addView(a11, c8.ja.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        this.d = g10;
        hi.d g11 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        this.e = g11;
        linearLayout.addView(g10, c8.ja.q(0, 42, 1.0f, org.telegram.messenger.ns.x1, 0, 0, 12, 0));
        linearLayout.addView(g11, c8.ja.q(0, 42, 1.0f, org.telegram.messenger.ns.x1, 0, 0, 0, 0));
        addView(linearLayout, c8.ja.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
    }
}
