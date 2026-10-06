package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class x51 implements oy0 {
    public final /* synthetic */ d61 a;

    public x51(d61 d61Var) {
        this.a = d61Var;
    }

    @Override // org.telegram.ui.Components.oy0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.oy0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.oy0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
