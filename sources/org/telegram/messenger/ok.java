package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ok implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ ok(vp vpVar, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.d = j10;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        ArrayList arrayList = this.c;
        vp vpVar = this.b;
        switch (i10) {
            case 0:
                hs messagesStorage = vpVar.getMessagesStorage();
                long j11 = this.d;
                ArrayList arrayList2 = this.c;
                vpVar.getMessagesStorage().R1(j11, -j11, arrayList2, messagesStorage.P0(j11, arrayList2, false, true, 0, 0));
                break;
            case 1:
                vpVar.getNotificationCenter().k(7, arrayList, Long.valueOf(j10), Boolean.FALSE);
                if (j10 == 0) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        jj jjVar = (jj) vpVar.U.get(((Integer) arrayList.get(i11)).intValue());
                        if (jjVar != null) {
                            jjVar.Z = true;
                        }
                    }
                    break;
                } else {
                    ArrayList arrayList3 = (ArrayList) vpVar.R.f(-j10);
                    if (arrayList3 != null) {
                        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                            jj jjVar2 = (jj) arrayList3.get(i12);
                            int size2 = arrayList.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size2) {
                                    break;
                                } else if (jjVar2.f1() == ((Integer) arrayList.get(i13)).intValue()) {
                                    jjVar2.Z = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (arrayList != null) {
                    vpVar.getClass();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i14);
                        vp messagesController = vpVar.getMessagesController();
                        int i15 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        int i16 = message != null ? message.date : 0;
                        long j12 = this.d;
                        messagesController.h3(j12, i15, 0, i16, false, vpVar.x2(j12) ? o5.o(tL_forumTopic.from_id) : tL_forumTopic.id, 0, true, 0);
                        vpVar.getMessagesStorage().d2(-j12, vpVar.x2(j12) ? o5.o(tL_forumTopic.from_id) : tL_forumTopic.id, tL_forumTopic.top_message, 0);
                    }
                }
                vpVar.getMessagesStorage().a.c(new zj(vpVar, 19));
                break;
            case 3:
                vpVar.i5(0, -j10, arrayList);
                vpVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 4:
                i0.g3(new ok(this.b, this.d, this.c, 5));
                break;
            default:
                vpVar.i5(0, j10, arrayList);
                vpVar.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }

    public /* synthetic */ ok(vp vpVar, ArrayList arrayList, long j10, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = arrayList;
        this.d = j10;
    }
}
