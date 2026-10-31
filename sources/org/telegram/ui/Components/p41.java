package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p41 implements zw0 {
    public final /* synthetic */ w41 a;

    public p41(w41 w41Var) {
        this.a = w41Var;
    }

    @Override // org.telegram.ui.Components.zw0
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.fj fjVar, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }

    @Override // org.telegram.ui.Components.zw0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.zw0
    public final boolean c() {
        return this.a.b.c();
    }
}
