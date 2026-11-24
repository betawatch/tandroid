// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class co6 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ hq6 b;
    public final /* synthetic */ zc7 c;
    public final /* synthetic */ TLRPC.Message d;

    public /* synthetic */ co6(hq6 hq6Var, zc7 zc7Var, TLRPC.Message message) {
        this.b = hq6Var;
        this.c = zc7Var;
        this.d = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Message message = this.d;
        zc7 zc7Var = this.c;
        hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                hq6Var.getNotificationCenter().k(69, message, zc7Var);
                break;
            default:
                vf6 vf6Var = hq6Var.B1;
                HashMap hashMap = hq6Var.A1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(zc7Var);
                hashMap.put(zc7Var, message);
                vf6 vf6Var2 = hq6Var.z1;
                ArrayList arrayList = (ArrayList) vf6Var2.f(zc7Var.a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                vf6Var2.k(arrayList, zc7Var.a);
                if (k27.v0(message) == 0) {
                    if (message2 != null) {
                        vf6Var.e(message2.id);
                    }
                    vf6Var.k(zc7Var, message.id);
                }
                hq6Var.getNotificationCenter().k(69, message, zc7Var);
                break;
        }
    }

    public /* synthetic */ co6(hq6 hq6Var, TLRPC.Message message, zc7 zc7Var) {
        this.b = hq6Var;
        this.d = message;
        this.c = zc7Var;
    }
}
