package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public abstract class x61 extends org.telegram.ui.ActionBar.n2 {
    public w61 a;
    public int b;
    public int c;

    public x61() {
        super(null);
        this.b = -1;
    }

    public abstract void U(ArrayList arrayList, u61 u61Var);

    public abstract CharSequence V();

    public abstract void W(h61 h61Var, View view);

    public abstract boolean X(h61 h61Var, View view);

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        i2.e.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 16));
        ig.p1 p1Var = new ig.p1(context, null, 1);
        p1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false));
        w61 w61Var = new w61(this, this, new d(this, 22), new v61(this), new v61(this));
        this.a = w61Var;
        p1Var.addView(w61Var, w7.z5.c(-1.0f, -1));
        this.fragmentView = p1Var;
        return p1Var;
    }
}
