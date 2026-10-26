package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h8 implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ un a;
    public final /* synthetic */ i8 b;

    public h8(i8 i8Var, un unVar) {
        this.b = i8Var;
        this.a = unVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        k8 k8Var = this.b.b;
        k8Var.x.finishFragment();
        n8 n8Var = k8Var.x;
        this.a.Z7(n8Var.P, n8Var.Q + 86400, z10);
    }
}
