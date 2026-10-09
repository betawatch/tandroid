package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class f71 extends org.telegram.ui.ActionBar.n2 {
    public e71 a;
    public int b;
    public int c;

    public f71() {
        super(null);
        this.b = -1;
    }

    public abstract void U(ArrayList arrayList, c71 c71Var);

    public abstract CharSequence V();

    public abstract void W(p61 p61Var, View view);

    public abstract boolean X(p61 p61Var, View view);

    @Override // org.telegram.ui.ActionBar.n2
    public View createView(Context context) {
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ro(this, 13));
        hg.r1 r1Var = new hg.r1(context, null, 1);
        r1Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.a7, false));
        e71 e71Var = new e71(this, this, new d(this, 22), new d71(this), new d71(this));
        this.a = e71Var;
        r1Var.addView(e71Var, w7.x5.d(-1.0f, -1));
        this.fragmentView = r1Var;
        return r1Var;
    }
}
