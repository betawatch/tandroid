package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class wm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 c;

    public /* synthetic */ wm(int i7, Context context, org.telegram.ui.ActionBar.t1 t1Var) {
        this.a = i7;
        this.b = context;
        this.c = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.t1 t1Var = this.c;
                if (!((Activity) this.b).isFinishing()) {
                    try {
                        t1Var.dismiss();
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.t1 t1Var2 = this.c;
                if (!((Activity) this.b).isFinishing()) {
                    try {
                        t1Var2.dismiss();
                        break;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                break;
            default:
                Context context = this.b;
                org.telegram.ui.ActionBar.t1 t1Var3 = this.c;
                try {
                    if (!((Activity) context).isFinishing()) {
                        t1Var3.dismiss();
                        break;
                    }
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                break;
        }
    }
}
