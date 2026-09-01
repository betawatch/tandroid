package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b3 extends org.telegram.ui.ActionBar.n3 {
    @Override // org.telegram.ui.ActionBar.n3
    public final String b() {
        org.telegram.ui.web.x0 x0Var = this.b;
        return (x0Var == null || TextUtils.isEmpty(x0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(p3 p3Var) {
        if (p3Var == null) {
            return;
        }
        n3 n3Var = p3Var.f;
        n3Var.g("preserveWebView");
        n3Var.w0 = true;
        if (n3Var.l0) {
            n3Var.v("visibility_changed", org.telegram.ui.web.a1.x(Boolean.FALSE, "is_visible"));
        }
        this.b = n3Var.getWebView();
        this.d = n3Var.getProxy();
        org.telegram.ui.web.x0 x0Var = this.b;
        if (x0Var != null) {
            x0Var.onPause();
            this.C = this.b.getTitle();
            this.D = this.b.getFavicon();
            this.v = this.b.getUrl();
            this.o = p3Var.w;
            this.p = p3Var.x;
        }
    }
}
