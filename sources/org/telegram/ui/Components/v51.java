package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class v51 implements ly0 {
    public final /* synthetic */ b61 a;

    public v51(b61 b61Var) {
        this.a = b61Var;
    }

    @Override // org.telegram.ui.Components.ly0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.ly0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.ly0
    public final void e(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
