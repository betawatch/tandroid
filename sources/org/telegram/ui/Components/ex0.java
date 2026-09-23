package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ex0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final /* synthetic */ ux0 a;

    public /* synthetic */ ex0(ux0 ux0Var) {
        this.a = ux0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        ux0.B(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new x40(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
