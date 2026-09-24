package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class l51 implements cy0 {
    public final /* synthetic */ r51 a;

    public l51(r51 r51Var) {
        this.a = r51Var;
    }

    @Override // org.telegram.ui.Components.cy0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.cy0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.cy0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
