package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class o41 extends org.telegram.ui.ActionBar.f2 {
    public fi.w3 a;
    public kg.l1 b;
    public int c;
    public int d;

    public o41() {
        super(null);
        this.c = -1;
    }

    public abstract void Z(ArrayList arrayList, m41 m41Var);

    public abstract CharSequence a0();

    public abstract void b0(y31 y31Var, View view);

    public abstract boolean c0(y31 y31Var, View view);

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
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.a7, this.b, null);
        }
        fi.w3 w3Var = new fi.w3(this, this, new d(this, 22), new n41(this), new n41(this));
        this.a = w3Var;
        this.b.addView(w3Var, c8.ha.c(-1.0f, -1));
        kg.l1 l1Var = this.b;
        this.fragmentView = l1Var;
        return l1Var;
    }
}
