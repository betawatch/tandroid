package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ox0 implements org.telegram.ui.Components.qj0, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ ox0(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i7 < proxyListActivity.n || i7 >= proxyListActivity.r) {
            return false;
        }
        proxyListActivity.a.M(i7);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ProxyListActivity.a0(this.a);
    }
}
