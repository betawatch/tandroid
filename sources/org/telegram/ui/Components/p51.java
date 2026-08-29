package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class p51 extends org.telegram.ui.ActionBar.o2 {
    public o51 a;
    public int b;
    public int c;

    public p51() {
        super(null);
        this.b = -1;
    }

    public abstract void U(ArrayList arrayList, k51 k51Var);

    public abstract CharSequence V();

    public abstract void W(w41 w41Var, View view);

    public abstract boolean X(w41 w41Var, View view);

    @Override // org.telegram.ui.ActionBar.o2
    public View createView(Context context) {
        org.telegram.ui.th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new m51(this, 0));
        n51 n51Var = new n51(context, null, 0);
        n51Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
        o51 o51Var = new o51(this, this, new d(this, 22), new l51(this), new l51(this));
        this.a = o51Var;
        n51Var.addView(o51Var, i7.f6.c(-1.0f, -1));
        this.fragmentView = n51Var;
        return n51Var;
    }
}
