package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class o50 extends org.telegram.ui.Components.b51 {
    public boolean e;

    @Override // org.telegram.ui.Components.b51
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.z41 z41Var) {
        org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) aj.e.k.a();
        org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) aj.e.l.a();
        arrayList.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131749148, null)));
        org.telegram.ui.Components.l41 x10 = org.telegram.ui.Components.l41.x(11, org.telegram.messenger.gd.M0(2131749147, null));
        x10.L(c5Var == org.telegram.ui.ActionBar.c5.b);
        arrayList.add(x10);
        org.telegram.ui.Components.l41 x11 = org.telegram.ui.Components.l41.x(10, org.telegram.messenger.gd.M0(2131749146, null));
        x11.L(c5Var == org.telegram.ui.ActionBar.c5.a);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131749145, null)));
        arrayList.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131749141, null)));
        org.telegram.ui.Components.l41 x12 = org.telegram.ui.Components.l41.x(20, org.telegram.messenger.gd.M0(2131749140, null));
        x12.L(b5Var == org.telegram.ui.ActionBar.b5.a);
        arrayList.add(x12);
        org.telegram.ui.Components.l41 x13 = org.telegram.ui.Components.l41.x(21, org.telegram.messenger.gd.M0(2131749139, null));
        x13.L(b5Var == org.telegram.ui.ActionBar.b5.b);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.l41.C(null));
        arrayList.add(org.telegram.ui.Components.l41.u(org.telegram.messenger.gd.M0(2131749144, null)));
        org.telegram.ui.Components.l41 i7 = org.telegram.ui.Components.l41.i(30, org.telegram.messenger.gd.M0(2131749143, null));
        i7.L(this.e);
        arrayList.add(i7);
        arrayList.add(org.telegram.ui.Components.l41.C(org.telegram.messenger.gd.M0(2131749142, null)));
    }

    @Override // org.telegram.ui.Components.b51
    public final CharSequence a0() {
        return org.telegram.messenger.gd.M0(2131749138, null);
    }

    @Override // org.telegram.ui.Components.b51
    public final void b0(org.telegram.ui.Components.l41 l41Var, View view) {
        int i7 = l41Var.d;
        if (i7 == 10 || i7 == 11) {
            aj.e.k.b(i7 == 10 ? org.telegram.ui.ActionBar.c5.a : org.telegram.ui.ActionBar.c5.b);
            d0();
        } else if (i7 == 20 || i7 == 21) {
            aj.e.l.b(i7 == 21 ? org.telegram.ui.ActionBar.b5.b : org.telegram.ui.ActionBar.b5.a);
            d0();
        } else {
            if (i7 != 30) {
                return;
            }
            this.e = !this.e;
            this.simpleActionBar.getDoneButton().a(this.e, true);
        }
        this.a.g3.O(true);
    }

    @Override // org.telegram.ui.Components.b51
    public final boolean c0(org.telegram.ui.Components.l41 l41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.b51, org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.d5 d5Var = a5Var.n;
        if (d5Var != null) {
            a5Var.removeView(d5Var);
            a5Var.n = null;
            a5Var.l();
            a5Var.requestLayout();
        }
        this.simpleActionBar.s(org.telegram.messenger.gd.M0(2131745751, null)).a(this.e, false);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
