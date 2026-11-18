package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class rv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv b;
    public final /* synthetic */ long c;

    public /* synthetic */ rv(xv xvVar, long j3, int i7) {
        this.a = i7;
        this.b = xvVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 2;
        long j3 = this.c;
        int i11 = 1;
        xv xvVar = this.b;
        switch (i7) {
            case 0:
                a0.h hVar = xvVar.getMessagesController().R;
                long j10 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                if (dialog != null) {
                    dialog.unread_count = 0;
                    xvVar.getMessagesController().S.l(dialog.id);
                }
                xvVar.getMessagesStorage().a.c(new rv(xvVar, j10, i11));
                tr messagesStorage = xvVar.getMessagesStorage();
                messagesStorage.a.c(new vp(messagesStorage, 1, j10, 1));
                xvVar.getNotificationCenter().k(3, new Object[0]);
                xvVar.getNotificationCenter().k(41, Long.valueOf(j10), Boolean.FALSE, null);
                break;
            case 1:
                g0.g3(new rv(xvVar, j3, i10));
                break;
            case 2:
                xs notificationsController = xvVar.getNotificationsController();
                long j11 = this.c;
                notificationsController.L(null, j11, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j11, 0);
                xvVar.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                xvVar.getMessagesController().X(0, j3, false);
                break;
        }
    }
}
