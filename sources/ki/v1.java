package ki;

import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ v1(t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                k2 k2Var = this.b.E;
                if (k2Var != null) {
                    if (!bool.booleanValue()) {
                        k2Var.Q = System.currentTimeMillis();
                        k2Var.y("secondary_button_pressed", null);
                        break;
                    } else {
                        k2Var.Q = System.currentTimeMillis();
                        k2Var.y("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new ji.f(11, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
