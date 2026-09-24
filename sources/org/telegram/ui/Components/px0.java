package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class px0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final /* synthetic */ fy0 a;

    public /* synthetic */ px0(fy0 fy0Var) {
        this.a = fy0Var;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void m(int i10) {
        fy0.B(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new x40(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
