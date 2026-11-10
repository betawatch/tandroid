package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bh0 implements ss, r9 {
    public final /* synthetic */ dh0 a;

    public /* synthetic */ bh0(dh0 dh0Var) {
        this.a = dh0Var;
    }

    @Override // org.telegram.ui.r9
    public void M(String str) {
        String c10 = vf.c.c(str);
        if (TextUtils.isEmpty(c10)) {
            org.telegram.messenger.g0.h3(new org.telegram.ui.Components.us(25));
        } else {
            org.telegram.messenger.qp.s1(this.a.a).d2().a(c10, null, new di.e(19));
        }
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ String R0() {
        return null;
    }

    @Override // org.telegram.ui.ss
    public void b(ps psVar) {
        dh0 dh0Var = this.a;
        dh0Var.x1 = true;
        String str = psVar.c;
        dh0Var.H1.setText(str);
        dh0Var.M0(str, psVar);
        dh0Var.x1 = false;
        org.telegram.messenger.g0.i3(new hf0(this, 1), 300L);
        dh0Var.J1.requestFocus();
        ch0 ch0Var = dh0Var.J1;
        ch0Var.setSelection(ch0Var.length());
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
