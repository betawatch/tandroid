package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class by0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final /* synthetic */ ry0 a;

    public /* synthetic */ by0(ry0 ry0Var) {
        this.a = ry0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        ry0.B(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new a50(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
