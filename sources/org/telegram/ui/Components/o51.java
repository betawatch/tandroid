package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class o51 implements fy0 {
    public final /* synthetic */ u51 a;

    public o51(u51 u51Var) {
        this.a = u51Var;
    }

    @Override // org.telegram.ui.Components.fy0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.fy0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.fy0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
