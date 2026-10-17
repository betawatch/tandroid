package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo b;

    public /* synthetic */ po(yo yoVar, int i10) {
        this.a = i10;
        this.b = yoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        yo yoVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yoVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                if (yoVar.a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, yoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, yoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.y0(19, yoVar, currentChannel));
                yoVar.showDialog(b2Var);
                break;
            case 1:
                if (!yoVar.V) {
                    yoVar.V = true;
                    yoVar.b0();
                    break;
                }
                break;
            case 2:
                if (yoVar.V) {
                    if (!yoVar.c0) {
                        yoVar.Z();
                        break;
                    } else {
                        yoVar.V = false;
                        yoVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                kh0 kh0Var = new kh0(yoVar.Z, 0L, 0);
                kh0Var.g0(yoVar.Y, yoVar.l0);
                yoVar.presentFragment(kh0Var);
                break;
            default:
                boolean z10 = !yoVar.b0;
                yoVar.b0 = z10;
                ((org.telegram.ui.Cells.v8) view).setChecked(z10);
                break;
        }
    }
}
