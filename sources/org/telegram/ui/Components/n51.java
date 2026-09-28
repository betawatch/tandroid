package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
