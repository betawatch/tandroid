package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ei0 implements qt, t9 {
    public final /* synthetic */ gi0 a;

    public /* synthetic */ ei0(gi0 gi0Var) {
        this.a = gi0Var;
    }

    @Override // org.telegram.ui.t9
    public void L(String str) {
        String b10 = gf.f.b(str);
        if (TextUtils.isEmpty(b10)) {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(11));
        } else {
            org.telegram.messenger.vp.r1(this.a.a).c2().a(b10, null, new ag.z0(17));
        }
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ String P0() {
        return null;
    }

    @Override // org.telegram.ui.qt
    public void c(nt ntVar) {
        gi0 gi0Var = this.a;
        gi0Var.u1 = true;
        String str = ntVar.c;
        gi0Var.E1.setText(str);
        gi0Var.M0(str, ntVar);
        gi0Var.u1 = false;
        org.telegram.messenger.i0.h3(new mg0(this, 1), 300L);
        gi0Var.G1.requestFocus();
        fi0 fi0Var = gi0Var.G1;
        fi0Var.setSelection(fi0Var.length());
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void X0(org.telegram.messenger.is isVar) {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void onDismiss() {
    }
}
