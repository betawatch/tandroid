package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class zk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ zk(np npVar, long j3, int i7, boolean z10, int i10, int i11, int i12) {
        this.a = i12;
        this.b = npVar;
        this.c = j3;
        this.d = i7;
        this.e = z10;
        this.f = i10;
        this.h = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i7;
        switch (this.a) {
            case 0:
                np npVar = this.b;
                ys notificationsController = npVar.getNotificationsController();
                long j3 = this.c;
                notificationsController.L(null, j3, this.d, 0, this.e);
                TLRPC.Dialog dialog = (TLRPC.Dialog) npVar.R.f(j3);
                if (dialog != null) {
                    int i10 = dialog.unread_count;
                    int i11 = this.f;
                    if (i11 != 0) {
                        int i12 = dialog.top_message;
                        int i13 = this.h;
                        if (i13 > i12) {
                            int max = Math.max(i10 - i11, 0);
                            dialog.unread_count = max;
                            if (i13 != Integer.MAX_VALUE && max > (i7 = i13 - dialog.top_message)) {
                                dialog.unread_count = i7;
                            }
                            z10 = dialog.unread_mark;
                            if (z10) {
                                dialog.unread_mark = false;
                                npVar.getMessagesStorage().F1(dialog.id, false);
                            }
                            if ((i10 == 0 || z10) && dialog.unread_count == 0) {
                                npVar.u2(j3, 0L, null);
                                if (npVar.n0()) {
                                    npVar.f5(null);
                                    npVar.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                            npVar.getNotificationCenter().k(2, 256);
                        }
                    }
                    dialog.unread_count = 0;
                    z10 = dialog.unread_mark;
                    if (z10) {
                    }
                    if (i10 == 0) {
                    }
                    npVar.u2(j3, 0L, null);
                    if (npVar.n0()) {
                    }
                    npVar.getNotificationCenter().k(2, 256);
                }
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j3, 0);
                npVar.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                g0.g3(new zk(this.b, this.c, this.d, this.e, this.f, this.h, 0));
                break;
        }
    }
}
