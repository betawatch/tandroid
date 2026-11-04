package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h31 implements uv0 {
    public final /* synthetic */ n31 a;

    public h31(n31 n31Var) {
        this.a = n31Var;
    }

    @Override // org.telegram.ui.Components.uv0
    public final void a(TLRPC.Document document, String str, Object obj, org.telegram.messenger.vi viVar, boolean z10, boolean z11, int i3, int i10) {
        this.a.b.f(document, obj, z11, i3);
    }

    @Override // org.telegram.ui.Components.uv0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.uv0
    public final boolean c() {
        return this.a.b.c();
    }
}
