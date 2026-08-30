package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ij implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ jj b;

    public ij(jj jjVar, boolean z4) {
        this.b = jjVar;
        this.a = z4;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z4) {
        xn xnVar = this.b.b;
        if (z4) {
            TLRPC.User user = xnVar.f;
            boolean z10 = this.a;
            if (user != null || z10) {
                xnVar.getMessagesStorage().getMessagesCount(xnVar.Q5, new hj(1, this, z10));
                return;
            }
        }
        xnVar.qa(xnVar.a4, z4);
    }
}
