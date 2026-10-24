package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
