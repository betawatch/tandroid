package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class b51 extends org.telegram.ui.ActionBar.h2 {
    public bi.c6 a;
    public kg.o1 b;
    public int c;
    public int d;

    public b51() {
        super(null);
        this.c = -1;
    }

    public abstract void Z(ArrayList arrayList, z41 z41Var);

    public abstract CharSequence a0();

    public abstract void b0(l41 l41Var, View view);

    public abstract boolean c0(l41 l41Var, View view);

    @Override // org.telegram.ui.ActionBar.h2
    public View createView(Context context) {
        org.telegram.ui.x7 x7Var = new org.telegram.ui.x7(this, 21);
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        if (a5Var != null) {
            a5Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            this.simpleActionBar.setTitle(a0());
            this.simpleActionBar.setActionBarMenuOnItemClick(x7Var);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(a0());
            this.actionBar.setActionBarMenuOnItemClick(x7Var);
        }
        this.b = new kg.o1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, this.b, null);
        }
        bi.c6 c6Var = new bi.c6(this, this, new d(this, 23), new a51(this), new a51(this));
        this.a = c6Var;
        this.b.addView(c6Var, c8.ma.c(-1.0f, -1));
        kg.o1 o1Var = this.b;
        this.fragmentView = o1Var;
        return o1Var;
    }
}
