// default package

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ga2 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa2 b;

    public /* synthetic */ ga2(qa2 qa2Var, byte b) {
        this.a = b;
        this.b = qa2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        byte b2 = 1;
        qa2 qa2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Chat currentChannel = ((jb) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa2Var.getParentActivity());
                String M0 = jb6.M0(R.string.AppName, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                if (qa2Var.b0) {
                    heVar.U = gm.S2(jb6.a0("RevokeLinkAlertChannel", null, 2131745754, qa2Var.getMessagesController().N2 + "/" + sd2.K(currentChannel, false), currentChannel.title));
                } else {
                    heVar.U = gm.S2(jb6.a0("RevokeLinkAlert", null, 2131745755, qa2Var.getMessagesController().N2 + "/" + sd2.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.j(jb6.M0(2131745757, null), new x92(qa2Var, currentChannel, b2));
                qa2Var.showDialog(heVar);
                break;
            case 1:
                if (!qa2Var.W) {
                    qa2Var.W = true;
                    qa2Var.h0();
                    break;
                }
                break;
            case 2:
                if (qa2Var.W) {
                    if (!qa2Var.d0) {
                        qa2Var.f0();
                        break;
                    } else {
                        qa2Var.W = false;
                        qa2Var.h0();
                        break;
                    }
                }
                break;
            case 3:
                ak6 ak6Var = new ak6(qa2Var.a0, 0, 0L);
                ak6Var.m0(qa2Var.Z, qa2Var.m0);
                qa2Var.presentFragment(ak6Var);
                break;
            default:
                boolean z = !qa2Var.c0;
                qa2Var.c0 = z;
                ((bjb) view).setChecked(z);
                break;
        }
    }
}
