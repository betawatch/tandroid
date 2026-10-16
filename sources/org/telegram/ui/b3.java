package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b3 extends org.telegram.ui.ActionBar.l3 {
    @Override // org.telegram.ui.ActionBar.l3
    public final String b() {
        org.telegram.ui.web.z0 z0Var = this.b;
        return (z0Var == null || TextUtils.isEmpty(z0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(o3 o3Var) {
        if (o3Var == null) {
            return;
        }
        m3 m3Var = o3Var.f;
        m3Var.L();
        this.b = m3Var.getWebView();
        this.d = m3Var.getProxy();
        org.telegram.ui.web.z0 z0Var = this.b;
        if (z0Var != null) {
            z0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = o3Var.w;
            this.r = o3Var.x;
        }
    }
}
