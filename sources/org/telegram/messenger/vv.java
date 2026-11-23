package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class vv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 d;

    public /* synthetic */ vv(yv yvVar, Context context, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a = i7;
        this.b = yvVar;
        this.c = context;
        this.d = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.t1 t1Var = this.d;
        Context context = this.c;
        yv yvVar = this.b;
        switch (i7) {
            case 0:
                yvVar.n = false;
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
                    yvVar.n = false;
                    try {
                        t1Var.dismiss();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String N0 = hd.N0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                    t1Var2.S = N0;
                    t1Var2.U = hd.N0(2131751738, null);
                    alertDialog$Builder.k(hd.N0(2131747637, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    break;
                }
                break;
        }
    }
}
