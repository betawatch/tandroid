package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
