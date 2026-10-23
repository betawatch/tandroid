package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class x51 implements ny0 {
    public final /* synthetic */ d61 a;

    public x51(d61 d61Var) {
        this.a = d61Var;
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
    public final void e(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
