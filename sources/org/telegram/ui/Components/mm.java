package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm implements wk, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ org.telegram.messenger.q20 a;

    public /* synthetic */ mm(org.telegram.messenger.q20 q20Var) {
        this.a = q20Var;
    }

    @Override // org.telegram.ui.Components.wk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        this.a.a(new jh.h(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        org.telegram.messenger.q20 q20Var = this.a;
        if (q20Var != null) {
            q20Var.a(Boolean.FALSE);
        }
    }
}
