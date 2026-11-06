package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class gk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ gk(qp qpVar, long j3, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.d = j3;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        ArrayList arrayList = this.c;
        qp qpVar = this.b;
        switch (i7) {
            case 0:
                yr messagesStorage = qpVar.getMessagesStorage();
                long j10 = this.d;
                ArrayList arrayList2 = this.c;
                qpVar.getMessagesStorage().R1(j10, -j10, arrayList2, messagesStorage.P0(j10, arrayList2, false, true, 0, 0));
                break;
            case 1:
                qpVar.getNotificationCenter().k(7, arrayList, Long.valueOf(j3), Boolean.FALSE);
                if (j3 == 0) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ij ijVar = (ij) qpVar.U.get(((Integer) arrayList.get(i10)).intValue());
                        if (ijVar != null) {
                            ijVar.Z = true;
                        }
                    }
                    break;
                } else {
                    ArrayList arrayList3 = (ArrayList) qpVar.R.f(-j3);
                    if (arrayList3 != null) {
                        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                            ij ijVar2 = (ij) arrayList3.get(i11);
                            int size2 = arrayList.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    break;
                                } else if (ijVar2.f1() == ((Integer) arrayList.get(i12)).intValue()) {
                                    ijVar2.Z = true;
                                } else {
                                    i12++;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (arrayList != null) {
                    qpVar.getClass();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i13);
                        qp messagesController = qpVar.getMessagesController();
                        int i14 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        int i15 = message != null ? message.date : 0;
                        long j11 = this.d;
                        messagesController.j3(j11, i14, 0, i15, false, qpVar.y2(j11) ? m5.o(tL_forumTopic.from_id) : tL_forumTopic.id, 0, true, 0);
                        qpVar.getMessagesStorage().d2(-j11, qpVar.y2(j11) ? m5.o(tL_forumTopic.from_id) : tL_forumTopic.id, tL_forumTopic.top_message, 0);
                    }
                }
                qpVar.getMessagesStorage().a.c(new wj(qpVar, 20));
                break;
            case 3:
                qpVar.l5(0, -j3, arrayList);
                qpVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 4:
                g0.h3(new gk(this.b, this.d, this.c, 5));
                break;
            default:
                qpVar.l5(0, j3, arrayList);
                qpVar.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }

    public /* synthetic */ gk(qp qpVar, ArrayList arrayList, long j3, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = arrayList;
        this.d = j3;
    }
}
