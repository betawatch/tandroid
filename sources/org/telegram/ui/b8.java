package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ rn a;
    public final /* synthetic */ c8 b;

    public b8(c8 c8Var, rn rnVar) {
        this.b = c8Var;
        this.a = rnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        e8 e8Var = this.b.b;
        e8Var.x.finishFragment();
        h8 h8Var = e8Var.x;
        this.a.S7(h8Var.L, h8Var.M + 86400, z10);
    }
}
