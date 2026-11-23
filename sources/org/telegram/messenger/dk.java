package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ dk(np npVar, long j3, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = npVar;
        this.d = j3;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        ArrayList arrayList = this.c;
        np npVar = this.b;
        switch (i7) {
            case 0:
                ur messagesStorage = npVar.getMessagesStorage();
                long j10 = this.d;
                ArrayList arrayList2 = this.c;
                npVar.getMessagesStorage().R1(j10, -j10, arrayList2, messagesStorage.P0(j10, arrayList2, false, true, 0, 0));
                break;
            case 1:
                npVar.getNotificationCenter().k(7, arrayList, Long.valueOf(j3), Boolean.FALSE);
                if (j3 == 0) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        gj gjVar = (gj) npVar.V.get(((Integer) arrayList.get(i10)).intValue());
                        if (gjVar != null) {
                            gjVar.Z = true;
                        }
                    }
                    break;
                } else {
                    ArrayList arrayList3 = (ArrayList) npVar.S.f(-j3);
                    if (arrayList3 != null) {
                        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                            gj gjVar2 = (gj) arrayList3.get(i11);
                            int size2 = arrayList.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    break;
                                } else if (gjVar2.e1() == ((Integer) arrayList.get(i12)).intValue()) {
                                    gjVar2.Z = true;
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
                    npVar.getClass();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i13);
                        np messagesController = npVar.getMessagesController();
                        int i14 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        int i15 = message != null ? message.date : 0;
                        long j11 = this.d;
                        messagesController.q3(j11, i14, 0, i15, false, npVar.E2(j11) ? n5.o(tL_forumTopic.from_id) : tL_forumTopic.id, 0, true, 0);
                        npVar.getMessagesStorage().d2(-j11, npVar.E2(j11) ? n5.o(tL_forumTopic.from_id) : tL_forumTopic.id, tL_forumTopic.top_message, 0);
                    }
                }
                npVar.getMessagesStorage().a.c(new sj(npVar, 20));
                break;
            case 3:
                npVar.x5(0, -j3, arrayList);
                npVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 4:
                g0.g3(new dk(this.b, this.d, this.c, 5));
                break;
            default:
                npVar.x5(0, j3, arrayList);
                npVar.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }

    public /* synthetic */ dk(np npVar, ArrayList arrayList, long j3, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = arrayList;
        this.d = j3;
    }
}
