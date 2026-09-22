package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class p61 extends org.telegram.ui.ActionBar.n2 {
    public o61 a;
    public hg.q1 b;
    public int c;
    public int d;

    public p61() {
        super(null);
        this.c = -1;
    }

    public abstract void U(ArrayList arrayList, m61 m61Var);

    public abstract CharSequence V();

    public abstract void W(y51 y51Var, View view);

    public abstract boolean X(y51 y51Var, View view);

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        hg.k0.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 13));
        hg.q1 q1Var = new hg.q1(context, null, 1);
        this.b = q1Var;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        o61 o61Var = new o61(this, this, new d(this, 22), new n61(this), new n61(this));
        this.a = o61Var;
        this.b.addView(o61Var, w7.y5.c(-1.0f, -1));
        hg.q1 q1Var2 = this.b;
        this.fragmentView = q1Var2;
        return q1Var2;
    }
}
