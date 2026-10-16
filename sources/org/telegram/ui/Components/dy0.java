package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dy0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final /* synthetic */ uy0 a;

    public /* synthetic */ dy0(uy0 uy0Var) {
        this.a = uy0Var;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void k(int i10) {
        uy0.E(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new k50(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
