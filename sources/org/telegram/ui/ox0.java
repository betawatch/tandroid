package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ox0 implements org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ ox0(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i7 < proxyListActivity.n || i7 >= proxyListActivity.r) {
            return false;
        }
        proxyListActivity.a.M(i7);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ProxyListActivity.a0(this.a);
    }
}
