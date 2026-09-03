package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d3 extends org.telegram.ui.ActionBar.m3 {
    @Override // org.telegram.ui.ActionBar.m3
    public final String b() {
        org.telegram.ui.web.y0 y0Var = this.b;
        return (y0Var == null || TextUtils.isEmpty(y0Var.getTitle())) ? super.b() : this.b.getTitle();
    }

    public final void c(r3 r3Var) {
        if (r3Var == null) {
            return;
        }
        p3 p3Var = r3Var.f;
        p3Var.M();
        this.b = p3Var.getWebView();
        this.d = p3Var.getProxy();
        org.telegram.ui.web.y0 y0Var = this.b;
        if (y0Var != null) {
            y0Var.onPause();
            this.E = this.b.getTitle();
            this.F = this.b.getFavicon();
            this.x = this.b.getUrl();
            this.q = r3Var.w;
            this.r = r3Var.x;
        }
    }
}
