package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dx0 implements org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ dx0(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i3 < proxyListActivity.n || i3 >= proxyListActivity.r) {
            return false;
        }
        proxyListActivity.a.M(i3);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        ProxyListActivity.a0(this.a);
    }
}
