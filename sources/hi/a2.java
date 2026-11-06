package hi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ a2(a3 a3Var, int i7) {
        this.a = i7;
        this.b = a3Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s2 s2Var = this.b.D;
                if (s2Var != null) {
                    if (!bool.booleanValue()) {
                        s2Var.P = System.currentTimeMillis();
                        s2Var.y("secondary_button_pressed", null);
                        break;
                    } else {
                        s2Var.P = System.currentTimeMillis();
                        s2Var.y("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new ha.b(2, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
