package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class ul implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ ul(qp qpVar, long j3, int i7, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = qpVar;
        this.c = j3;
        this.e = i7;
        this.d = j10;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ArrayList arrayList = this.f;
        qp qpVar = this.b;
        switch (i7) {
            case 0:
                long j3 = this.c;
                long j10 = this.d;
                int i10 = this.e;
                if (j3 != 0) {
                    int B = qpVar.getMessagesController().q7.B(i10, j10, j3, true);
                    if (B >= 0) {
                        qpVar.getMessagesStorage().h2(B, j10, j3, true);
                        qpVar.getNotificationCenter().k(qs.Z4, Long.valueOf(j10), Long.valueOf(j3), Integer.valueOf(B), arrayList);
                        break;
                    }
                } else {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) qpVar.Q.f(j10);
                    if (dialog != null) {
                        int i11 = dialog.unread_poll_votes_count + i10;
                        dialog.unread_poll_votes_count = i11;
                        if (i11 < 0) {
                            dialog.unread_poll_votes_count = 0;
                        }
                        qpVar.getMessagesStorage().h2(dialog.unread_poll_votes_count, j10, 0L, false);
                        qpVar.getNotificationCenter().k(qs.Z4, Long.valueOf(j10), Long.valueOf(j3), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                        break;
                    } else {
                        qpVar.getMessagesStorage().Q1(j10, i10, true, false);
                        break;
                    }
                }
                break;
            case 1:
                long j11 = this.c;
                long j12 = this.d;
                int i12 = this.e;
                if (j11 != 0) {
                    int C = qpVar.getMessagesController().q7.C(i12, j12, j11, true);
                    if (C >= 0) {
                        qpVar.getMessagesStorage().i2(C, j12, j11, true);
                        if (qpVar.t2(j12) || qpVar.y2(j12) || j12 > 0) {
                            qpVar.getNotificationCenter().k(qs.Y4, Long.valueOf(j12), Long.valueOf(j11), Integer.valueOf(C), arrayList);
                            break;
                        }
                    }
                } else {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) qpVar.Q.f(j12);
                    if (dialog2 != null) {
                        int i13 = dialog2.unread_reactions_count + i12;
                        dialog2.unread_reactions_count = i13;
                        if (i13 < 0) {
                            dialog2.unread_reactions_count = 0;
                        }
                        qpVar.getMessagesStorage().i2(dialog2.unread_reactions_count, j12, 0L, false);
                        if (qpVar.t2(j12) || qpVar.y2(j12) || j12 > 0) {
                            qpVar.getNotificationCenter().k(qs.Y4, Long.valueOf(j12), Long.valueOf(j11), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                            break;
                        }
                    } else {
                        qpVar.getMessagesStorage().Q1(j12, i12, true, true);
                        break;
                    }
                }
                break;
            case 2:
                a0.h hVar = qpVar.Q;
                long j13 = this.c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) hVar.f(j13);
                int i14 = this.e;
                if (dialog3 != null) {
                    dialog3.unread_poll_votes_count = i14;
                    yr messagesStorage = qpVar.getMessagesStorage();
                    long j14 = this.d;
                    messagesStorage.h2(i14, j13, j14, false);
                    qpVar.getNotificationCenter().k(qs.Z4, Long.valueOf(j13), Long.valueOf(j14), Integer.valueOf(i14), arrayList);
                    break;
                } else {
                    qpVar.getMessagesStorage().Q1(j13, i14, false, false);
                    break;
                }
            case 3:
                a0.h hVar2 = qpVar.Q;
                long j15 = this.c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) hVar2.f(j15);
                int i15 = this.e;
                if (dialog4 != null) {
                    dialog4.unread_reactions_count = i15;
                    yr messagesStorage2 = qpVar.getMessagesStorage();
                    long j16 = this.d;
                    messagesStorage2.i2(i15, j15, j16, false);
                    qpVar.getNotificationCenter().k(qs.Y4, Long.valueOf(j15), Long.valueOf(j16), Integer.valueOf(i15), arrayList);
                    break;
                } else {
                    qpVar.getMessagesStorage().Q1(j15, i15, false, true);
                    break;
                }
            case 4:
                k00 k00Var = qpVar.getMessagesController().q7;
                int i16 = this.e;
                long j17 = this.c;
                long j18 = this.d;
                k00Var.B(i16, j17, j18, false);
                qpVar.getMessagesStorage().h2(i16, j17, j18, false);
                qpVar.getNotificationCenter().k(qs.Z4, Long.valueOf(j17), Long.valueOf(j18), Integer.valueOf(i16), arrayList);
                break;
            case 5:
                k00 k00Var2 = qpVar.getMessagesController().q7;
                int i17 = this.e;
                long j19 = this.c;
                long j20 = this.d;
                k00Var2.C(i17, j19, j20, false);
                qpVar.getMessagesStorage().i2(i17, j19, j20, false);
                qpVar.getNotificationCenter().k(qs.Y4, Long.valueOf(j19), Long.valueOf(j20), Integer.valueOf(i17), arrayList);
                break;
            default:
                k00 k00Var3 = qpVar.getMessagesController().q7;
                int i18 = this.e;
                long j21 = this.c;
                long j22 = this.d;
                k00Var3.C(i18, j21, j22, false);
                qpVar.getMessagesStorage().i2(i18, j21, j22, false);
                qpVar.getNotificationCenter().k(qs.Y4, Long.valueOf(j21), Long.valueOf(j22), Integer.valueOf(i18), arrayList);
                break;
        }
    }

    public /* synthetic */ ul(qp qpVar, long j3, long j10, int i7, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = qpVar;
        this.c = j3;
        this.d = j10;
        this.e = i7;
        this.f = arrayList;
    }
}
