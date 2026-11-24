// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
