package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class z61 extends org.telegram.ui.ActionBar.n2 {
    public y61 a;
    public hg.q1 b;
    public int c;
    public int d;

    public z61() {
        super(null);
        this.c = -1;
    }

    public abstract void S(ArrayList arrayList, w61 w61Var);

    public abstract CharSequence T();

    public abstract void U(h61 h61Var, View view);

    public abstract boolean W(h61 h61Var, View view);

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        hg.c.u(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(T());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.qo(this, 13));
        hg.q1 q1Var = new hg.q1(context, null, 1);
        this.b = q1Var;
        q1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false));
        y61 y61Var = new y61(this, this, new d(this, 22), new x61(this), new x61(this));
        this.a = y61Var;
        this.b.addView(y61Var, w7.z5.c(-1.0f, -1));
        hg.q1 q1Var2 = this.b;
        this.fragmentView = q1Var2;
        return q1Var2;
    }
}
