package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo b;

    public /* synthetic */ no(wo woVar, int i10) {
        this.a = i10;
        this.b = woVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        wo woVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(woVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                if (woVar.a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, woVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, woVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.w0(20, woVar, currentChannel));
                woVar.showDialog(b2Var);
                break;
            case 1:
                if (!woVar.V) {
                    woVar.V = true;
                    woVar.b0();
                    break;
                }
                break;
            case 2:
                if (woVar.V) {
                    if (!woVar.c0) {
                        woVar.Z();
                        break;
                    } else {
                        woVar.V = false;
                        woVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                ih0 ih0Var = new ih0(woVar.Z, 0L, 0);
                ih0Var.g0(woVar.Y, woVar.l0);
                woVar.presentFragment(ih0Var);
                break;
            default:
                boolean z10 = !woVar.b0;
                woVar.b0 = z10;
                ((org.telegram.ui.Cells.v8) view).setChecked(z10);
                break;
        }
    }
}
