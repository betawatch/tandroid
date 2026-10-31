package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ d1(int i10, Context context, org.telegram.ui.ActionBar.x1 x1Var) {
        this.a = i10;
        this.b = x1Var;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Context context = this.c;
        org.telegram.ui.ActionBar.x1 x1Var = this.b;
        switch (i10) {
            case 0:
                if (x1Var != null) {
                    x1Var.dismiss();
                }
                gf.f.r(context, org.telegram.messenger.cd.L0(2131752895, null));
                break;
            default:
                if (x1Var != null) {
                    x1Var.dismiss();
                }
                gf.f.r(context, org.telegram.messenger.cd.L0(2131752895, null));
                break;
        }
    }
}
