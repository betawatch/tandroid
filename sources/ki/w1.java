package ki;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ w1(t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                l2 l2Var = this.b.E;
                if (l2Var != null) {
                    if (!bool.booleanValue()) {
                        l2Var.Q = System.currentTimeMillis();
                        l2Var.y("secondary_button_pressed", null);
                        break;
                    } else {
                        l2Var.Q = System.currentTimeMillis();
                        l2Var.y("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new kg.h0(7, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
