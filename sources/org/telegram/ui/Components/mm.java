package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm implements cl, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ org.telegram.messenger.z10 a;

    public /* synthetic */ mm(org.telegram.messenger.z10 z10Var) {
        this.a = z10Var;
    }

    @Override // org.telegram.ui.Components.cl
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        this.a.a(new th.f(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.messenger.z10 z10Var = this.a;
        if (z10Var != null) {
            z10Var.a(Boolean.FALSE);
        }
    }
}
