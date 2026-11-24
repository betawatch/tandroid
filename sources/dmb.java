// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dmb extends taa {
    public final /* synthetic */ fmb U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmb(fmb fmbVar, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = fmbVar;
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            int m = vf6Var.m();
            qmb qmbVar = this.U2.a;
            if (m != 1) {
                qmbVar.n0.k(0L, 61, Integer.valueOf(i), Integer.valueOf(vf6Var.m()), null, null);
                return;
            }
            qmbVar.n0.m(Integer.valueOf(i), 61, ((TLRPC.Dialog) vf6Var.n(0)).id);
        }
    }
}
