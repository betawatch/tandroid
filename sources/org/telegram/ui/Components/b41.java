package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b41 implements fw0 {
    public final /* synthetic */ h41 a;

    public b41(h41 h41Var) {
        this.a = h41Var;
    }

    @Override // org.telegram.ui.Components.fw0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.fw0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.fw0
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, int i7, int i10) {
        this.a.b.f(document, obj, z11, i7);
    }
}
