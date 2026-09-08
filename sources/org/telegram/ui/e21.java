package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class e21 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ e21(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i10 < proxyListActivity.r || i10 >= proxyListActivity.s) {
            return false;
        }
        proxyListActivity.a.G(i10);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.a);
    }
}
