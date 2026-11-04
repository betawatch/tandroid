package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b31 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final org.telegram.ui.Components.s70 b;
    public final org.telegram.ui.Components.s70 c;
    public final gi.d d;
    public final gi.d e;

    public b31(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = e6Var;
        setOrientation(1);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.s70 a10 = b8.rf.a(context, 15.0f, i3, true, e6Var);
        this.b = a10;
        a10.setGravity(17);
        addView(a10, b8.mf.t(-1, -2, 55, 32, 20, 32, 0));
        org.telegram.ui.Components.s70 a11 = b8.rf.a(context, 13.0f, i3, false, e6Var);
        this.c = a11;
        a11.setGravity(17);
        addView(a11, b8.mf.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.d = h;
        gi.d h7 = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.e = h7;
        linearLayout.addView(h, b8.mf.q(0, 42, 1.0f, org.telegram.messenger.hs.x1, 0, 0, 12, 0));
        linearLayout.addView(h7, b8.mf.q(0, 42, 1.0f, org.telegram.messenger.hs.x1, 0, 0, 0, 0));
        addView(linearLayout, b8.mf.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
    }
}
