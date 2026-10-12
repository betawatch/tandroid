package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class dy0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final /* synthetic */ ty0 a;

    public /* synthetic */ dy0(ty0 ty0Var) {
        this.a = ty0Var;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void l(int i10) {
        ty0.E(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new k50(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
