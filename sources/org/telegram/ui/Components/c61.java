package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class c61 implements ry0 {
    public final /* synthetic */ i61 a;

    public c61(i61 i61Var) {
        this.a = i61Var;
    }

    @Override // org.telegram.ui.Components.ry0
    public final void a(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }

    @Override // org.telegram.ui.Components.ry0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.ry0
    public final boolean c() {
        return this.a.b.c();
    }
}
