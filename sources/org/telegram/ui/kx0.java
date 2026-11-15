package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class kx0 implements org.telegram.ui.Components.ij0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ kx0(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i7 < proxyListActivity.n || i7 >= proxyListActivity.r) {
            return false;
        }
        proxyListActivity.a.N(i7);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ProxyListActivity.a0(this.a);
    }
}
