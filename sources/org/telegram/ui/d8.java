package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
