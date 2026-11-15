package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class vv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw b;
    public final /* synthetic */ long c;

    public /* synthetic */ vv(bw bwVar, long j3, int i7) {
        this.a = i7;
        this.b = bwVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 2;
        long j3 = this.c;
        int i11 = 1;
        bw bwVar = this.b;
        switch (i7) {
            case 0:
                a0.h hVar = bwVar.getMessagesController().R;
                long j10 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    bwVar.getMessagesController().S.l(dialog.id);
                }
                bwVar.getMessagesStorage().a.c(new vv(bwVar, j10, i11));
                vr messagesStorage = bwVar.getMessagesStorage();
                messagesStorage.a.c(new wp(messagesStorage, 1, j10, 1));
                bwVar.getNotificationCenter().k(3, new Object[0]);
                bwVar.getNotificationCenter().k(41, Long.valueOf(j10), Boolean.FALSE, null);
                break;
            case 1:
                g0.h3(new vv(bwVar, j3, i10));
                break;
            case 2:
                at notificationsController = bwVar.getNotificationsController();
                long j11 = this.c;
                notificationsController.L(null, j11, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j11, 0);
                bwVar.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                bwVar.getMessagesController().X(0, j3, false);
                break;
        }
    }
}
