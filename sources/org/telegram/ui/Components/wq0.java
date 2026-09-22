package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wq0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yu0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ int e;

    public /* synthetic */ wq0(yu0 yu0Var, org.telegram.ui.ActionBar.e6 e6Var, int i10, MessageObject messageObject) {
        this.b = yu0Var;
        this.c = e6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.b.getContext(), 3, this.c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ls(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new br0(b2VarArr, i10, sendVote, 0), 500L);
                    break;
                }
                break;
            default:
                yu0 yu0Var = this.b;
                Context context = yu0Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.da(yu0Var, e6Var, messageObject, this.e, 4));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ wq0(yu0 yu0Var, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject, int i10) {
        this.b = yu0Var;
        this.c = e6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
