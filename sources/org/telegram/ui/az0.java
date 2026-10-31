package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class az0 implements org.telegram.ui.Components.ik0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ az0(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) {
            return false;
        }
        proxyListActivity.a.M(i10);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ProxyListActivity.Z(this.a);
    }
}
