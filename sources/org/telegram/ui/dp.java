package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ dp(mp mpVar, int i10) {
        this.a = i10;
        this.b = mpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        mp mpVar = this.b;
        switch (i10) {
            case 0:
                TLRPC.Chat currentChannel = ((org.telegram.ui.Cells.n) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mpVar.getParentActivity());
                String string = LocaleController.getString(R.string.AppName);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.R = string;
                if (mpVar.a0) {
                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, mpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, mpVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new oe(9, mpVar, currentChannel));
                mpVar.showDialog(d2Var);
                break;
            case 1:
                if (!mpVar.V) {
                    mpVar.V = true;
                    mpVar.b0();
                    break;
                }
                break;
            case 2:
                if (mpVar.V) {
                    if (!mpVar.c0) {
                        mpVar.Z();
                        break;
                    } else {
                        mpVar.V = false;
                        mpVar.b0();
                        break;
                    }
                }
                break;
            case 3:
                zh0 zh0Var = new zh0(mpVar.Z, 0L, 0);
                zh0Var.g0(mpVar.Y, mpVar.l0);
                mpVar.presentFragment(zh0Var);
                break;
            default:
                boolean z10 = !mpVar.b0;
                mpVar.b0 = z10;
                ((org.telegram.ui.Cells.x8) view).setChecked(z10);
                break;
        }
    }
}
