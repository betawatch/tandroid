package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k61 implements az0 {
    public final /* synthetic */ q61 a;

    public k61(q61 q61Var) {
        this.a = q61Var;
    }

    @Override // org.telegram.ui.Components.az0
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }

    @Override // org.telegram.ui.Components.az0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.az0
    public final boolean c() {
        return this.a.b.c();
    }
}
