package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
