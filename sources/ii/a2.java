package ii;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ a2(a3 a3Var, int i3) {
        this.a = i3;
        this.b = a3Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s2 s2Var = this.b.E;
                if (s2Var != null) {
                    if (!bool.booleanValue()) {
                        s2Var.Q = System.currentTimeMillis();
                        s2Var.y("secondary_button_pressed", null);
                        break;
                    } else {
                        s2Var.Q = System.currentTimeMillis();
                        s2Var.y("main_button_pressed", null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new e(1, this.b, (TLRPC.UserFull) obj));
                break;
        }
    }
}
