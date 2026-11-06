package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class il implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ls b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ il(qp qpVar, long j3, int i7, int i10, boolean z9, int i11) {
        this.a = i11;
        this.b = qpVar;
        this.c = j3;
        this.d = i7;
        this.e = i10;
        this.f = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        int i7;
        int i10 = this.a;
        ls lsVar = this.b;
        switch (i10) {
            case 0:
                qp qpVar = (qp) lsVar;
                a0.h hVar = qpVar.Q;
                long j10 = this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) hVar.f(j10);
                int i11 = this.e;
                if (dialog != null) {
                    int i12 = dialog.unread_count;
                    int i13 = this.d;
                    if (i13 == 0 || i11 >= dialog.top_message) {
                        dialog.unread_count = 0;
                    } else {
                        int max = Math.max(i12 - i13, 0);
                        dialog.unread_count = max;
                        if (i11 != Integer.MIN_VALUE && max > (i7 = dialog.top_message - i11)) {
                            dialog.unread_count = i7;
                        }
                    }
                    boolean z9 = dialog.unread_mark;
                    if (z9) {
                        dialog.unread_mark = false;
                        qpVar.getMessagesStorage().F1(dialog.id, false);
                    }
                    if ((i12 != 0 || z9) && dialog.unread_count == 0) {
                        j3 = j10;
                        qpVar.r2(j3, 0L, null);
                        int i14 = 0;
                        while (true) {
                            vo[] voVarArr = qpVar.M;
                            if (i14 < voVarArr.length) {
                                vo voVar = voVarArr[i14];
                                if (voVar == null || (voVar.g & 64) == 0) {
                                    i14++;
                                } else {
                                    qpVar.T4(null);
                                    qpVar.getNotificationCenter().k(3, new Object[0]);
                                }
                            }
                        }
                    } else {
                        j3 = j10;
                    }
                    qpVar.getNotificationCenter().k(2, 256);
                } else {
                    j3 = j10;
                }
                if (!this.f) {
                    long j11 = j3;
                    qpVar.getNotificationsController().L(null, j11, 0, i11, false);
                    LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
                    longSparseIntArray.put(j11, 0);
                    qpVar.getNotificationsController().J(longSparseIntArray);
                    break;
                } else {
                    long j12 = j3;
                    qpVar.getNotificationsController().L(null, j12, 0, i11, true);
                    LongSparseIntArray longSparseIntArray2 = new LongSparseIntArray(1);
                    longSparseIntArray2.put(j12, -1);
                    qpVar.getNotificationsController().J(longSparseIntArray2);
                    break;
                }
                break;
            case 1:
                g0.h3(new il((qp) lsVar, this.c, this.d, this.e, this.f, 0));
                break;
            default:
                int i15 = ChatActivityEnterView.s5;
                ((ChatActivityEnterView) lsVar).T0(this.f, this.d, this.e, this.c, false);
                break;
        }
    }

    public /* synthetic */ il(ChatActivityEnterView chatActivityEnterView, boolean z9, int i7, int i10, long j3) {
        this.a = 2;
        this.b = chatActivityEnterView;
        this.f = z9;
        this.d = i7;
        this.e = i10;
        this.c = j3;
    }
}
