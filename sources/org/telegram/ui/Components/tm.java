package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements jl, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ org.telegram.messenger.w10 a;

    public /* synthetic */ tm(org.telegram.messenger.w10 w10Var) {
        this.a = w10Var;
    }

    @Override // org.telegram.ui.Components.jl
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        this.a.a(new th.f(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.messenger.w10 w10Var = this.a;
        if (w10Var != null) {
            w10Var.a(Boolean.FALSE);
        }
    }
}
