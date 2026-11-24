// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class n77 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ n77(oc7 oc7Var, long j, long j2, ArrayList arrayList) {
        this.b = oc7Var;
        this.d = j;
        this.e = j2;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                cf7 messagesStorage = oc7Var.getMessagesStorage();
                int i = (int) this.e;
                long j = this.d;
                ArrayList arrayList = this.c;
                oc7Var.getMessagesStorage().O1(j, -j, arrayList, messagesStorage.M0(j, arrayList, false, true, 5, i));
                break;
            case 1:
                oc7 oc7Var2 = this.b;
                ArrayList arrayList2 = this.c;
                long j2 = this.d;
                gm.c3(new m77(oc7Var2, arrayList2, j2, (byte) 1));
                cf7 messagesStorage2 = oc7Var2.getMessagesStorage();
                long j3 = this.e;
                messagesStorage2.D(arrayList2, j3);
                oc7Var2.getMessagesStorage().O1(j3, j2, arrayList2, oc7Var2.getMessagesStorage().M0(j3, arrayList2, false, true, 0, 0));
                break;
            default:
                qwb qwbVar = oc7Var.getMessagesController().g4;
                long j4 = this.d;
                long j5 = this.e;
                qwbVar.B(0, j4, j5, false);
                oc7Var.getMessagesStorage().e2(0, j4, j5, false);
                oc7Var.getNotificationCenter().k(nm7.d5, Long.valueOf(j4), Long.valueOf(j5), 0, this.c);
                break;
        }
    }

    public /* synthetic */ n77(oc7 oc7Var, long j, ArrayList arrayList, long j2) {
        this.b = oc7Var;
        this.d = j;
        this.c = arrayList;
        this.e = j2;
    }

    public /* synthetic */ n77(oc7 oc7Var, ArrayList arrayList, long j, long j2) {
        this.b = oc7Var;
        this.c = arrayList;
        this.d = j;
        this.e = j2;
    }
}
