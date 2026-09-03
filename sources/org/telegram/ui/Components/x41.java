package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x41 implements ux0 {
    public final /* synthetic */ d51 a;

    public x41(d51 d51Var) {
        this.a = d51Var;
    }

    @Override // org.telegram.ui.Components.ux0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.ux0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.ux0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, boolean z10, int i10, int i11) {
        this.a.b.f(document, obj, z10, i10);
    }
}
