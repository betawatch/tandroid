package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d3 extends org.telegram.ui.ActionBar.l3 {
    @Override // org.telegram.ui.ActionBar.l3
    public final String b() {
        org.telegram.ui.web.w0 w0Var = this.b;
        return (w0Var == null || TextUtils.isEmpty(w0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(q3 q3Var) {
        if (q3Var == null) {
            return;
        }
        o3 o3Var = q3Var.f;
        o3Var.g("preserveWebView");
        o3Var.v0 = true;
        if (o3Var.k0) {
            o3Var.v("visibility_changed", org.telegram.ui.web.z0.x(Boolean.FALSE, "is_visible"));
        }
        this.b = o3Var.getWebView();
        this.d = o3Var.getProxy();
        org.telegram.ui.web.w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.onPause();
            this.C = this.b.getTitle();
            this.D = this.b.getFavicon();
            this.v = this.b.getUrl();
            this.o = q3Var.w;
            this.p = q3Var.x;
        }
    }
}
