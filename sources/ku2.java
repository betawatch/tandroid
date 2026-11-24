// default package

import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ku2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qu2 b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ HashMap d;

    public /* synthetic */ ku2(qu2 qu2Var, HashMap hashMap, HashMap hashMap2, byte b) {
        this.a = b;
        this.b = qu2Var;
        this.c = hashMap;
        this.d = hashMap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qu2 qu2Var = this.b;
                Utilities.e.c(new ku2(qu2Var, this.c, this.d, (byte) 1));
                if (!qu2Var.e) {
                    qu2Var.e = true;
                    ad7 messagesStorage = qu2Var.getMessagesStorage();
                    messagesStorage.a.c(new cc7(messagesStorage, false, (byte) 0));
                    break;
                }
                break;
            default:
                qu2 qu2Var2 = this.b;
                HashMap hashMap = this.c;
                HashMap hashMap2 = this.d;
                qu2Var2.l0 = hashMap;
                qu2Var2.m0 = hashMap2;
                break;
        }
    }
}
