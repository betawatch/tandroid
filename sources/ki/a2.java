package ki;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ a2(x2 x2Var, int i7) {
        this.a = i7;
        this.b = x2Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                p2 p2Var = this.b.E;
                if (p2Var != null) {
                    if (!bool.booleanValue()) {
                        p2Var.Q = System.currentTimeMillis();
                        p2Var.y("secondary_button_pressed", null);
                        break;
                    } else {
                        p2Var.Q = System.currentTimeMillis();
                        p2Var.y("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new kg.t1(4, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
