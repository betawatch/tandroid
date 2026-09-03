package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ zn a;
    public final /* synthetic */ g8 b;

    public f8(g8 g8Var, zn znVar) {
        this.b = g8Var;
        this.a = znVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z4) {
        i8 i8Var = this.b.b;
        i8Var.x.finishFragment();
        l8 l8Var = i8Var.x;
        this.a.S7(l8Var.M, l8Var.N + 86400, z4);
    }
}
