package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class f51 extends org.telegram.ui.ActionBar.n2 {
    public e51 a;
    public int b;
    public int c;

    public f51() {
        super(null);
        this.b = -1;
    }

    public abstract void U(ArrayList arrayList, b51 b51Var);

    public abstract CharSequence V();

    public abstract void W(n41 n41Var, View view);

    public abstract boolean X(n41 n41Var, View view);

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        org.telegram.ui.Cells.pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, 9));
        d51 d51Var = new d51(context, null, 0);
        d51Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        e51 e51Var = new e51(this, this, new d(this, 22), new c51(this), new c51(this));
        this.a = e51Var;
        d51Var.addView(e51Var, h7.z5.c(-1.0f, -1));
        this.fragmentView = d51Var;
        return d51Var;
    }
}
