package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d41 implements bx0 {
    public final /* synthetic */ j41 a;

    public d41(j41 j41Var) {
        this.a = j41Var;
    }

    @Override // org.telegram.ui.Components.bx0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.bx0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.bx0
    public final void e(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
