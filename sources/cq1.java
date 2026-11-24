// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cq1 extends o72 {
    public final /* synthetic */ mu1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq1(mu1 mu1Var, Context context, mu1 mu1Var2, boolean z, wjb wjbVar) {
        super(context, mu1Var2, z, wjbVar);
        this.B0 = mu1Var;
    }

    @Override // o72
    public final boolean a() {
        boolean z;
        mu1 mu1Var = this.B0;
        if (mu1Var.mb || mu1Var.isInPreviewMode()) {
            return false;
        }
        z = ((d) mu1Var).inBubbleMode;
        if (z || mu1Var.k0 == null || mu1Var.H3) {
            return false;
        }
        return !mu1Var.a8() || mu1Var.x4;
    }

    @Override // o72
    public final boolean d() {
        mu1 mu1Var = this.B0;
        TLRPC.User user = mu1Var.f;
        if (user != null && user.linked_community_id != 0) {
            mu1Var.showDialog(new eo2(mu1Var, mu1Var.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = mu1Var.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        mu1Var.showDialog(new eo2(mu1Var, mu1Var.e.linked_community_id, null, null));
        return true;
    }

    @Override // o72
    public final void f() {
        mu1 mu1Var = this.B0;
        mu1Var.ra(mu1Var.Z7() ? "" : null);
    }

    @Override // o72
    public final boolean o() {
        return this.B0.g4 == 3;
    }
}
