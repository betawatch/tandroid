package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rx0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final /* synthetic */ hy0 a;

    public /* synthetic */ rx0(hy0 hy0Var) {
        this.a = hy0Var;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void m(int i10) {
        hy0.B(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new z40(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
