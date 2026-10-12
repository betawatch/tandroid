package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class b61 implements qy0 {
    public final /* synthetic */ h61 a;

    public b61(h61 h61Var) {
        this.a = h61Var;
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
