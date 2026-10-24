package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class e8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ sn a;
    public final /* synthetic */ f8 b;

    public e8(f8 f8Var, sn snVar) {
        this.b = f8Var;
        this.a = snVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        h8 h8Var = this.b.b;
        h8Var.x.finishFragment();
        k8 k8Var = h8Var.x;
        this.a.V7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
