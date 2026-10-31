package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class iw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ow b;
    public final /* synthetic */ long c;

    public /* synthetic */ iw(ow owVar, long j10, int i10) {
        this.a = i10;
        this.b = owVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 2;
        long j10 = this.c;
        int i12 = 1;
        ow owVar = this.b;
        switch (i10) {
            case 0:
                a0.h hVar = owVar.getMessagesController().Q;
                long j11 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j11);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    owVar.getMessagesController().R.l(dialog.id);
                }
                owVar.getMessagesStorage().a.c(new iw(owVar, j11, i12));
                hs messagesStorage = owVar.getMessagesStorage();
                messagesStorage.a.c(new gq(messagesStorage, 1, j11, 1));
                owVar.getNotificationCenter().k(3, new Object[0]);
                owVar.getNotificationCenter().k(41, Long.valueOf(j11), Boolean.FALSE, null);
                break;
            case 1:
                i0.g3(new iw(owVar, j10, i11));
                break;
            case 2:
                ot notificationsController = owVar.getNotificationsController();
                long j12 = this.c;
                notificationsController.L(null, j12, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j12, 0);
                owVar.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                owVar.getMessagesController().X(0, j10, false);
                break;
        }
    }
}
