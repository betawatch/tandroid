// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class df3 implements wi3, rt2 {
    public final /* synthetic */ hf3 a;

    public /* synthetic */ df3(hf3 hf3Var) {
        this.a = hf3Var;
    }

    @Override // wi3
    public final boolean F() {
        return false;
    }

    @Override // rt2
    public final void b(TLRPC.User user) {
        this.a.p0(user);
    }

    @Override // wi3
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j = ((zc7) arrayList.get(0)).a;
        if (!cf3.D(j)) {
            return true;
        }
        hf3 hf3Var = this.a;
        hf3Var.p0(hf3Var.getMessagesController().V1(Long.valueOf(j)));
        return true;
    }

    @Override // wi3
    public final boolean t(cj3 cj3Var) {
        return false;
    }
}
