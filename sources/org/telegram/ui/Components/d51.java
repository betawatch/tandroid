package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class d51 extends org.telegram.ui.ActionBar.o2 {
    public c51 a;
    public int b;
    public int c;

    public d51() {
        super(null);
        this.b = -1;
    }

    public abstract void T(ArrayList arrayList, z41 z41Var);

    public abstract CharSequence U();

    public abstract void V(l41 l41Var, View view);

    public abstract boolean W(l41 l41Var, View view);

    @Override // org.telegram.ui.ActionBar.o2
    public View createView(Context context) {
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(U());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, 8));
        b51 b51Var = new b51(context, null, 0);
        b51Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        c51 c51Var = new c51(this, this, new d(this, 22), new a51(this), new a51(this));
        this.a = c51Var;
        b51Var.addView(c51Var, g7.e6.c(-1.0f, -1));
        this.fragmentView = b51Var;
        return b51Var;
    }
}
