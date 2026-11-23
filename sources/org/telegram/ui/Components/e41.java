package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class e41 implements hw0 {
    public final /* synthetic */ k41 a;

    public e41(k41 k41Var) {
        this.a = k41Var;
    }

    @Override // org.telegram.ui.Components.hw0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.hw0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.hw0
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.cj cjVar, boolean z10, boolean z11, int i7, int i10) {
        this.a.b.f(document, obj, z11, i7);
    }
}
