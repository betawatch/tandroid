package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rq0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qu0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ int e;

    public /* synthetic */ rq0(qu0 qu0Var, org.telegram.ui.ActionBar.c6 c6Var, int i10, MessageObject messageObject) {
        this.b = qu0Var;
        this.c = c6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(this.b.getContext(), 3, this.c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new gs(c2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new vq0(c2VarArr, i10, sendVote, 0), 500L);
                    break;
                }
                break;
            default:
                qu0 qu0Var = this.b;
                Context context = qu0Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.L0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    c2Var.N = LocaleController.getString(R.string.StopQuizAlertTitle);
                    c2Var.P = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    c2Var.N = LocaleController.getString(R.string.StopPollAlertTitle);
                    c2Var.P = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new eg.b0(qu0Var, c6Var, messageObject, this.e, 6));
                j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ rq0(qu0 qu0Var, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.b = qu0Var;
        this.c = c6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
