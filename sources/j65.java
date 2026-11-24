// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class j65 extends taa {
    public final /* synthetic */ h75 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j65(h75 h75Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.U2 = h75Var;
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            int m = vf6Var.m();
            h75 h75Var = this.U2;
            if (m != 1) {
                h75Var.c1().k(0L, 41, Integer.valueOf(i), Integer.valueOf(vf6Var.m()), null, null);
                return;
            }
            h75Var.c1().m(Integer.valueOf(i), 41, ((TLRPC.Dialog) vf6Var.n(0)).id);
        }
    }
}
