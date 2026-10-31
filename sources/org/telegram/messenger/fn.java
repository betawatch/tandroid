package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class fn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 c;

    public /* synthetic */ fn(int i10, Context context, org.telegram.ui.ActionBar.x1 x1Var) {
        this.a = i10;
        this.b = context;
        this.c = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.x1 x1Var = this.c;
                if (!((Activity) this.b).isFinishing()) {
                    try {
                        x1Var.dismiss();
                        break;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.x1 x1Var2 = this.c;
                if (!((Activity) this.b).isFinishing()) {
                    try {
                        x1Var2.dismiss();
                        break;
                    } catch (Exception e7) {
                        f8.g(e7, true);
                        return;
                    }
                }
                break;
            default:
                Context context = this.b;
                org.telegram.ui.ActionBar.x1 x1Var3 = this.c;
                try {
                    if (!((Activity) context).isFinishing()) {
                        x1Var3.dismiss();
                        break;
                    }
                } catch (Exception e10) {
                    f8.g(e10, true);
                }
                break;
        }
    }
}
