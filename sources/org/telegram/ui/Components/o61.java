package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public abstract class o61 extends org.telegram.ui.ActionBar.m2 {
    public n61 a;
    public int b;
    public int c;

    public o61() {
        super(null);
        this.b = -1;
    }

    public abstract void U(ArrayList arrayList, l61 l61Var);

    public abstract CharSequence V();

    public abstract void W(x51 x51Var, View view);

    public abstract boolean X(x51 x51Var, View view);

    @Override // org.telegram.ui.ActionBar.m2
    public View createView(Context context) {
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.oo(this, 13));
        hg.r1 r1Var = new hg.r1(context, null, 1);
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false));
        n61 n61Var = new n61(this, this, new d(this, 22), new m61(this), new m61(this));
        this.a = n61Var;
        r1Var.addView(n61Var, w7.y5.c(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }
}
