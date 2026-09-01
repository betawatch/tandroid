package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class c61 extends org.telegram.ui.ActionBar.p2 {
    public b61 a;
    public int b;
    public int c;

    public c61() {
        super(null);
        this.b = -1;
    }

    public abstract void U(ArrayList arrayList, x51 x51Var);

    public abstract CharSequence V();

    public abstract void W(j51 j51Var, View view);

    public abstract boolean X(j51 j51Var, View view);

    @Override // org.telegram.ui.ActionBar.p2
    public View createView(Context context) {
        org.telegram.ui.yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new z51(this, 0));
        a61 a61Var = new a61(context, null, 0);
        a61Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        b61 b61Var = new b61(this, this, new d(this, 22), new y51(this), new y51(this));
        this.a = b61Var;
        a61Var.addView(b61Var, k7.c6.c(-1.0f, -1));
        this.fragmentView = a61Var;
        return a61Var;
    }
}
