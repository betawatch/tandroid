// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class b36 extends taa {
    public final /* synthetic */ f36 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b36(f36 f36Var, Context context, String str, String str2, wjb wjbVar) {
        super(context, null, str, false, str2, false, wjbVar);
        this.U2 = f36Var;
    }

    @Override // taa
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        String a0;
        if (z) {
            if (vf6Var == null || vf6Var.m() != 1) {
                a0 = k96.a0(null, null, 2131748995, k96.G(i, "Chats", new Object[0]));
            } else {
                long j = ((TLRPC.Dialog) vf6Var.n(0)).id;
                a0 = (j == 0 || j == y6c.h(this.a).e()) ? k96.M0(2131748993, null) : k96.a0(null, null, 2131748992, na7.q1(this.a).y1(j, true));
            }
            this.U2.e(gl.S2(a0));
        }
    }
}
