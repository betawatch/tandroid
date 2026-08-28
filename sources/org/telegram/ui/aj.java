package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class aj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ bj b;

    public aj(bj bjVar, boolean z10) {
        this.b = bjVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        qn qnVar = this.b.b;
        if (z10) {
            TLRPC.User user = qnVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                qnVar.getMessagesStorage().getMessagesCount(qnVar.P5, new zi(1, this, z11));
                return;
            }
        }
        qnVar.qa(qnVar.Z3, z10);
    }
}
