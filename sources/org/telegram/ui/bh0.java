package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bh0 implements ss, s9 {
    public final /* synthetic */ dh0 a;

    public /* synthetic */ bh0(dh0 dh0Var) {
        this.a = dh0Var;
    }

    @Override // org.telegram.ui.s9
    public void H(String str) {
        String c10 = vf.c.c(str);
        if (TextUtils.isEmpty(c10)) {
            org.telegram.messenger.g0.g3(new cd0(1));
        } else {
            org.telegram.messenger.mp.u1(this.a.a).f2().a(c10, null, new fi.e(20));
        }
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean Z0(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.ss
    public void d(ps psVar) {
        dh0 dh0Var = this.a;
        dh0Var.y1 = true;
        String str = psVar.c;
        dh0Var.I1.setText(str);
        dh0Var.N0(str, psVar);
        dh0Var.y1 = false;
        org.telegram.messenger.g0.h3(new gf0(this, 1), 300L);
        dh0Var.K1.requestFocus();
        ch0 ch0Var = dh0Var.K1;
        ch0Var.setSelection(ch0Var.length());
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ String w0() {
        return null;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void E0(org.telegram.messenger.ur urVar) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void onDismiss() {
    }
}
