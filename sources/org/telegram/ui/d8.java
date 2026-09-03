package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ xn a;
    public final /* synthetic */ e8 b;

    public d8(e8 e8Var, xn xnVar) {
        this.b = e8Var;
        this.a = xnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z4) {
        g8 g8Var = this.b.b;
        g8Var.x.finishFragment();
        j8 j8Var = g8Var.x;
        this.a.S7(j8Var.M, j8Var.N + 86400, z4);
    }
}
