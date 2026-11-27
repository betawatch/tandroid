// default package

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l92 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v92 b;

    public /* synthetic */ l92(v92 v92Var, byte b) {
        this.a = b;
        this.b = v92Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        v92 v92Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Chat currentChannel = ((kb) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v92Var.getParentActivity());
                String M0 = ob6.M0(R.string.AppName, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                byte b2 = 2;
                if (v92Var.b0) {
                    idVar.U = hl.S2(ob6.a0("RevokeLinkAlertChannel", null, 2131745748, v92Var.getMessagesController().N2 + "/" + xc2.K(currentChannel, false), currentChannel.title));
                } else {
                    idVar.U = hl.S2(ob6.a0("RevokeLinkAlert", null, 2131745749, v92Var.getMessagesController().N2 + "/" + xc2.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.j(ob6.M0(2131745751, null), new q72(v92Var, currentChannel, b2));
                v92Var.showDialog(idVar);
                break;
            case 1:
                if (!v92Var.W) {
                    v92Var.W = true;
                    v92Var.g0();
                    break;
                }
                break;
            case 2:
                if (v92Var.W) {
                    if (!v92Var.d0) {
                        v92Var.e0();
                        break;
                    } else {
                        v92Var.W = false;
                        v92Var.g0();
                        break;
                    }
                }
                break;
            case 3:
                ck6 ck6Var = new ck6(v92Var.a0, 0, 0L);
                ck6Var.l0(v92Var.Z, v92Var.m0);
                v92Var.presentFragment(ck6Var);
                break;
            default:
                boolean z = !v92Var.c0;
                v92Var.c0 = z;
                ((wkb) view).setChecked(z);
                break;
        }
    }
}
