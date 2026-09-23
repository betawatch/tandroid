package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class y51 extends org.telegram.ui.ActionBar.n2 {
    public x51 a;
    public int b;
    public int c;

    public y51() {
        super(null);
        this.b = -1;
    }

    public abstract void U(ArrayList arrayList, v51 v51Var);

    public abstract CharSequence V();

    public abstract void W(h51 h51Var, View view);

    public abstract boolean X(h51 h51Var, View view);

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        hg.c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.po(this, 13));
        hg.r1 r1Var = new hg.r1(context, null, 1);
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false));
        x51 x51Var = new x51(this, this, new d(this, 22), new w51(this), new w51(this));
        this.a = x51Var;
        r1Var.addView(x51Var, w7.x5.c(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }
}
