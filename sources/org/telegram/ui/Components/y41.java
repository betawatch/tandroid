package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y41 implements ux0 {
    public final /* synthetic */ e51 a;

    public y41(e51 e51Var) {
        this.a = e51Var;
    }

    @Override // org.telegram.ui.Components.ux0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.ux0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.ux0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, boolean z10, int i10, int i11) {
        this.a.b.f(document, obj, z10, i10);
    }
}
