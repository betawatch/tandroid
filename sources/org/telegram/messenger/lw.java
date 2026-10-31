package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class lw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ow b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 d;

    public /* synthetic */ lw(ow owVar, Context context, org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.a = i10;
        this.b = owVar;
        this.c = context;
        this.d = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.x1 x1Var = this.d;
        Context context = this.c;
        ow owVar = this.b;
        switch (i10) {
            case 0:
                owVar.n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        x1Var.dismiss();
                        break;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                break;
            default:
                if (!((Activity) context).isFinishing()) {
                    owVar.n = false;
                    try {
                        x1Var.dismiss();
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String L0 = cd.L0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                    x1Var2.R = L0;
                    x1Var2.T = cd.L0(2131751750, null);
                    alertDialog$Builder.k(cd.L0(2131747847, null), null);
                    alertDialog$Builder.p().setCanceledOnTouchOutside(true);
                    break;
                }
                break;
        }
    }
}
