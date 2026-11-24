// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class m77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ m77(oc7 oc7Var, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.d = j;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        ArrayList arrayList = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                cf7 messagesStorage = oc7Var.getMessagesStorage();
                long j2 = this.d;
                ArrayList arrayList2 = this.c;
                oc7Var.getMessagesStorage().O1(j2, -j2, arrayList2, messagesStorage.M0(j2, arrayList2, false, true, 0, 0));
                break;
            case 1:
                oc7Var.getNotificationCenter().k(7, arrayList, Long.valueOf(j), Boolean.FALSE);
                if (j == 0) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        k47 k47Var = (k47) oc7Var.V.get(((Integer) arrayList.get(i)).intValue());
                        if (k47Var != null) {
                            k47Var.Z = true;
                        }
                    }
                    break;
                } else {
                    ArrayList arrayList3 = (ArrayList) oc7Var.S.f(-j);
                    if (arrayList3 != null) {
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            k47 k47Var2 = (k47) arrayList3.get(i2);
                            int size2 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size2) {
                                    break;
                                } else if (k47Var2.e1() == ((Integer) arrayList.get(i3)).intValue()) {
                                    k47Var2.Z = true;
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
                    oc7Var.getClass();
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i4);
                        oc7 messagesController = oc7Var.getMessagesController();
                        int i5 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        int i6 = message != null ? message.date : 0;
                        long j3 = this.d;
                        messagesController.n3(j3, i5, 0, i6, false, oc7Var.y2(j3) ? pg3.n(tL_forumTopic.from_id) : tL_forumTopic.id, 0, true, 0);
                        oc7Var.getMessagesStorage().a2(tL_forumTopic.top_message, 0, -j3, oc7Var.y2(j3) ? pg3.n(tL_forumTopic.from_id) : tL_forumTopic.id);
                    }
                }
                oc7Var.getMessagesStorage().a.c(new g87(oc7Var, (byte) 28));
                break;
            case 3:
                oc7Var.t5(0, -j, arrayList);
                oc7Var.getNotificationCenter().k(3, new Object[0]);
                break;
            case 4:
                gm.c3(new m77(this.b, this.d, this.c, (byte) 5));
                break;
            default:
                oc7Var.t5(0, j, arrayList);
                oc7Var.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }

    public /* synthetic */ m77(oc7 oc7Var, ArrayList arrayList, long j, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = arrayList;
        this.d = j;
    }
}
