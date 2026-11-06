package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class g31 implements vv0 {
    public final /* synthetic */ n31 a;

    public g31(n31 n31Var) {
        this.a = n31Var;
    }

    @Override // org.telegram.ui.Components.vv0
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.ej ejVar, boolean z9, boolean z10, int i7, int i10) {
        this.a.b.f(document, obj, z10, i7);
    }

    @Override // org.telegram.ui.Components.vv0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.vv0
    public final boolean c() {
        return this.a.b.c();
    }
}
