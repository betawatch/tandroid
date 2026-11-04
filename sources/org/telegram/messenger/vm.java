package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1 c;

    public /* synthetic */ vm(int i3, Context context, org.telegram.ui.ActionBar.s1 s1Var) {
        this.a = i3;
        this.b = context;
        this.c = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.s1 s1Var = this.c;
                if (!((Activity) this.b).isFinishing()) {
                    try {
                        s1Var.dismiss();
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.s1 s1Var2 = this.c;
                if (!((Activity) this.b).isFinishing()) {
                    try {
                        s1Var2.dismiss();
                        break;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                break;
            default:
                Context context = this.b;
                org.telegram.ui.ActionBar.s1 s1Var3 = this.c;
                try {
                    if (!((Activity) context).isFinishing()) {
                        s1Var3.dismiss();
                        break;
                    }
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                break;
        }
    }
}
