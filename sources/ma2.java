// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ma2 extends iw5 {
    public final /* synthetic */ Context x;
    public final /* synthetic */ qa2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma2(qa2 qa2Var, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = qa2Var;
        this.x = context2;
    }

    @Override // iw5
    public final boolean a(final boolean z, gw5 gw5Var) {
        TLRPC.ChatFull chatFull;
        int i;
        ylb ylbVar;
        qa2 qa2Var = this.y;
        final byte b = 1;
        if (!qa2Var.W || (chatFull = qa2Var.Z) == null || (i = chatFull.invitesCount) == 0) {
            return true;
        }
        String str = qa2Var.b0 ? z ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel" : z ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
        Context context = this.x;
        ylbVar = ((d) qa2Var).resourceProvider;
        final byte b2 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131754169, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.S2(jb6.G(i, str, new Object[0]));
        alertDialog$Builder.j(jb6.M0(2131754171, null), new ee(this) { // from class: la2
            public final /* synthetic */ ma2 b;

            {
                this.b = this;
            }

            @Override // ee
            public final void r(he heVar2, int i2) {
                byte b3 = b2;
                boolean z2 = z;
                ma2 ma2Var = this.b;
                switch (b3) {
                    case 0:
                        ma2Var.setJoinRequest(z2);
                        ma2Var.y.X = true;
                        break;
                    default:
                        ma2Var.setJoinRequest(z2);
                        ma2Var.y.X = false;
                        break;
                }
            }
        });
        alertDialog$Builder.g(jb6.M0(2131754170, null), new ee(this) { // from class: la2
            public final /* synthetic */ ma2 b;

            {
                this.b = this;
            }

            @Override // ee
            public final void r(he heVar2, int i2) {
                byte b3 = b;
                boolean z2 = z;
                ma2 ma2Var = this.b;
                switch (b3) {
                    case 0:
                        ma2Var.setJoinRequest(z2);
                        ma2Var.y.X = true;
                        break;
                    default:
                        ma2Var.setJoinRequest(z2);
                        ma2Var.y.X = false;
                        break;
                }
            }
        });
        qa2Var.showDialog(heVar);
        return false;
    }
}
