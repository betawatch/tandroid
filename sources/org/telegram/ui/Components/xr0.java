package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xv0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ int e;

    public /* synthetic */ xr0(xv0 xv0Var, org.telegram.ui.ActionBar.g6 g6Var, int i10, MessageObject messageObject) {
        this.b = xv0Var;
        this.c = g6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(this.b.getContext(), 3, this.c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new vs(c2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new cs0(c2VarArr, i10, sendVote, 0), 500L);
                    break;
                }
                break;
            default:
                xv0 xv0Var = this.b;
                Context context = xv0Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R0 = false;
                MessageObject messageObject = this.d;
                if (messageObject.isQuiz()) {
                    c2Var.R = LocaleController.getString(R.string.StopQuizAlertTitle);
                    c2Var.T = LocaleController.getString(R.string.StopQuizAlertText);
                } else {
                    c2Var.R = LocaleController.getString(R.string.StopPollAlertTitle);
                    c2Var.T = LocaleController.getString(R.string.StopPollAlertText);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.fa(xv0Var, g6Var, messageObject, this.e, 4));
                i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ xr0(xv0 xv0Var, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject, int i10) {
        this.b = xv0Var;
        this.c = g6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
