package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class b3 extends org.telegram.ui.ActionBar.l3 {
    @Override // org.telegram.ui.ActionBar.l3
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.b;
        return (y0Var == null || TextUtils.isEmpty(y0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(o3 o3Var) {
        if (o3Var == null) {
            return;
        }
        m3 m3Var = o3Var.f;
        m3Var.L();
        this.b = m3Var.getWebView();
        this.d = m3Var.getProxy();
        org.telegram.ui.web.y0 y0Var = this.b;
        if (y0Var != null) {
            y0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = o3Var.w;
            this.r = o3Var.x;
        }
    }
}
