package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l60 extends org.telegram.ui.Components.r51 {
    public boolean e;

    @Override // org.telegram.ui.Components.r51
    public final void Y(ArrayList arrayList, org.telegram.ui.Components.p51 p51Var) {
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) mi.e.k.a();
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) mi.e.l.a();
        arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131749349, null)));
        org.telegram.ui.Components.a51 x10 = org.telegram.ui.Components.a51.x(11, org.telegram.messenger.cd.L0(2131749348, null));
        x10.L(k5Var == org.telegram.ui.ActionBar.k5.b);
        arrayList.add(x10);
        org.telegram.ui.Components.a51 x11 = org.telegram.ui.Components.a51.x(10, org.telegram.messenger.cd.L0(2131749347, null));
        x11.L(k5Var == org.telegram.ui.ActionBar.k5.a);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131749346, null)));
        arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131749342, null)));
        org.telegram.ui.Components.a51 x12 = org.telegram.ui.Components.a51.x(20, org.telegram.messenger.cd.L0(2131749341, null));
        x12.L(j5Var == org.telegram.ui.ActionBar.j5.a);
        arrayList.add(x12);
        org.telegram.ui.Components.a51 x13 = org.telegram.ui.Components.a51.x(21, org.telegram.messenger.cd.L0(2131749340, null));
        x13.L(j5Var == org.telegram.ui.ActionBar.j5.b);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.a51.C(null));
        arrayList.add(org.telegram.ui.Components.a51.u(org.telegram.messenger.cd.L0(2131749345, null)));
        org.telegram.ui.Components.a51 i10 = org.telegram.ui.Components.a51.i(30, org.telegram.messenger.cd.L0(2131749344, null));
        i10.L(this.e);
        arrayList.add(i10);
        arrayList.add(org.telegram.ui.Components.a51.C(org.telegram.messenger.cd.L0(2131749343, null)));
    }

    @Override // org.telegram.ui.Components.r51
    public final CharSequence Z() {
        return org.telegram.messenger.cd.L0(2131749339, null);
    }

    @Override // org.telegram.ui.Components.r51
    public final void a0(org.telegram.ui.Components.a51 a51Var, View view) {
        int i10 = a51Var.d;
        if (i10 == 10 || i10 == 11) {
            mi.e.k.b(i10 == 10 ? org.telegram.ui.ActionBar.k5.a : org.telegram.ui.ActionBar.k5.b);
            c0();
        } else if (i10 == 20 || i10 == 21) {
            mi.e.l.b(i10 == 21 ? org.telegram.ui.ActionBar.j5.b : org.telegram.ui.ActionBar.j5.a);
            c0();
        } else {
            if (i10 != 30) {
                return;
            }
            this.e = !this.e;
            this.simpleActionBar.getDoneButton().a(this.e, true);
        }
        this.a.f3.O(true);
    }

    @Override // org.telegram.ui.Components.r51
    public final boolean b0(org.telegram.ui.Components.a51 a51Var, View view) {
        return false;
    }

    public final void c0() {
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.l5 l5Var = i5Var.n;
        if (l5Var != null) {
            i5Var.removeView(l5Var);
            i5Var.n = null;
            i5Var.g();
            i5Var.requestLayout();
        }
        this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null)).a(this.e, false);
    }

    @Override // org.telegram.ui.Components.r51, org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        c0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
