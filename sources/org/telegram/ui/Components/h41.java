package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class h41 extends org.telegram.ui.ActionBar.d2 {
    public ai.h4 a;
    public lg.m1 b;
    public int c;
    public int d;

    public h41() {
        super(null);
        this.c = -1;
    }

    public abstract void Z(ArrayList arrayList, f41 f41Var);

    public abstract CharSequence a0();

    public abstract void b0(r31 r31Var, View view);

    public abstract boolean c0(r31 r31Var, View view);

    @Override // org.telegram.ui.ActionBar.d2
    public View createView(Context context) {
        org.telegram.ui.o9 o9Var = new org.telegram.ui.o9(this, 19);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
            this.simpleActionBar.setTitle(a0());
            this.simpleActionBar.setActionBarMenuOnItemClick(o9Var);
        } else {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
            this.actionBar.setAllowOverlayTitle(true);
            this.actionBar.setTitle(a0());
            this.actionBar.setActionBarMenuOnItemClick(o9Var);
        }
        this.b = new lg.m1(context, null, 1);
        if (!useSimpleActionBar()) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, this.b, null);
        }
        ai.h4 h4Var = new ai.h4(this, this, new e(this, 22), new g41(this), new g41(this));
        this.a = h4Var;
        this.b.addView(h4Var, b8.mf.c(-1.0f, -1));
        lg.m1 m1Var = this.b;
        this.fragmentView = m1Var;
        return m1Var;
    }
}
