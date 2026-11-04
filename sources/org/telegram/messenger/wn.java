package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class wn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ wn(hp hpVar, long j10, int i3, boolean z10, int i10, int i11, int i12) {
        this.a = i12;
        this.b = hpVar;
        this.c = j10;
        this.d = i3;
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
        int i3;
        mo[] moVarArr;
        int i10;
        switch (this.a) {
            case 0:
                g0.h3(new wn(this.b, this.c, this.d, this.e, this.f, this.h, 1));
                break;
            default:
                hp hpVar = this.b;
                us notificationsController = hpVar.getNotificationsController();
                long j10 = this.c;
                notificationsController.L(null, j10, this.d, 0, this.e);
                TLRPC.Dialog dialog = (TLRPC.Dialog) hpVar.R.f(j10);
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
                                hpVar.getMessagesStorage().F1(dialog.id, false);
                            }
                            if ((i11 == 0 || z10) && dialog.unread_count == 0) {
                                hpVar.r2(j10, 0L, null);
                                i3 = 0;
                                while (true) {
                                    moVarArr = hpVar.N;
                                    if (i3 < moVarArr.length) {
                                        mo moVar = moVarArr[i3];
                                        if (moVar == null || (moVar.g & 64) == 0) {
                                            i3++;
                                        } else {
                                            hpVar.T4(null);
                                            hpVar.getNotificationCenter().k(3, new Object[0]);
                                        }
                                    }
                                }
                            }
                            hpVar.getNotificationCenter().k(2, 256);
                        }
                    }
                    dialog.unread_count = 0;
                    z10 = dialog.unread_mark;
                    if (z10) {
                    }
                    if (i11 == 0) {
                    }
                    hpVar.r2(j10, 0L, null);
                    i3 = 0;
                    while (true) {
                        moVarArr = hpVar.N;
                        if (i3 < moVarArr.length) {
                        }
                        i3++;
                    }
                    hpVar.getNotificationCenter().k(2, 256);
                }
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j10, 0);
                hpVar.getNotificationsController().J(longSparseIntArray);
                break;
        }
    }
}
