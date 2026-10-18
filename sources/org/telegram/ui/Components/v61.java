package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public abstract class v61 extends org.telegram.ui.ActionBar.n2 {
    public u61 a;
    public int b;
    public int c;

    public v61() {
        super(null);
        this.b = -1;
    }

    public abstract void U(ArrayList arrayList, s61 s61Var);

    public abstract CharSequence V();

    public abstract void W(f61 f61Var, View view);

    public abstract boolean X(f61 f61Var, View view);

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 16));
        ig.p1 p1Var = new ig.p1(context, null, 1);
        p1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        u61 u61Var = new u61(this, this, new d(this, 22), new t61(this), new t61(this));
        this.a = u61Var;
        p1Var.addView(u61Var, w7.z5.d(-1.0f, -1));
        this.fragmentView = p1Var;
        return p1Var;
    }
}
