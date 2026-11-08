package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class n41 extends org.telegram.ui.ActionBar.f2 {
    public fi.w3 a;
    public kg.l1 b;
    public int c;
    public int d;

    public n41() {
        super(null);
        this.c = -1;
    }

    public abstract void Z(ArrayList arrayList, l41 l41Var);

    public abstract CharSequence a0();

    public abstract void b0(x31 x31Var, View view);

    public abstract boolean c0(x31 x31Var, View view);

    @Override // org.telegram.ui.ActionBar.f2
    public View createView(Context context) {
        org.telegram.ui.w9 w9Var = new org.telegram.ui.w9(this, 18);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            this.simpleActionBar.setTitle(a0());
            this.simpleActionBar.setActionBarMenuOnItemClick(w9Var);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(a0());
            this.actionBar.setActionBarMenuOnItemClick(w9Var);
        }
        this.b = new kg.l1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, this.b, null);
        }
        fi.w3 w3Var = new fi.w3(this, this, new d(this, 22), new m41(this), new m41(this));
        this.a = w3Var;
        this.b.addView(w3Var, c8.ha.c(-1.0f, -1));
        kg.l1 l1Var = this.b;
        this.fragmentView = l1Var;
        return l1Var;
    }
}
