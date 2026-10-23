package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class a3 extends org.telegram.ui.ActionBar.p3 {
    @Override // org.telegram.ui.ActionBar.p3
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.b;
        return (y0Var == null || TextUtils.isEmpty(y0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(n3 n3Var) {
        if (n3Var == null) {
            return;
        }
        l3 l3Var = n3Var.f;
        l3Var.L();
        this.b = l3Var.getWebView();
        this.d = l3Var.getProxy();
        org.telegram.ui.web.y0 y0Var = this.b;
        if (y0Var != null) {
            y0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = n3Var.w;
            this.r = n3Var.x;
        }
    }
}
