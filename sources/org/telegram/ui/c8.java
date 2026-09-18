package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
