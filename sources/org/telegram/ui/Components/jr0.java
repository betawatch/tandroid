package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ jv0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ int e;

    public /* synthetic */ jr0(jv0 jv0Var, org.telegram.ui.ActionBar.d6 d6Var, int i10, MessageObject messageObject) {
        this.b = jv0Var;
        this.c = d6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(this.b.getContext(), 3, this.c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ms(a2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new nr0(a2VarArr, i10, sendVote, 0), 500L);
                    break;
                }
                break;
            default:
                jv0 jv0Var = this.b;
                Context context = jv0Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.da(jv0Var, d6Var, messageObject, this.e, 4));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ jr0(jv0 jv0Var, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.b = jv0Var;
        this.c = d6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
