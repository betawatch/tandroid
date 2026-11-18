package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ck implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ ck(mp mpVar, long j3, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.d = j3;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.d;
        ArrayList arrayList = this.c;
        mp mpVar = this.b;
        switch (i7) {
            case 0:
                tr messagesStorage = mpVar.getMessagesStorage();
                long j10 = this.d;
                ArrayList arrayList2 = this.c;
                mpVar.getMessagesStorage().R1(j10, -j10, arrayList2, messagesStorage.P0(j10, arrayList2, false, true, 0, 0));
                break;
            case 1:
                mpVar.getNotificationCenter().k(7, arrayList, Long.valueOf(j3), Boolean.FALSE);
                if (j3 == 0) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        fj fjVar = (fj) mpVar.V.get(((Integer) arrayList.get(i10)).intValue());
                        if (fjVar != null) {
                            fjVar.Z = true;
                        }
                    }
                    break;
                } else {
                    ArrayList arrayList3 = (ArrayList) mpVar.S.f(-j3);
                    if (arrayList3 != null) {
                        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                            fj fjVar2 = (fj) arrayList3.get(i11);
                            int size2 = arrayList.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    break;
                                } else if (fjVar2.e1() == ((Integer) arrayList.get(i12)).intValue()) {
                                    fjVar2.Z = true;
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
                    mpVar.getClass();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i13);
                        mp messagesController = mpVar.getMessagesController();
                        int i14 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        int i15 = message != null ? message.date : 0;
                        long j11 = this.d;
                        messagesController.q3(j11, i14, 0, i15, false, mpVar.E2(j11) ? n5.o(tL_forumTopic.from_id) : tL_forumTopic.id, 0, true, 0);
                        mpVar.getMessagesStorage().d2(-j11, mpVar.E2(j11) ? n5.o(tL_forumTopic.from_id) : tL_forumTopic.id, tL_forumTopic.top_message, 0);
                    }
                }
                mpVar.getMessagesStorage().a.c(new rj(mpVar, 20));
                break;
            case 3:
                mpVar.x5(0, -j3, arrayList);
                mpVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 4:
                g0.g3(new ck(this.b, this.d, this.c, 5));
                break;
            default:
                mpVar.x5(0, j3, arrayList);
                mpVar.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }

    public /* synthetic */ ck(mp mpVar, ArrayList arrayList, long j3, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = arrayList;
        this.d = j3;
    }
}
