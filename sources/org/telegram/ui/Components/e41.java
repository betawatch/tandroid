package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
    public final void d(TLRPC.Document document, String str, Object obj, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, int i7, int i10) {
        this.a.b.f(document, obj, z11, i7);
    }
}
