package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h50 extends org.telegram.ui.Components.h41 {
    public boolean e;

    @Override // org.telegram.ui.Components.h41
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.f41 f41Var) {
        org.telegram.ui.ActionBar.a5 a5Var = (org.telegram.ui.ActionBar.a5) xi.e.k.a();
        org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) xi.e.l.a();
        arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131749348, null)));
        org.telegram.ui.Components.r31 x10 = org.telegram.ui.Components.r31.x(11, org.telegram.messenger.bd.M0(2131749347, null));
        x10.L(a5Var == org.telegram.ui.ActionBar.a5.b);
        arrayList.add(x10);
        org.telegram.ui.Components.r31 x11 = org.telegram.ui.Components.r31.x(10, org.telegram.messenger.bd.M0(2131749346, null));
        x11.L(a5Var == org.telegram.ui.ActionBar.a5.a);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131749345, null)));
        arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131749341, null)));
        org.telegram.ui.Components.r31 x12 = org.telegram.ui.Components.r31.x(20, org.telegram.messenger.bd.M0(2131749340, null));
        x12.L(z4Var == org.telegram.ui.ActionBar.z4.a);
        arrayList.add(x12);
        org.telegram.ui.Components.r31 x13 = org.telegram.ui.Components.r31.x(21, org.telegram.messenger.bd.M0(2131749339, null));
        x13.L(z4Var == org.telegram.ui.ActionBar.z4.b);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.r31.C(null));
        arrayList.add(org.telegram.ui.Components.r31.u(org.telegram.messenger.bd.M0(2131749344, null)));
        org.telegram.ui.Components.r31 i3 = org.telegram.ui.Components.r31.i(30, org.telegram.messenger.bd.M0(2131749343, null));
        i3.L(this.e);
        arrayList.add(i3);
        arrayList.add(org.telegram.ui.Components.r31.C(org.telegram.messenger.bd.M0(2131749342, null)));
    }

    @Override // org.telegram.ui.Components.h41
    public final CharSequence a0() {
        return org.telegram.messenger.bd.M0(2131749338, null);
    }

    @Override // org.telegram.ui.Components.h41
    public final void b0(org.telegram.ui.Components.r31 r31Var, View view) {
        int i3 = r31Var.d;
        if (i3 == 10 || i3 == 11) {
            xi.e.k.b(i3 == 10 ? org.telegram.ui.ActionBar.a5.a : org.telegram.ui.ActionBar.a5.b);
            d0();
        } else if (i3 == 20 || i3 == 21) {
            xi.e.l.b(i3 == 21 ? org.telegram.ui.ActionBar.z4.b : org.telegram.ui.ActionBar.z4.a);
            d0();
        } else {
            if (i3 != 30) {
                return;
            }
            this.e = !this.e;
            this.simpleActionBar.getDoneButton().a(this.e, true);
        }
        this.a.g3.O(true);
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean c0(org.telegram.ui.Components.r31 r31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.b5 b5Var = y4Var.n;
        if (b5Var != null) {
            y4Var.removeView(b5Var);
            y4Var.n = null;
            y4Var.g();
            y4Var.requestLayout();
        }
        this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null)).a(this.e, false);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
