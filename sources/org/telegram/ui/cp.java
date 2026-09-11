package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp b;

    public /* synthetic */ cp(lp lpVar, int i10) {
        this.a = i10;
        this.b = lpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        lp lpVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                if (lpVar.a0) {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, lpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, lpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4(14, lpVar, currentChannel));
                lpVar.showDialog(b2Var);
                break;
            case 1:
                if (!lpVar.V) {
                    lpVar.V = true;
                    lpVar.b0();
                    break;
                }
                break;
            case 2:
                if (lpVar.V) {
                    if (!lpVar.c0) {
                        lpVar.Z();
                        break;
                    } else {
                        lpVar.V = false;
                        lpVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                yh0 yh0Var = new yh0(lpVar.Z, 0L, 0);
                yh0Var.g0(lpVar.Y, lpVar.l0);
                lpVar.presentFragment(yh0Var);
                break;
            default:
                boolean z10 = !lpVar.b0;
                lpVar.b0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                break;
        }
    }
}
