package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ci0 implements pt, t9 {
    public final /* synthetic */ ei0 a;

    public /* synthetic */ ci0(ei0 ei0Var) {
        this.a = ei0Var;
    }

    @Override // org.telegram.ui.t9
    public void L(String str) {
        String b10 = gf.f.b(str);
        if (TextUtils.isEmpty(b10)) {
            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.n0(11));
        } else {
            org.telegram.messenger.wp.r1(this.a.a).c2().a(b10, null, new ag.z0(17));
        }
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ String P0() {
        return null;
    }

    @Override // org.telegram.ui.pt
    public void c(mt mtVar) {
        ei0 ei0Var = this.a;
        ei0Var.u1 = true;
        String str = mtVar.c;
        ei0Var.E1.setText(str);
        ei0Var.M0(str, mtVar);
        ei0Var.u1 = false;
        org.telegram.messenger.i0.h3(new kg0(this, 1), 300L);
        ei0Var.G1.requestFocus();
        di0 di0Var = ei0Var.G1;
        di0Var.setSelection(di0Var.length());
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void X0(org.telegram.messenger.js jsVar) {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void onDismiss() {
    }
}
