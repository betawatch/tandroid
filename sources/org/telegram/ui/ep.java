package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ ep(np npVar, int i10) {
        this.a = i10;
        this.b = npVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        np npVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(npVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                if (npVar.a0) {
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, npVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, npVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.z0(19, npVar, currentChannel));
                npVar.showDialog(a2Var);
                break;
            case 1:
                if (!npVar.V) {
                    npVar.V = true;
                    npVar.b0();
                    break;
                }
                break;
            case 2:
                if (npVar.V) {
                    if (!npVar.c0) {
                        npVar.Z();
                        break;
                    } else {
                        npVar.V = false;
                        npVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                ei0 ei0Var = new ei0(npVar.Z, 0L, 0);
                ei0Var.g0(npVar.Y, npVar.l0);
                npVar.presentFragment(ei0Var);
                break;
            default:
                boolean z10 = !npVar.b0;
                npVar.b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                break;
        }
    }
}
