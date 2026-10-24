package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class dy0 implements org.telegram.ui.ActionBar.q0, MessagesStorage.StringCallback {
    public final /* synthetic */ ty0 a;

    public /* synthetic */ dy0(ty0 ty0Var) {
        this.a = ty0Var;
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void h(int i10) {
        ty0.E(this.a, i10);
    }

    @Override // org.telegram.messenger.MessagesStorage.StringCallback
    public void run(String str) {
        new g50(r1.getContext(), r1.o0, null, this.a.resourcesProvider).show();
    }
}
