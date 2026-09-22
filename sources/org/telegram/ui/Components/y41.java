package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y41 implements sx0 {
    public final /* synthetic */ e51 a;

    public y41(e51 e51Var) {
        this.a = e51Var;
    }

    @Override // org.telegram.ui.Components.sx0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.sx0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.sx0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
