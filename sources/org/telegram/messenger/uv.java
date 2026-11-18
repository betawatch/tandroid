package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class uv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 d;

    public /* synthetic */ uv(xv xvVar, Context context, org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.a = i7;
        this.b = xvVar;
        this.c = context;
        this.d = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.u1 u1Var = this.d;
        Context context = this.c;
        xv xvVar = this.b;
        switch (i7) {
            case 0:
                xvVar.n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        u1Var.dismiss();
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
                        u1Var.dismiss();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = gd.M0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                    u1Var2.S = M0;
                    u1Var2.U = gd.M0(2131751739, null);
                    alertDialog$Builder.k(gd.M0(2131747638, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    break;
                }
                break;
        }
    }
}
