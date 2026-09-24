package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public abstract class m61 extends org.telegram.ui.ActionBar.m2 {
    public l61 a;
    public int b;
    public int c;

    public m61() {
        super(null);
        this.b = -1;
    }

    public abstract void U(ArrayList arrayList, j61 j61Var);

    public abstract CharSequence V();

    public abstract void W(v51 v51Var, View view);

    public abstract boolean X(v51 v51Var, View view);

    @Override // org.telegram.ui.ActionBar.m2
    public View createView(Context context) {
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.oo(this, 13));
        hg.r1 r1Var = new hg.r1(context, null, 1);
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false));
        l61 l61Var = new l61(this, this, new d(this, 22), new k61(this), new k61(this));
        this.a = l61Var;
        r1Var.addView(l61Var, w7.y5.c(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }
}
