// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ar6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls6 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ar6(ls6 ls6Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        ls6 ls6Var = this.b;
        switch (b) {
            case 0:
                ls6Var.getNotificationCenter().k(57, Long.valueOf(r47.B0(((r47) arrayList.get(0)).k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                break;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    zh6 zh6Var = new zh6();
                    zh6 zh6Var2 = new zh6();
                    for (int i = 0; i < arrayList.size(); i++) {
                        try {
                            kf7.c((TLRPC.Message) arrayList.get(i), zh6Var, zh6Var2);
                        } catch (Exception e) {
                            ls6Var.getMessagesStorage().p(e, true);
                        }
                    }
                    ls6Var.getMessagesStorage().K0(zh6Var, zh6Var2, arrayList2, arrayList3, 0);
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}
