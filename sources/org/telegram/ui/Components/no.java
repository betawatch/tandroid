package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp b;

    public /* synthetic */ no(dp dpVar, int i10) {
        this.a = i10;
        this.b = dpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        int i11 = 0;
        dp dpVar = this.b;
        switch (i10) {
            case 0:
                bi biVar = dpVar.O1;
                if (biVar.s2 != biVar.a2) {
                    dpVar.Q1.setText(org.telegram.messenger.cd.L0(2131745554, null));
                    bi biVar2 = dpVar.O1;
                    biVar2.E1(biVar2.a2);
                    break;
                } else {
                    dpVar.Q1.setText(org.telegram.messenger.cd.L0(2131752138, null));
                    bi biVar3 = dpVar.O1;
                    if (biVar3.i2 == null) {
                        Context context = biVar3.getContext();
                        org.telegram.ui.ActionBar.p6 p6Var = biVar3.I0;
                        qi qiVar = new qi(context, p6Var, biVar3);
                        qiVar.r = org.telegram.messenger.i0.L(80.0f);
                        qiVar.x = 3;
                        ag.b1 b1Var = new ag.b1(qiVar, context, p6Var, 9);
                        qiVar.n = b1Var;
                        fa faVar = new fa(qiVar, context);
                        qiVar.w = faVar;
                        b1Var.setAdapter(faVar);
                        b1Var.setClipToPadding(false);
                        b1Var.setItemAnimator(null);
                        b1Var.setLayoutAnimation(null);
                        b1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.a7.m(b1Var, 21, org.telegram.ui.ActionBar.t6.A5, p6Var);
                        qiVar.addView(b1Var, w7.b6.c(-1.0f, -1));
                        b1Var.setOnScrollListener(new ag.u(qiVar, 14));
                        oi oiVar = new oi(qiVar, qiVar.r, i11);
                        qiVar.s = oiVar;
                        oiVar.O = new jg.h1(qiVar, 2);
                        b1Var.setLayoutManager(oiVar);
                        biVar3.i2 = qiVar;
                        qiVar.setDelegate(new ma(biVar3, 1));
                    }
                    biVar3.E1(biVar3.i2);
                    qi qiVar2 = dpVar.O1.i2;
                    boolean z10 = dpVar.D1;
                    fa faVar2 = qiVar2.w;
                    ((ArrayList) faVar2.e).clear();
                    WallpapersListActivity.D0((ArrayList) faVar2.e, z10);
                    faVar2.f();
                    break;
                }
            case 1:
                if (!dpVar.P0()) {
                    dpVar.dismiss();
                    break;
                } else {
                    dpVar.T0(true);
                    dpVar.Z0(true);
                    break;
                }
            case 2:
                if (dpVar.J1 == null) {
                    dpVar.V0(!dpVar.D1);
                    break;
                }
                break;
            default:
                dpVar.K0(false);
                break;
        }
    }
}
