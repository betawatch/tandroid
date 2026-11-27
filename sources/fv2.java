// default package

import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class fv2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lv2 b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;

    public /* synthetic */ fv2(lv2 lv2Var, HashMap hashMap, HashMap hashMap2, byte b) {
        this.a = b;
        this.b = lv2Var;
        this.c = hashMap;
        this.d = hashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lv2 lv2Var = this.b;
                Utilities.e.c(new fv2(lv2Var, this.c, this.d, (byte) 1));
                if (!lv2Var.e) {
                    lv2Var.e = true;
                    jf7 messagesStorage = lv2Var.getMessagesStorage();
                    messagesStorage.a.c(new je7(messagesStorage, false, (byte) 0));
                    break;
                }
                break;
            default:
                lv2 lv2Var2 = this.b;
                HashMap hashMap = this.c;
                HashMap hashMap2 = this.d;
                lv2Var2.l0 = hashMap;
                lv2Var2.m0 = hashMap2;
                break;
        }
    }
}
