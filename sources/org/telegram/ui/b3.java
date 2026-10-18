package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class b3 extends org.telegram.ui.ActionBar.m3 {
    @Override // org.telegram.ui.ActionBar.m3
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
