package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d41 implements gw0 {
    public final /* synthetic */ j41 a;

    public d41(j41 j41Var) {
        this.a = j41Var;
    }

    @Override // org.telegram.ui.Components.gw0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.gw0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.gw0
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, int i7, int i10) {
        this.a.b.f(document, obj, z11, i7);
    }
}
