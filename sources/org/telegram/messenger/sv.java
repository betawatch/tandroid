package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class sv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vv b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1 d;

    public /* synthetic */ sv(vv vvVar, Context context, org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.a = i3;
        this.b = vvVar;
        this.c = context;
        this.d = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        org.telegram.ui.ActionBar.s1 s1Var = this.d;
        Context context = this.c;
        vv vvVar = this.b;
        switch (i3) {
            case 0:
                vvVar.n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        s1Var.dismiss();
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                if (!((Activity) context).isFinishing()) {
                    vvVar.n = false;
                    try {
                        s1Var.dismiss();
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = bd.M0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.a;
                    s1Var2.S = M0;
                    s1Var2.U = bd.M0(2131751750, null);
                    alertDialog$Builder.k(bd.M0(2131747839, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    break;
                }
                break;
        }
    }
}
