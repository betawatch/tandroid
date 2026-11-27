// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class l85 extends kea {
    public final /* synthetic */ j95 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l85(j95 j95Var, Context context, String str, String str2, String str3, String str4) {
        super(context, null, str, str2, false, str3, str4, true);
        this.U2 = j95Var;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            int m = zh6Var.m();
            j95 j95Var = this.U2;
            if (m == 1) {
                j95Var.d1().m(((TLRPC.Dialog) zh6Var.n(0)).id, Integer.valueOf(i), 41);
            } else {
                j95Var.d1().k(0L, 41, Integer.valueOf(i), Integer.valueOf(zh6Var.m()), null, null);
            }
        }
    }
}
