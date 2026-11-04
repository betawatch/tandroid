package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class wj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ wj(hp hpVar, long j10, ArrayList arrayList, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.d = j10;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        long j10 = this.d;
        ArrayList arrayList = this.c;
        hp hpVar = this.b;
        switch (i3) {
            case 0:
                qr messagesStorage = hpVar.getMessagesStorage();
                long j11 = this.d;
                ArrayList arrayList2 = this.c;
                hpVar.getMessagesStorage().R1(j11, -j11, arrayList2, messagesStorage.P0(j11, arrayList2, false, true, 0, 0));
                break;
            case 1:
                hpVar.getNotificationCenter().k(7, arrayList, Long.valueOf(j10), Boolean.FALSE);
                if (j10 == 0) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        zi ziVar = (zi) hpVar.V.get(((Integer) arrayList.get(i10)).intValue());
                        if (ziVar != null) {
                            ziVar.Z = true;
                        }
                    }
                    break;
                } else {
                    ArrayList arrayList3 = (ArrayList) hpVar.S.f(-j10);
                    if (arrayList3 != null) {
                        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                            zi ziVar2 = (zi) arrayList3.get(i11);
                            int size2 = arrayList.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    break;
                                } else if (ziVar2.f1() == ((Integer) arrayList.get(i12)).intValue()) {
                                    ziVar2.Z = true;
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
                    hpVar.getClass();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i13);
                        hp messagesController = hpVar.getMessagesController();
                        int i14 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        int i15 = message != null ? message.date : 0;
                        long j12 = this.d;
                        messagesController.j3(j12, i14, 0, i15, false, hpVar.y2(j12) ? m5.o(tL_forumTopic.from_id) : tL_forumTopic.id, 0, true, 0);
                        hpVar.getMessagesStorage().d2(-j12, hpVar.y2(j12) ? m5.o(tL_forumTopic.from_id) : tL_forumTopic.id, tL_forumTopic.top_message, 0);
                    }
                }
                hpVar.getMessagesStorage().a.c(new mj(hpVar, 20));
                break;
            case 3:
                hpVar.l5(0, -j10, arrayList);
                hpVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 4:
                g0.h3(new wj(this.b, this.d, this.c, 5));
                break;
            default:
                hpVar.l5(0, j10, arrayList);
                hpVar.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }

    public /* synthetic */ wj(hp hpVar, ArrayList arrayList, long j10, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = arrayList;
        this.d = j10;
    }
}
