package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class c20 extends q4 {
    public final /* synthetic */ f40 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = f40Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.dg0
    public final void c() {
        f40 f40Var = this.V;
        org.telegram.messenger.c cVar = f40Var.o1;
        d20 d20Var = f40Var.m1;
        long dialogId = d20Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(cVar.a).c2(Long.valueOf(dialogId));
            d20Var.H(null, org.telegram.messenger.fc.m(cVar.a, 0, c22), org.telegram.messenger.fc.m(cVar.a, 1, c22), false);
        }
    }
}
