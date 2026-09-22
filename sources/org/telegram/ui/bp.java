package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ bp(kp kpVar, int i10) {
        this.a = i10;
        this.b = kpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        kp kpVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                if (kpVar.a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, kpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, kpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new x5(13, kpVar, currentChannel));
                kpVar.showDialog(b2Var);
                break;
            case 1:
                if (!kpVar.V) {
                    kpVar.V = true;
                    kpVar.b0();
                    break;
                }
                break;
            case 2:
                if (kpVar.V) {
                    if (!kpVar.c0) {
                        kpVar.Z();
                        break;
                    } else {
                        kpVar.V = false;
                        kpVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                yh0 yh0Var = new yh0(kpVar.Z, 0L, 0);
                yh0Var.g0(kpVar.Y, kpVar.l0);
                kpVar.presentFragment(yh0Var);
                break;
            default:
                boolean z10 = !kpVar.b0;
                kpVar.b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                break;
        }
    }
}
