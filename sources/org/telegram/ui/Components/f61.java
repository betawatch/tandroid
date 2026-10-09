package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class f61 implements uy0 {
    public final /* synthetic */ l61 a;

    public f61(l61 l61Var) {
        this.a = l61Var;
    }

    @Override // org.telegram.ui.Components.uy0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.uy0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.uy0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
