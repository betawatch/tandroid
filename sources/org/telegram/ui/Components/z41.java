package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class z41 implements tx0 {
    public final /* synthetic */ f51 a;

    public z41(f51 f51Var) {
        this.a = f51Var;
    }

    @Override // org.telegram.ui.Components.tx0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.tx0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.tx0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z10, boolean z11, int i10, int i11) {
        this.a.b.f(document, obj, z11, i10);
    }
}
