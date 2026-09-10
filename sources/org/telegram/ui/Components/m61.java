package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class m61 extends org.telegram.ui.ActionBar.p2 {
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

    @Override // org.telegram.ui.ActionBar.p2
    public View createView(Context context) {
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(V());
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.vo(this, 13));
        gg.z1 z1Var = new gg.z1(context, null, 1);
        z1Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        l61 l61Var = new l61(this, this, new e(this, 22), new k61(this), new k61(this));
        this.a = l61Var;
        z1Var.addView(l61Var, w7.a6.c(-1.0f, -1));
        this.fragmentView = z1Var;
        return z1Var;
    }
}
