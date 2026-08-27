package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ hu0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ int e;

    public /* synthetic */ gq0(hu0 hu0Var, org.telegram.ui.ActionBar.c6 c6Var, int i10, MessageObject messageObject) {
        this.b = hu0Var;
        this.c = c6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.b.getContext(), 3, this.c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new as(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new lq0(b2VarArr, i10, sendVote, 0), 500L);
                    break;
                }
                break;
            default:
                hu0 hu0Var = this.b;
                Context context = hu0Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.L0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    b2Var.N = LocaleController.getString(R.string.StopQuizAlertTitle);
                    b2Var.P = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    b2Var.N = LocaleController.getString(R.string.StopPollAlertTitle);
                    b2Var.P = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new cg.a0(hu0Var, c6Var, messageObject, this.e, 6));
                i0.a.w(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ gq0(hu0 hu0Var, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.b = hu0Var;
        this.c = c6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
