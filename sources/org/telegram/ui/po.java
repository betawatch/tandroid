package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                if (yoVar.W) {
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, yoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, yoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new kg.w(23, yoVar, currentChannel));
                yoVar.showDialog(c2Var);
                break;
            case 1:
                if (!yoVar.R) {
                    yoVar.R = true;
                    yoVar.b0();
                    break;
                }
                break;
            case 2:
                if (yoVar.R) {
                    if (!yoVar.Y) {
                        yoVar.Z();
                        break;
                    } else {
                        yoVar.R = false;
                        yoVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                hh0 hh0Var = new hh0(yoVar.V, 0L, 0);
                hh0Var.g0(yoVar.U, yoVar.h0);
                yoVar.presentFragment(hh0Var);
                break;
            default:
                boolean z10 = !yoVar.X;
                yoVar.X = z10;
                ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                break;
        }
    }
}
