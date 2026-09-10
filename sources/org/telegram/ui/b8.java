package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ eo a;
    public final /* synthetic */ c8 b;

    public b8(c8 c8Var, eo eoVar) {
        this.b = c8Var;
        this.a = eoVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        e8 e8Var = this.b.b;
        e8Var.x.finishFragment();
        h8 h8Var = e8Var.x;
        this.a.S7(h8Var.P, h8Var.Q + 86400, z10);
    }
}
