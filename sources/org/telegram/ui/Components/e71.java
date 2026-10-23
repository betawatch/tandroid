package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public abstract class e71 extends org.telegram.ui.ActionBar.o2 {
    public d71 a;
    public int b;
    public int c;

    public e71() {
        super(null);
        this.b = -1;
    }

    public abstract void U(ArrayList arrayList, b71 b71Var);

    public abstract CharSequence V();

    public abstract void W(m61 m61Var, View view);

    public abstract boolean X(m61 m61Var, View view);

    @Override // org.telegram.ui.ActionBar.o2
    public View createView(Context context) {
        i2.o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 16));
        ig.o1 o1Var = new ig.o1(context, null, 1);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, o1Var, null);
        d71 d71Var = new d71(this, this, new d(this, 22), new c71(this), new c71(this));
        this.a = d71Var;
        o1Var.addView(d71Var, w7.z5.c(-1.0f, -1));
        this.fragmentView = o1Var;
        return o1Var;
    }
}
