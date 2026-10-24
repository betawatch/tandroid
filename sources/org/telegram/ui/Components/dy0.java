package org.telegram.ui.Components;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
