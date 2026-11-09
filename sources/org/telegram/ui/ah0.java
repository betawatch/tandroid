package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ah0 implements rs, r9 {
    public final /* synthetic */ ch0 a;

    public /* synthetic */ ah0(ch0 ch0Var) {
        this.a = ch0Var;
    }

    @Override // org.telegram.ui.r9
    public void M(String str) {
        String c10 = vf.c.c(str);
        if (TextUtils.isEmpty(c10)) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.vs(25));
        } else {
            org.telegram.messenger.qp.s1(this.a.a).d2().a(c10, null, new di.e(19));
        }
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ String R0() {
        return null;
    }

    @Override // org.telegram.ui.rs
    public void b(os osVar) {
        ch0 ch0Var = this.a;
        ch0Var.u1 = true;
        String str = osVar.c;
        ch0Var.E1.setText(str);
        ch0Var.M0(str, osVar);
        ch0Var.u1 = false;
        org.telegram.messenger.g0.i3(new gf0(this, 1), 300L);
        ch0Var.G1.requestFocus();
        bh0 bh0Var = ch0Var.G1;
        bh0Var.setSelection(bh0Var.length());
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean h1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void V0(org.telegram.messenger.zr zrVar) {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void onDismiss() {
    }
}
