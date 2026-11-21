package ki;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ v1(s2 s2Var, int i7) {
        this.a = i7;
        this.b = s2Var;
    }

    @Override // org.telegram.messenger.x10
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
                org.telegram.messenger.g0.g3(new ji.i(9, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
