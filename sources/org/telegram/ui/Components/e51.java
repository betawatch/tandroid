package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class e51 extends org.telegram.ui.ActionBar.g2 {
    public bi.g6 a;
    public kg.n1 b;
    public int c;
    public int d;

    public e51() {
        super(null);
        this.c = -1;
    }

    public abstract void Z(ArrayList arrayList, c51 c51Var);

    public abstract CharSequence a0();

    public abstract void b0(o41 o41Var, View view);

    public abstract boolean c0(o41 o41Var, View view);

    @Override // org.telegram.ui.ActionBar.g2
    public View createView(Context context) {
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 21);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
            this.simpleActionBar.setTitle(a0());
            this.simpleActionBar.setActionBarMenuOnItemClick(x7Var);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(a0());
            this.actionBar.setActionBarMenuOnItemClick(x7Var);
        }
        this.b = new kg.n1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, this.b, null);
        }
        bi.g6 g6Var = new bi.g6(this, this, new d(this, 23), new d51(this), new d51(this));
        this.a = g6Var;
        this.b.addView(g6Var, c8.ma.c(-1.0f, -1));
        kg.n1 n1Var = this.b;
        this.fragmentView = n1Var;
        return n1Var;
    }
}
