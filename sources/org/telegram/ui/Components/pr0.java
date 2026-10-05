package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qv0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ int e;

    public /* synthetic */ pr0(qv0 qv0Var, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject) {
        this.b = qv0Var;
        this.c = d6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.b.getContext(), 3, this.c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new os(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new tr0(b2VarArr, i10, sendVote, 0), 500L);
                    break;
                }
                break;
            default:
                qv0 qv0Var = this.b;
                Context context = qv0Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.P0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    b2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    b2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    b2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.fa(qv0Var, d6Var, messageObject, this.e, 4));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ pr0(qv0 qv0Var, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.b = qv0Var;
        this.c = d6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
