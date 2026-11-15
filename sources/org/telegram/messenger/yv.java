package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class yv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 d;

    public /* synthetic */ yv(bw bwVar, Context context, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a = i7;
        this.b = bwVar;
        this.c = context;
        this.d = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.t1 t1Var = this.d;
        Context context = this.c;
        bw bwVar = this.b;
        switch (i7) {
            case 0:
                bwVar.n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        t1Var.dismiss();
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                if (!((Activity) context).isFinishing()) {
                    bwVar.n = false;
                    try {
                        t1Var.dismiss();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = hd.M0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                    t1Var2.S = M0;
                    t1Var2.U = hd.M0(2131751750, null);
                    alertDialog$Builder.k(hd.M0(2131747831, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    break;
                }
                break;
        }
    }
}
