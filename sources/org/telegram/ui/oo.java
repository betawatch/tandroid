package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo b;

    public /* synthetic */ oo(xo xoVar, int i10) {
        this.a = i10;
        this.b = xoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        xo xoVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xoVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.N = string;
                if (xoVar.W) {
                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, xoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, xoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new jh.z1(23, xoVar, currentChannel));
                xoVar.showDialog(b2Var);
                break;
            case 1:
                if (!xoVar.R) {
                    xoVar.R = true;
                    xoVar.b0();
                    break;
                }
                break;
            case 2:
                if (xoVar.R) {
                    if (!xoVar.Y) {
                        xoVar.Z();
                        break;
                    } else {
                        xoVar.R = false;
                        xoVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                kh0 kh0Var = new kh0(xoVar.V, 0L, 0);
                kh0Var.g0(xoVar.U, xoVar.h0);
                xoVar.presentFragment(kh0Var);
                break;
            default:
                boolean z10 = !xoVar.X;
                xoVar.X = z10;
                ((org.telegram.ui.Cells.p8) view).setChecked(z10);
                break;
        }
    }
}
