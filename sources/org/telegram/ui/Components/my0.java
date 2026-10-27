package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class my0 implements org.telegram.ui.ActionBar.r0, MessagesStorage.StringCallback {
    public final /* synthetic */ dz0 a;

    public /* synthetic */ my0(dz0 dz0Var) {
        this.a = dz0Var;
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void g(int i10) {
        dz0.F(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new i50(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
