package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class eo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ eo(np npVar, long j3, int i7, boolean z10, int i10, int i11, int i12) {
        this.a = i12;
        this.b = npVar;
        this.c = j3;
        this.d = i7;
        this.e = z10;
        this.f = i10;
        this.h = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i7;
        so[] soVarArr;
        int i10;
        switch (this.a) {
            case 0:
                g0.h3(new eo(this.b, this.c, this.d, this.e, this.f, this.h, 1));
                break;
            default:
                np npVar = this.b;
                at notificationsController = npVar.getNotificationsController();
                long j3 = this.c;
                notificationsController.L(null, j3, this.d, 0, this.e);
                TLRPC.Dialog dialog = (TLRPC.Dialog) npVar.R.f(j3);
                if (dialog != null) {
                    int i11 = dialog.unread_count;
                    int i12 = this.f;
                    if (i12 != 0) {
                        int i13 = dialog.top_message;
                        int i14 = this.h;
                        if (i14 > i13) {
                            int max = Math.max(i11 - i12, 0);
                            dialog.unread_count = max;
                            if (i14 != Integer.MAX_VALUE && max > (i10 = i14 - dialog.top_message)) {
                                dialog.unread_count = i10;
                            }
                            z10 = dialog.unread_mark;
                            if (z10) {
                                dialog.unread_mark = false;
                                npVar.getMessagesStorage().F1(dialog.id, false);
                            }
                            if ((i11 == 0 || z10) && dialog.unread_count == 0) {
                                npVar.r2(j3, 0L, null);
                                i7 = 0;
                                while (true) {
                                    soVarArr = npVar.N;
                                    if (i7 < soVarArr.length) {
                                        so soVar = soVarArr[i7];
                                        if (soVar == null || (soVar.g & 64) == 0) {
                                            i7++;
                                        } else {
                                            npVar.U4(null);
                                            npVar.getNotificationCenter().k(3, new Object[0]);
                                        }
                                    }
                                }
                            }
                            npVar.getNotificationCenter().k(2, 256);
                        }
                    }
                    dialog.unread_count = 0;
                    z10 = dialog.unread_mark;
                    if (z10) {
                    }
                    if (i11 == 0) {
                    }
                    npVar.r2(j3, 0L, null);
                    i7 = 0;
                    while (true) {
                        soVarArr = npVar.N;
                        if (i7 < soVarArr.length) {
                        }
                        i7++;
                    }
                    npVar.getNotificationCenter().k(2, 256);
                }
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j3, 0);
                npVar.getNotificationsController().J(longSparseIntArray);
                break;
        }
    }
}
