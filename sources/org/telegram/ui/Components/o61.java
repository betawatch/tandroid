package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public abstract class o61 extends org.telegram.ui.ActionBar.n2 {
    public n61 a;
    public hg.q1 b;
    public int c;
    public int d;

    public o61() {
        super(null);
        this.c = -1;
    }

    public abstract void U(ArrayList arrayList, l61 l61Var);

    public abstract CharSequence V();

    public abstract void W(x51 x51Var, View view);

    public abstract boolean X(x51 x51Var, View view);

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        hg.k0.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 13));
        hg.q1 q1Var = new hg.q1(context, null, 1);
        this.b = q1Var;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        n61 n61Var = new n61(this, this, new d(this, 22), new m61(this), new m61(this));
        this.a = n61Var;
        this.b.addView(n61Var, w7.y5.c(-1.0f, -1));
        hg.q1 q1Var2 = this.b;
        this.fragmentView = q1Var2;
        return q1Var2;
    }
}
