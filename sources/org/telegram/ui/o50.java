package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class o50 extends org.telegram.ui.Components.e51 {
    public boolean e;

    @Override // org.telegram.ui.Components.e51
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.c51 c51Var) {
        org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) aj.e.k.a();
        org.telegram.ui.ActionBar.a5 a5Var = (org.telegram.ui.ActionBar.a5) aj.e.l.a();
        arrayList.add(org.telegram.ui.Components.o41.u(org.telegram.messenger.hd.N0(2131749147, null)));
        org.telegram.ui.Components.o41 x10 = org.telegram.ui.Components.o41.x(11, org.telegram.messenger.hd.N0(2131749146, null));
        x10.L(b5Var == org.telegram.ui.ActionBar.b5.b);
        arrayList.add(x10);
        org.telegram.ui.Components.o41 x11 = org.telegram.ui.Components.o41.x(10, org.telegram.messenger.hd.N0(2131749145, null));
        x11.L(b5Var == org.telegram.ui.ActionBar.b5.a);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131749144, null)));
        arrayList.add(org.telegram.ui.Components.o41.u(org.telegram.messenger.hd.N0(2131749140, null)));
        org.telegram.ui.Components.o41 x12 = org.telegram.ui.Components.o41.x(20, org.telegram.messenger.hd.N0(2131749139, null));
        x12.L(a5Var == org.telegram.ui.ActionBar.a5.a);
        arrayList.add(x12);
        org.telegram.ui.Components.o41 x13 = org.telegram.ui.Components.o41.x(21, org.telegram.messenger.hd.N0(2131749138, null));
        x13.L(a5Var == org.telegram.ui.ActionBar.a5.b);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.o41.C(null));
        arrayList.add(org.telegram.ui.Components.o41.u(org.telegram.messenger.hd.N0(2131749143, null)));
        org.telegram.ui.Components.o41 i7 = org.telegram.ui.Components.o41.i(30, org.telegram.messenger.hd.N0(2131749142, null));
        i7.L(this.e);
        arrayList.add(i7);
        arrayList.add(org.telegram.ui.Components.o41.C(org.telegram.messenger.hd.N0(2131749141, null)));
    }

    @Override // org.telegram.ui.Components.e51
    public final CharSequence a0() {
        return org.telegram.messenger.hd.N0(2131749137, null);
    }

    @Override // org.telegram.ui.Components.e51
    public final void b0(org.telegram.ui.Components.o41 o41Var, View view) {
        int i7 = o41Var.d;
        if (i7 == 10 || i7 == 11) {
            aj.e.k.b(i7 == 10 ? org.telegram.ui.ActionBar.b5.a : org.telegram.ui.ActionBar.b5.b);
            d0();
        } else if (i7 == 20 || i7 == 21) {
            aj.e.l.b(i7 == 21 ? org.telegram.ui.ActionBar.a5.b : org.telegram.ui.ActionBar.a5.a);
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

    @Override // org.telegram.ui.Components.e51
    public final boolean c0(org.telegram.ui.Components.o41 o41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.e51, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.c5 c5Var = z4Var.n;
        if (c5Var != null) {
            z4Var.removeView(c5Var);
            z4Var.n = null;
            z4Var.l();
            z4Var.requestLayout();
        }
        this.simpleActionBar.s(org.telegram.messenger.hd.N0(2131745750, null)).a(this.e, false);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
