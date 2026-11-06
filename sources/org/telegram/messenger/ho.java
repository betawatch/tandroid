package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class ho implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int h;

    public /* synthetic */ ho(qp qpVar, long j3, int i7, boolean z9, int i10, int i11, int i12) {
        this.a = i12;
        this.b = qpVar;
        this.c = j3;
        this.d = i7;
        this.e = z9;
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
        boolean z9;
        int i7;
        vo[] voVarArr;
        int i10;
        switch (this.a) {
            case 0:
                g0.h3(new ho(this.b, this.c, this.d, this.e, this.f, this.h, 1));
                break;
            default:
                qp qpVar = this.b;
                dt notificationsController = qpVar.getNotificationsController();
                long j3 = this.c;
                notificationsController.L(null, j3, this.d, 0, this.e);
                TLRPC.Dialog dialog = (TLRPC.Dialog) qpVar.Q.f(j3);
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
                            z9 = dialog.unread_mark;
                            if (z9) {
                                dialog.unread_mark = false;
                                qpVar.getMessagesStorage().F1(dialog.id, false);
                            }
                            if ((i11 == 0 || z9) && dialog.unread_count == 0) {
                                qpVar.r2(j3, 0L, null);
                                i7 = 0;
                                while (true) {
                                    voVarArr = qpVar.M;
                                    if (i7 < voVarArr.length) {
                                        vo voVar = voVarArr[i7];
                                        if (voVar == null || (voVar.g & 64) == 0) {
                                            i7++;
                                        } else {
                                            qpVar.T4(null);
                                            qpVar.getNotificationCenter().k(3, new Object[0]);
                                        }
                                    }
                                }
                            }
                            qpVar.getNotificationCenter().k(2, 256);
                        }
                    }
                    dialog.unread_count = 0;
                    z9 = dialog.unread_mark;
                    if (z9) {
                    }
                    if (i11 == 0) {
                    }
                    qpVar.r2(j3, 0L, null);
                    i7 = 0;
                    while (true) {
                        voVarArr = qpVar.M;
                        if (i7 < voVarArr.length) {
                        }
                        i7++;
                    }
                    qpVar.getNotificationCenter().k(2, 256);
                }
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                longSparseIntArray.put(j3, 0);
                qpVar.getNotificationsController().J(longSparseIntArray);
                break;
        }
    }
}
