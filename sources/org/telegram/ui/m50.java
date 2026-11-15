package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m50 extends org.telegram.ui.Components.r41 {
    public boolean e;

    @Override // org.telegram.ui.Components.r41
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.p41 p41Var) {
        org.telegram.ui.ActionBar.y4 y4Var = (org.telegram.ui.ActionBar.y4) aj.e.k.a();
        org.telegram.ui.ActionBar.x4 x4Var = (org.telegram.ui.ActionBar.x4) aj.e.l.a();
        arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131749340, null)));
        org.telegram.ui.Components.b41 x10 = org.telegram.ui.Components.b41.x(11, org.telegram.messenger.hd.M0(2131749339, null));
        x10.L(y4Var == org.telegram.ui.ActionBar.y4.b);
        arrayList.add(x10);
        org.telegram.ui.Components.b41 x11 = org.telegram.ui.Components.b41.x(10, org.telegram.messenger.hd.M0(2131749338, null));
        x11.L(y4Var == org.telegram.ui.ActionBar.y4.a);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131749337, null)));
        arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131749333, null)));
        org.telegram.ui.Components.b41 x12 = org.telegram.ui.Components.b41.x(20, org.telegram.messenger.hd.M0(2131749332, null));
        x12.L(x4Var == org.telegram.ui.ActionBar.x4.a);
        arrayList.add(x12);
        org.telegram.ui.Components.b41 x13 = org.telegram.ui.Components.b41.x(21, org.telegram.messenger.hd.M0(2131749331, null));
        x13.L(x4Var == org.telegram.ui.ActionBar.x4.b);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.b41.C(null));
        arrayList.add(org.telegram.ui.Components.b41.u(org.telegram.messenger.hd.M0(2131749336, null)));
        org.telegram.ui.Components.b41 i7 = org.telegram.ui.Components.b41.i(30, org.telegram.messenger.hd.M0(2131749335, null));
        i7.L(this.e);
        arrayList.add(i7);
        arrayList.add(org.telegram.ui.Components.b41.C(org.telegram.messenger.hd.M0(2131749334, null)));
    }

    @Override // org.telegram.ui.Components.r41
    public final CharSequence a0() {
        return org.telegram.messenger.hd.M0(2131749330, null);
    }

    @Override // org.telegram.ui.Components.r41
    public final void b0(org.telegram.ui.Components.b41 b41Var, View view) {
        int i7 = b41Var.d;
        if (i7 == 10 || i7 == 11) {
            aj.e.k.b(i7 == 10 ? org.telegram.ui.ActionBar.y4.a : org.telegram.ui.ActionBar.y4.b);
            d0();
        } else if (i7 == 20 || i7 == 21) {
            aj.e.l.b(i7 == 21 ? org.telegram.ui.ActionBar.x4.b : org.telegram.ui.ActionBar.x4.a);
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

    @Override // org.telegram.ui.Components.r41
    public final boolean c0(org.telegram.ui.Components.b41 b41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.z4 z4Var = w4Var.n;
        if (z4Var != null) {
            w4Var.removeView(z4Var);
            w4Var.n = null;
            w4Var.j();
            w4Var.requestLayout();
        }
        this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null)).a(this.e, false);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
