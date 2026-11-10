package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class fn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 c;

    public /* synthetic */ fn(int i7, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        this.a = i7;
        this.b = context;
        this.c = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.u1 u1Var = this.c;
                if (!((Activity) this.b).isFinishing()) {
                    try {
                        u1Var.dismiss();
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.u1 u1Var2 = this.c;
                if (!((Activity) this.b).isFinishing()) {
                    try {
                        u1Var2.dismiss();
                        break;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                break;
            default:
                Context context = this.b;
                org.telegram.ui.ActionBar.u1 u1Var3 = this.c;
                try {
                    if (!((Activity) context).isFinishing()) {
                        u1Var3.dismiss();
                        break;
                    }
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                break;
        }
    }
}
