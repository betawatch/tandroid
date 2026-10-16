package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xv0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ int e;

    public /* synthetic */ xr0(xv0 xv0Var, org.telegram.ui.ActionBar.c6 c6Var, int i10, MessageObject messageObject) {
        this.b = xv0Var;
        this.c = c6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(this.b.getContext(), 3, this.c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ys(a2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new cs0(a2VarArr, i10, sendVote, 0), 500L);
                    break;
                }
                break;
            default:
                xv0 xv0Var = this.b;
                Context context = xv0Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    a2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    a2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    a2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    a2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.ia(xv0Var, c6Var, messageObject, this.e, 4));
                i2.d.r(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ xr0(xv0 xv0Var, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.b = xv0Var;
        this.c = c6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
