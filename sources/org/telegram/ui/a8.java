package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ zn a;
    public final /* synthetic */ b8 b;

    public a8(b8 b8Var, zn znVar) {
        this.b = b8Var;
        this.a = znVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        d8 d8Var = this.b.b;
        d8Var.x.finishFragment();
        g8 g8Var = d8Var.x;
        this.a.V7(g8Var.P, g8Var.Q + 86400, z10);
    }
}
