package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class n51 implements ey0 {
    public final /* synthetic */ t51 a;

    public n51(t51 t51Var) {
        this.a = t51Var;
    }

    @Override // org.telegram.ui.Components.ey0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.ey0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.ey0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
