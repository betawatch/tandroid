package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ aw0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ int e;

    public /* synthetic */ ds0(aw0 aw0Var, org.telegram.ui.ActionBar.u6 u6Var, int i10, MessageObject messageObject) {
        this.b = aw0Var;
        this.c = u6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(this.b.getContext(), 3, this.c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new xs(e2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new ns0(e2VarArr, i10, sendVote, 0), 500L);
                    break;
                }
                break;
            default:
                aw0 aw0Var = this.b;
                Context context = aw0Var.getContext();
                org.telegram.ui.ActionBar.u6 u6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    e2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    e2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    e2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    e2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new ag.k0(aw0Var, u6Var, messageObject, this.e, 5));
                ic.a.r(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ ds0(aw0 aw0Var, org.telegram.ui.ActionBar.u6 u6Var, MessageObject messageObject, int i10) {
        this.b = aw0Var;
        this.c = u6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
