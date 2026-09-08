package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class wq0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xu0 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ int e;

    public /* synthetic */ wq0(xu0 xu0Var, org.telegram.ui.ActionBar.f6 f6Var, int i10, MessageObject messageObject) {
        this.b = xu0Var;
        this.c = f6Var;
        this.e = i10;
        this.d = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(this.b.getContext(), 3, this.c)};
                int i10 = this.e;
                int sendVote = SendMessagesHelper.getInstance(i10).sendVote(this.d, null, new ks(b2VarArr, 1));
                if (sendVote != 0) {
                    AndroidUtilities.runOnUIThread(new ar0(b2VarArr, i10, sendVote, 0), 500L);
                    break;
                }
                break;
            default:
                xu0 xu0Var = this.b;
                Context context = xu0Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Stop), new org.telegram.ui.da(xu0Var, f6Var, messageObject, this.e, 4));
                i2.g.r(R.string.Cancel, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ wq0(xu0 xu0Var, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.b = xu0Var;
        this.c = f6Var;
        this.d = messageObject;
        this.e = i10;
    }
}
