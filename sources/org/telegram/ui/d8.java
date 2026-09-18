package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ bo a;
    public final /* synthetic */ e8 b;

    public d8(e8 e8Var, bo boVar) {
        this.b = e8Var;
        this.a = boVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        g8 g8Var = this.b.b;
        g8Var.x.finishFragment();
        j8 j8Var = g8Var.x;
        this.a.S7(j8Var.P, j8Var.Q + 86400, z10);
    }
}
