package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
