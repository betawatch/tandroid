package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ gj b;

    public fj(gj gjVar, boolean z10) {
        this.b = gjVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        un unVar = this.b.b;
        if (z10) {
            TLRPC.User user = unVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                unVar.getMessagesStorage().getMessagesCount(unVar.f6, new ej(1, this, z11));
                return;
            }
        }
        unVar.Aa(unVar.p4, z10);
    }
}
