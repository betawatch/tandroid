package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class uv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 d;

    public /* synthetic */ uv(xv xvVar, Context context, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a = i7;
        this.b = xvVar;
        this.c = context;
        this.d = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.t1 t1Var = this.d;
        Context context = this.c;
        xv xvVar = this.b;
        switch (i7) {
            case 0:
                xvVar.n = false;
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
                    xvVar.n = false;
                    try {
                        t1Var.dismiss();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String N0 = gd.N0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.a;
                    t1Var2.S = N0;
                    t1Var2.U = gd.N0(2131751738, null);
                    alertDialog$Builder.k(gd.N0(2131747637, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    break;
                }
                break;
        }
    }
}
