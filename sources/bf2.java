// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bf2 implements ka5 {
    public final /* synthetic */ qa5 a;
    public final /* synthetic */ kf2 b;

    public bf2(kf2 kf2Var, qa5 qa5Var) {
        this.b = kf2Var;
        this.a = qa5Var;
    }

    @Override // ka5
    public final void e(TLRPC.User user) {
        this.b.w0(user.id, null, null, null, "", true, 0, false);
    }

    @Override // ka5
    public final void f(int i, ArrayList arrayList) {
        if (this.a.getParentActivity() == null) {
            return;
        }
        kf2 kf2Var = this.b;
        kf2Var.getMessagesController().l(kf2Var.n, kf2Var, arrayList, i, new gw(this, (byte) 6), new d42((byte) 1), null);
    }
}
