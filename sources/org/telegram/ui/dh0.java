package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class dh0 implements ss, s9 {
    public final /* synthetic */ fh0 a;

    public /* synthetic */ dh0(fh0 fh0Var) {
        this.a = fh0Var;
    }

    @Override // org.telegram.ui.s9
    public void J(String str) {
        String c10 = vf.c.c(str);
        if (TextUtils.isEmpty(c10)) {
            org.telegram.messenger.g0.g3(new dd0(1));
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
        fh0 fh0Var = this.a;
        fh0Var.y1 = true;
        String str = psVar.c;
        fh0Var.I1.setText(str);
        fh0Var.N0(str, psVar);
        fh0Var.y1 = false;
        org.telegram.messenger.g0.h3(new if0(this, 1), 300L);
        fh0Var.K1.requestFocus();
        eh0 eh0Var = fh0Var.K1;
        eh0Var.setSelection(eh0Var.length());
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
