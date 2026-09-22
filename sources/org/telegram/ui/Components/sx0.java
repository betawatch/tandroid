package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class sx0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final /* synthetic */ iy0 a;

    public /* synthetic */ sx0(iy0 iy0Var) {
        this.a = iy0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        iy0.B(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new w40(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
