package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class pk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ pk(wp wpVar, long j10, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.d = j10;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        ArrayList arrayList = this.c;
        wp wpVar = this.b;
        switch (i10) {
            case 0:
                is messagesStorage = wpVar.getMessagesStorage();
                long j11 = this.d;
                ArrayList arrayList2 = this.c;
                wpVar.getMessagesStorage().R1(j11, -j11, arrayList2, messagesStorage.P0(j11, arrayList2, false, true, 0, 0));
                break;
            case 1:
                wpVar.getNotificationCenter().k(7, arrayList, Long.valueOf(j10), Boolean.FALSE);
                if (j10 == 0) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        kj kjVar = (kj) wpVar.U.get(((Integer) arrayList.get(i11)).intValue());
                        if (kjVar != null) {
                            kjVar.Z = true;
                        }
                    }
                    break;
                } else {
                    ArrayList arrayList3 = (ArrayList) wpVar.R.f(-j10);
                    if (arrayList3 != null) {
                        for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                            kj kjVar2 = (kj) arrayList3.get(i12);
                            int size2 = arrayList.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size2) {
                                    break;
                                } else if (kjVar2.f1() == ((Integer) arrayList.get(i13)).intValue()) {
                                    kjVar2.Z = true;
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
                    wpVar.getClass();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i14);
                        wp messagesController = wpVar.getMessagesController();
                        int i15 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        int i16 = message != null ? message.date : 0;
                        long j12 = this.d;
                        messagesController.h3(j12, i15, 0, i16, false, wpVar.x2(j12) ? o5.o(tL_forumTopic.from_id) : tL_forumTopic.id, 0, true, 0);
                        wpVar.getMessagesStorage().d2(-j12, wpVar.x2(j12) ? o5.o(tL_forumTopic.from_id) : tL_forumTopic.id, tL_forumTopic.top_message, 0);
                    }
                }
                wpVar.getMessagesStorage().a.c(new ak(wpVar, 19));
                break;
            case 3:
                wpVar.i5(0, -j10, arrayList);
                wpVar.getNotificationCenter().k(3, new Object[0]);
                break;
            case 4:
                i0.g3(new pk(this.b, this.d, this.c, 5));
                break;
            default:
                wpVar.i5(0, j10, arrayList);
                wpVar.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }

    public /* synthetic */ pk(wp wpVar, ArrayList arrayList, long j10, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = arrayList;
        this.d = j10;
    }
}
