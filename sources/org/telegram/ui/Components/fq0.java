package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fq0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ eu0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ int e;

    public /* synthetic */ fq0(eu0 eu0Var, org.telegram.ui.ActionBar.b6 b6Var, int i9, MessageObject messageObject) {
        this.b = eu0Var;
        this.c = b6Var;
        this.e = i9;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(this.b.getContext(), 3, this.c)};
                int i9 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i9).sendVote(this.d, null, new cs(c2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new kq0(c2VarArr, i9, sendVote, 0), 500L);
                    break;
                }
                break;
            default:
                eu0 eu0Var = this.b;
                Context context = eu0Var.getContext();
                org.telegram.ui.ActionBar.b6 b6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new bg.d0(eu0Var, b6Var, messageObject, this.e, 6));
                j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ fq0(eu0 eu0Var, org.telegram.ui.ActionBar.b6 b6Var, MessageObject messageObject, int i9) {
        this.b = eu0Var;
        this.c = b6Var;
        this.d = messageObject;
        this.e = i9;
    }
}
