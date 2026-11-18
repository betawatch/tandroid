package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements jl, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ org.telegram.messenger.x10 a;

    public /* synthetic */ tm(org.telegram.messenger.x10 x10Var) {
        this.a = x10Var;
    }

    @Override // org.telegram.ui.Components.jl
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        this.a.a(new th.f(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.messenger.x10 x10Var = this.a;
        if (x10Var != null) {
            x10Var.a(Boolean.FALSE);
        }
    }
}
