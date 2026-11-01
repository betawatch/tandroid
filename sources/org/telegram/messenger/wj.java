package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class wj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ wj(wp wpVar, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.a = i13;
        this.b = wpVar;
        this.c = j10;
        this.d = i10;
        this.e = z10;
        this.f = i11;
        this.h = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i10;
        bp[] bpVarArr;
        int i11;
        switch (this.a) {
            case 0:
                wp wpVar = this.b;
                pt notificationsController = wpVar.getNotificationsController();
                long j10 = this.c;
                notificationsController.L(null, j10, this.d, 0, this.e);
                TLRPC.Dialog dialog = (TLRPC.Dialog) wpVar.Q.f(j10);
                if (dialog != null) {
                    int i12 = dialog.unread_count;
                    int i13 = this.f;
                    if (i13 != 0) {
                        int i14 = dialog.top_message;
                        int i15 = this.h;
                        if (i15 > i14) {
                            int max = Math.max(i12 - i13, 0);
                            dialog.unread_count = max;
                            if (i15 != Integer.MAX_VALUE && max > (i11 = i15 - dialog.top_message)) {
                                dialog.unread_count = i11;
                            }
                            z10 = dialog.unread_mark;
                            if (z10) {
                                dialog.unread_mark = false;
                                wpVar.getMessagesStorage().F1(dialog.id, false);
                            }
                            if ((i12 == 0 || z10) && dialog.unread_count == 0) {
                                wpVar.q2(j10, 0L, null);
                                i10 = 0;
                                while (true) {
                                    bpVarArr = wpVar.M;
                                    if (i10 < bpVarArr.length) {
                                        bp bpVar = bpVarArr[i10];
                                        if (bpVar == null || (bpVar.g & 64) == 0) {
                                            i10++;
                                        } else {
                                            wpVar.Q4(null);
                                            wpVar.getNotificationCenter().k(3, new Object[0]);
                                        }
                                    }
                                }
                            }
                            wpVar.getNotificationCenter().k(2, 256);
                        }
                    }
                    dialog.unread_count = 0;
                    z10 = dialog.unread_mark;
                    if (z10) {
                    }
                    if (i12 == 0) {
                    }
                    wpVar.q2(j10, 0L, null);
                    i10 = 0;
                    while (true) {
                        bpVarArr = wpVar.M;
                        if (i10 < bpVarArr.length) {
                        }
                        i10++;
                    }
                    wpVar.getNotificationCenter().k(2, 256);
                }
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j10, 0);
                wpVar.getNotificationsController().J(longSparseIntArray);
                break;
            default:
                i0.g3(new wj(this.b, this.c, this.d, this.e, this.f, this.h, 0));
                break;
        }
    }
}
