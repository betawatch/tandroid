package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class p50 extends org.telegram.ui.Components.o41 {
    public boolean e;

    @Override // org.telegram.ui.Components.o41
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.m41 m41Var) {
        org.telegram.ui.ActionBar.a5 a5Var = (org.telegram.ui.ActionBar.a5) xi.e.k.a();
        org.telegram.ui.ActionBar.z4 z4Var = (org.telegram.ui.ActionBar.z4) xi.e.l.a();
        arrayList.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131749340, null)));
        org.telegram.ui.Components.y31 x10 = org.telegram.ui.Components.y31.x(11, org.telegram.messenger.id.M0(2131749339, null));
        x10.L(a5Var == org.telegram.ui.ActionBar.a5.b);
        arrayList.add(x10);
        org.telegram.ui.Components.y31 x11 = org.telegram.ui.Components.y31.x(10, org.telegram.messenger.id.M0(2131749338, null));
        x11.L(a5Var == org.telegram.ui.ActionBar.a5.a);
        arrayList.add(x11);
        arrayList.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.M0(2131749337, null)));
        arrayList.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131749333, null)));
        org.telegram.ui.Components.y31 x12 = org.telegram.ui.Components.y31.x(20, org.telegram.messenger.id.M0(2131749332, null));
        x12.L(z4Var == org.telegram.ui.ActionBar.z4.a);
        arrayList.add(x12);
        org.telegram.ui.Components.y31 x13 = org.telegram.ui.Components.y31.x(21, org.telegram.messenger.id.M0(2131749331, null));
        x13.L(z4Var == org.telegram.ui.ActionBar.z4.b);
        arrayList.add(x13);
        arrayList.add(org.telegram.ui.Components.y31.C(null));
        arrayList.add(org.telegram.ui.Components.y31.u(org.telegram.messenger.id.M0(2131749336, null)));
        org.telegram.ui.Components.y31 i7 = org.telegram.ui.Components.y31.i(30, org.telegram.messenger.id.M0(2131749335, null));
        i7.L(this.e);
        arrayList.add(i7);
        arrayList.add(org.telegram.ui.Components.y31.C(org.telegram.messenger.id.M0(2131749334, null)));
    }

    @Override // org.telegram.ui.Components.o41
    public final CharSequence a0() {
        return org.telegram.messenger.id.M0(2131749330, null);
    }

    @Override // org.telegram.ui.Components.o41
    public final void b0(org.telegram.ui.Components.y31 y31Var, View view) {
        int i7 = y31Var.d;
        if (i7 == 10 || i7 == 11) {
            xi.e.k.b(i7 == 10 ? org.telegram.ui.ActionBar.a5.a : org.telegram.ui.ActionBar.a5.b);
            d0();
        } else if (i7 == 20 || i7 == 21) {
            xi.e.l.b(i7 == 21 ? org.telegram.ui.ActionBar.z4.b : org.telegram.ui.ActionBar.z4.a);
            d0();
        } else {
            if (i7 != 30) {
                return;
            }
            this.e = !this.e;
            this.simpleActionBar.getDoneButton().a(this.e, true);
        }
        this.a.f3.O(true);
    }

    @Override // org.telegram.ui.Components.o41
    public final boolean c0(org.telegram.ui.Components.y31 y31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.o41, org.telegram.ui.ActionBar.f2
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
            y4Var.h();
            y4Var.requestLayout();
        }
        this.simpleActionBar.o(org.telegram.messenger.id.M0(2131745946, null)).a(this.e, false);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
