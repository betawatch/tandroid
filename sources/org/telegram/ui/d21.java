package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d21 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ ProxyListActivity a;

    public /* synthetic */ d21(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean d(int i10, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i10 < proxyListActivity.n || i10 >= proxyListActivity.r) {
            return false;
        }
        proxyListActivity.a.G(i10);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ProxyListActivity.V(this.a);
    }
}
