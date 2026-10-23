package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                c2Var.R = string;
                if (yoVar.b0) {
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, yoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                } else {
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, yoVar.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title));
                }
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new m4.w0(20, yoVar, currentChannel));
                yoVar.showDialog(c2Var);
                break;
            case 1:
                if (!yoVar.W) {
                    yoVar.W = true;
                    yoVar.c0();
                    break;
                }
                break;
            case 2:
                if (yoVar.W) {
                    if (!yoVar.d0) {
                        yoVar.a0();
                        break;
                    } else {
                        yoVar.W = false;
                        yoVar.c0();
                        break;
                    }
                }
                break;
            case 3:
                mh0 mh0Var = new mh0(yoVar.a0, 0L, 0);
                mh0Var.h0(yoVar.Z, yoVar.m0);
                yoVar.presentFragment(mh0Var);
                break;
            default:
                boolean z10 = !yoVar.c0;
                yoVar.c0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                break;
        }
    }
}
