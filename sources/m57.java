// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class m57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ m57(na7 na7Var, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = na7Var;
        this.d = j;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        ArrayList arrayList = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                ad7 messagesStorage = na7Var.getMessagesStorage();
                long j2 = this.d;
                ArrayList arrayList2 = this.c;
                na7Var.getMessagesStorage().O1(j2, -j2, arrayList2, messagesStorage.M0(j2, arrayList2, false, true, 0, 0));
                break;
            case 1:
                na7Var.getNotificationCenter().k(7, arrayList, Long.valueOf(j), Boolean.FALSE);
                if (j == 0) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        k27 k27Var = (k27) na7Var.V.get(((Integer) arrayList.get(i)).intValue());
                        if (k27Var != null) {
                            k27Var.Z = true;
                        }
                    }
                    break;
                } else {
                    ArrayList arrayList3 = (ArrayList) na7Var.S.f(-j);
                    if (arrayList3 != null) {
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            k27 k27Var2 = (k27) arrayList3.get(i2);
                            int size2 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size2) {
                                    break;
                                } else if (k27Var2.e1() == ((Integer) arrayList.get(i3)).intValue()) {
                                    k27Var2.Z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (arrayList != null) {
                    na7Var.getClass();
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i4);
                        na7 messagesController = na7Var.getMessagesController();
                        int i5 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        int i6 = message != null ? message.date : 0;
                        long j3 = this.d;
                        messagesController.l3(j3, i5, 0, i6, false, na7Var.x2(j3) ? cf3.n(tL_forumTopic.from_id) : tL_forumTopic.id, 0, true, 0);
                        na7Var.getMessagesStorage().a2(tL_forumTopic.top_message, 0, -j3, na7Var.x2(j3) ? cf3.n(tL_forumTopic.from_id) : tL_forumTopic.id);
                    }
                }
                na7Var.getMessagesStorage().a.c(new f67(na7Var, (byte) 28));
                break;
            case 3:
                gl.c3(new m57(this.b, this.d, this.c, (byte) 5));
                break;
            case 4:
                na7Var.r5(0, -j, arrayList);
                na7Var.getNotificationCenter().k(3, new Object[0]);
                break;
            default:
                na7Var.r5(0, j, arrayList);
                na7Var.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }

    public /* synthetic */ m57(na7 na7Var, ArrayList arrayList, long j, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = arrayList;
        this.d = j;
    }
}
