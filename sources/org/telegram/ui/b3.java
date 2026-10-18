package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class b3 extends org.telegram.ui.ActionBar.m3 {
    @Override // org.telegram.ui.ActionBar.m3
    public final String b() {
        org.telegram.ui.web.x0 x0Var = this.b;
        return (x0Var == null || TextUtils.isEmpty(x0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(o3 o3Var) {
        if (o3Var == null) {
            return;
        }
        m3 m3Var = o3Var.f;
        m3Var.L();
        this.b = m3Var.getWebView();
        this.d = m3Var.getProxy();
        org.telegram.ui.web.x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = o3Var.w;
            this.r = o3Var.x;
        }
    }
}
