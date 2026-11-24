// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class b92 extends ju5 {
    public final /* synthetic */ Context x;
    public final /* synthetic */ f92 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b92(f92 f92Var, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = f92Var;
        this.x = context2;
    }

    @Override // ju5
    public final boolean a(final boolean z, hu5 hu5Var) {
        TLRPC.ChatFull chatFull;
        int i;
        wjb wjbVar;
        f92 f92Var = this.y;
        final byte b = 1;
        if (!f92Var.W || (chatFull = f92Var.Z) == null || (i = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = f92Var.b0 ? z ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.x;
        wjbVar = ((d) f92Var).resourceProvider;
        final byte b2 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        String M0 = k96.M0(2131754201, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = gl.S2(k96.G(i, str, new Object[0]));
        alertDialog$Builder.j(k96.M0(2131754203, null), new ed(this) { // from class: a92
            public final /* synthetic */ b92 b;

            {
                this.b = this;
            }

            @Override // ed
            public final void u(hd hdVar2, int i2) {
                byte b3 = b2;
                boolean z2 = z;
                b92 b92Var = this.b;
                switch (b3) {
                    case 0:
                        b92Var.setJoinRequest(z2);
                        b92Var.y.X = true;
                        break;
                    default:
                        b92Var.setJoinRequest(z2);
                        b92Var.y.X = false;
                        break;
                }
            }
        });
        alertDialog$Builder.g(k96.M0(2131754202, null), new ed(this) { // from class: a92
            public final /* synthetic */ b92 b;

            {
                this.b = this;
            }

            @Override // ed
            public final void u(hd hdVar2, int i2) {
                byte b3 = b;
                boolean z2 = z;
                b92 b92Var = this.b;
                switch (b3) {
                    case 0:
                        b92Var.setJoinRequest(z2);
                        b92Var.y.X = true;
                        break;
                    default:
                        b92Var.setJoinRequest(z2);
                        b92Var.y.X = false;
                        break;
                }
            }
        });
        f92Var.showDialog(hdVar);
        return false;
    }
}
