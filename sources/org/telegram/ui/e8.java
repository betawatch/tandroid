package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class e8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ yn a;
    public final /* synthetic */ f8 b;

    public e8(f8 f8Var, yn ynVar) {
        this.b = f8Var;
        this.a = ynVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        h8 h8Var = this.b.b;
        h8Var.x.finishFragment();
        k8 k8Var = h8Var.x;
        this.a.S7(k8Var.P, k8Var.Q + 86400, z10);
    }
}
