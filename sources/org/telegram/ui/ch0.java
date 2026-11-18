package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ch0 implements ss, s9 {
    public final /* synthetic */ eh0 a;

    public /* synthetic */ ch0(eh0 eh0Var) {
        this.a = eh0Var;
    }

    @Override // org.telegram.ui.s9
    public void J(String str) {
        String c10 = vf.c.c(str);
        if (TextUtils.isEmpty(c10)) {
            org.telegram.messenger.g0.g3(new cd0(1));
        } else {
            org.telegram.messenger.mp.u1(this.a.a).f2().a(c10, null, new fi.e(20));
        }
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ String J0() {
        return null;
    }

    @Override // org.telegram.ui.ss
    public void b(ps psVar) {
        eh0 eh0Var = this.a;
        eh0Var.y1 = true;
        String str = psVar.c;
        eh0Var.I1.setText(str);
        eh0Var.N0(str, psVar);
        eh0Var.y1 = false;
        org.telegram.messenger.g0.h3(new hf0(this, 1), 300L);
        eh0Var.K1.requestFocus();
        dh0 dh0Var = eh0Var.K1;
        dh0Var.setSelection(dh0Var.length());
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean c1(String str, j9 j9Var) {
        return false;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void S0(org.telegram.messenger.ur urVar) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void onDismiss() {
    }
}
