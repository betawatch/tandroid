// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cqb extends kea {
    public final /* synthetic */ eqb U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqb(eqb eqbVar, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = eqbVar;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            int m = zh6Var.m();
            pqb pqbVar = this.U2.a;
            if (m == 1) {
                pqbVar.n0.m(((TLRPC.Dialog) zh6Var.n(0)).id, Integer.valueOf(i), 61);
            } else {
                pqbVar.n0.k(0L, 61, Integer.valueOf(i), Integer.valueOf(zh6Var.m()), null, null);
            }
        }
    }
}
