// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class dq6 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ hs6 b;
    public final /* synthetic */ bf7 c;
    public final /* synthetic */ TLRPC.Message d;

    public /* synthetic */ dq6(hs6 hs6Var, bf7 bf7Var, TLRPC.Message message) {
        this.b = hs6Var;
        this.c = bf7Var;
        this.d = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Message message = this.d;
        bf7 bf7Var = this.c;
        hs6 hs6Var = this.b;
        switch (b) {
            case 0:
                hs6Var.getNotificationCenter().k(70, message, bf7Var);
                break;
            default:
                vh6 vh6Var = hs6Var.B1;
                HashMap hashMap = hs6Var.A1;
                TLRPC.Message message2 = (TLRPC.Message) hashMap.get(bf7Var);
                hashMap.put(bf7Var, message);
                vh6 vh6Var2 = hs6Var.z1;
                ArrayList arrayList = (ArrayList) vh6Var2.f(bf7Var.a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(message);
                vh6Var2.k(arrayList, bf7Var.a);
                if (k47.v0(message) == 0) {
                    if (message2 != null) {
                        vh6Var.e(message2.id);
                    }
                    vh6Var.k(bf7Var, message.id);
                }
                hs6Var.getNotificationCenter().k(70, message, bf7Var);
                break;
        }
    }

    public /* synthetic */ dq6(hs6 hs6Var, TLRPC.Message message, bf7 bf7Var) {
        this.b = hs6Var;
        this.d = message;
        this.c = bf7Var;
    }
}
