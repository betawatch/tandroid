package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class w51 implements ny0 {
    public final /* synthetic */ c61 a;

    public w51(c61 c61Var) {
        this.a = c61Var;
    }

    @Override // org.telegram.ui.Components.ny0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.ny0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.ny0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
