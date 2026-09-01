package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class z41 implements vx0 {
    public final /* synthetic */ f51 a;

    public z41(f51 f51Var) {
        this.a = f51Var;
    }

    @Override // org.telegram.ui.Components.vx0
    public final boolean b() {
        return this.a.b.a();
    }

    @Override // org.telegram.ui.Components.vx0
    public final boolean c() {
        return this.a.b.c();
    }

    @Override // org.telegram.ui.Components.vx0
    public final void d(TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z4, boolean z10, int i10, int i11) {
        this.a.b.f(document, obj, z10, i10);
    }
}
