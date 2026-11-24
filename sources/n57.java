// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class n57 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ n57(na7 na7Var, long j, long j2, ArrayList arrayList) {
        this.b = na7Var;
        this.d = j;
        this.e = j2;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                ad7 messagesStorage = na7Var.getMessagesStorage();
                int i = (int) this.e;
                long j = this.d;
                ArrayList arrayList = this.c;
                na7Var.getMessagesStorage().O1(j, -j, arrayList, messagesStorage.M0(j, arrayList, false, true, 5, i));
                break;
            case 1:
                na7 na7Var2 = this.b;
                ArrayList arrayList2 = this.c;
                long j2 = this.d;
                gl.d3(new m57(na7Var2, arrayList2, j2, (byte) 1));
                ad7 messagesStorage2 = na7Var2.getMessagesStorage();
                long j3 = this.e;
                messagesStorage2.D(arrayList2, j3);
                na7Var2.getMessagesStorage().O1(j3, j2, arrayList2, na7Var2.getMessagesStorage().M0(j3, arrayList2, false, true, 0, 0));
                break;
            default:
                pub pubVar = na7Var.getMessagesController().g4;
                long j4 = this.d;
                long j5 = this.e;
                pubVar.B(0, j4, j5, false);
                na7Var.getMessagesStorage().e2(0, j4, j5, false);
                na7Var.getNotificationCenter().k(kk7.b5, Long.valueOf(j4), Long.valueOf(j5), 0, this.c);
                break;
        }
    }

    public /* synthetic */ n57(na7 na7Var, long j, ArrayList arrayList, long j2) {
        this.b = na7Var;
        this.d = j;
        this.c = arrayList;
        this.e = j2;
    }

    public /* synthetic */ n57(na7 na7Var, ArrayList arrayList, long j, long j2) {
        this.b = na7Var;
        this.c = arrayList;
        this.d = j;
        this.e = j2;
    }
}
