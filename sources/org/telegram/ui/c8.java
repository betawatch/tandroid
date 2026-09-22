package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class c8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ zn a;
    public final /* synthetic */ d8 b;

    public c8(d8 d8Var, zn znVar) {
        this.b = d8Var;
        this.a = znVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        f8 f8Var = this.b.b;
        f8Var.x.finishFragment();
        i8 i8Var = f8Var.x;
        this.a.S7(i8Var.P, i8Var.Q + 86400, z10);
    }
}
