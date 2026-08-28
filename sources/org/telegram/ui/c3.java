package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c3 extends org.telegram.ui.ActionBar.l3 {
    @Override // org.telegram.ui.ActionBar.l3
    public final String b() {
        org.telegram.ui.web.v0 v0Var = this.b;
        return (v0Var == null || TextUtils.isEmpty(v0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(p3 p3Var) {
        if (p3Var == null) {
            return;
        }
        n3 n3Var = p3Var.f;
        n3Var.g("preserveWebView");
        n3Var.v0 = true;
        if (n3Var.k0) {
            n3Var.v("visibility_changed", org.telegram.ui.web.y0.x(Boolean.FALSE, "is_visible"));
        }
        this.b = n3Var.getWebView();
        this.d = n3Var.getProxy();
        org.telegram.ui.web.v0 v0Var = this.b;
        if (v0Var != null) {
            v0Var.onPause();
            this.C = this.b.getTitle();
            this.D = this.b.getFavicon();
            this.v = this.b.getUrl();
            this.o = p3Var.w;
            this.p = p3Var.x;
        }
    }
}
