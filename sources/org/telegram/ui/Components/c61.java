package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class c61 implements qy0 {
    public final /* synthetic */ i61 a;

    public c61(i61 i61Var) {
        this.a = i61Var;
    }

    @Override // org.telegram.ui.Components.qy0
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }

    @Override // org.telegram.ui.Components.qy0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.qy0
    public final boolean c() {
        return this.a.b.c();
    }
}
