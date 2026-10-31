package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class r51 extends org.telegram.ui.ActionBar.k2 {
    public ii a;
    public ag.t2 b;
    public int c;
    public int d;

    public r51() {
        super(null);
        this.c = -1;
    }

    public abstract void Y(ArrayList arrayList, p51 p51Var);

    public abstract CharSequence Z();

    public abstract void a0(a51 a51Var, View view);

    public abstract boolean b0(a51 a51Var, View view);

    @Override // org.telegram.ui.ActionBar.k2
    public View createView(Context context) {
        org.telegram.ui.ar arVar = new org.telegram.ui.ar(this, 9);
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
            this.simpleActionBar.setTitle(Z());
            this.simpleActionBar.setActionBarMenuOnItemClick(arVar);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(Z());
            this.actionBar.setActionBarMenuOnItemClick(arVar);
        }
        this.b = new ag.t2(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, this.b, null);
        }
        ii iiVar = new ii(this, this, new d(this, 22), new q51(this), new q51(this));
        this.a = iiVar;
        this.b.addView(iiVar, w7.b6.c(-1.0f, -1));
        ag.t2 t2Var = this.b;
        this.fragmentView = t2Var;
        return t2Var;
    }
}
