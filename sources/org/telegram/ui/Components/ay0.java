package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ay0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final /* synthetic */ qy0 a;

    public /* synthetic */ ay0(qy0 qy0Var) {
        this.a = qy0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        qy0.B(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new a50(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
