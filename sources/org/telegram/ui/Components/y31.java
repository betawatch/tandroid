package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ y31(Context context, org.telegram.ui.ActionBar.z2[] z2VarArr) {
        this.a = 3;
        this.c = context;
        this.b = z2VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.z2 z2Var;
        org.telegram.ui.ActionBar.k2 k2Var;
        int i10 = this.a;
        org.telegram.ui.ActionBar.z2[] z2VarArr = this.b;
        Context context = this.c;
        switch (i10) {
            case 0:
                z2VarArr[0].dismiss();
                gf.f.r(context, org.telegram.messenger.cd.L0(2131752035, null));
                break;
            case 1:
                z2VarArr[0].dismiss();
                gf.f.t(context, org.telegram.messenger.cd.L0(2131752030, null));
                break;
            case 2:
                z2VarArr[0].dismiss();
                gf.f.r(context, org.telegram.messenger.cd.L0(2131752027, null));
                break;
            default:
                jv0 jv0Var = new jv0(context);
                if (!org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.u1(z2VarArr[0].f1) && (z2Var = z2VarArr[0]) != null && (k2Var = z2Var.f1) != null) {
                    jv0Var.a0(k2Var);
                }
                jv0Var.show();
                break;
        }
    }

    public /* synthetic */ y31(org.telegram.ui.ActionBar.z2[] z2VarArr, Context context, int i10) {
        this.a = i10;
        this.b = z2VarArr;
        this.c = context;
    }
}
