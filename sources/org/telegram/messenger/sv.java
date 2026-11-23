package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class sv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv b;
    public final /* synthetic */ long c;

    public /* synthetic */ sv(yv yvVar, long j3, int i7) {
        this.a = i7;
        this.b = yvVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 2;
        long j3 = this.c;
        int i11 = 1;
        yv yvVar = this.b;
        switch (i7) {
            case 0:
                a0.h hVar = yvVar.getMessagesController().R;
                long j10 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    yvVar.getMessagesController().S.l(dialog.id);
                }
                yvVar.getMessagesStorage().a.c(new sv(yvVar, j10, i11));
                ur messagesStorage = yvVar.getMessagesStorage();
                messagesStorage.a.c(new wp(messagesStorage, 1, j10, 1));
                yvVar.getNotificationCenter().k(3, new Object[0]);
                yvVar.getNotificationCenter().k(41, Long.valueOf(j10), Boolean.FALSE, null);
                break;
            case 1:
                g0.g3(new sv(yvVar, j3, i10));
                break;
            case 2:
                ys notificationsController = yvVar.getNotificationsController();
                long j11 = this.c;
                notificationsController.L(null, j11, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j11, 0);
                yvVar.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                yvVar.getMessagesController().X(0, j3, false);
                break;
        }
    }
}
