package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class dh0 implements ts, s9 {
    public final /* synthetic */ fh0 a;

    public /* synthetic */ dh0(fh0 fh0Var) {
        this.a = fh0Var;
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

    @Override // org.telegram.ui.ts
    public void b(ps psVar) {
        fh0 fh0Var = this.a;
        fh0Var.y1 = true;
        String str = psVar.c;
        fh0Var.I1.setText(str);
        fh0Var.N0(str, psVar);
        fh0Var.y1 = false;
        org.telegram.messenger.g0.h3(new hf0(this, 1), 300L);
        fh0Var.K1.requestFocus();
        eh0 eh0Var = fh0Var.K1;
        eh0Var.setSelection(eh0Var.length());
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean c1(String str, k9 k9Var) {
        return false;
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void S0(org.telegram.messenger.ur urVar) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void onDismiss() {
    }
}
