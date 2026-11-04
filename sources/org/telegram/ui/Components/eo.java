package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;

    public /* synthetic */ eo(vo voVar, int i3) {
        this.a = i3;
        this.b = voVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        int i10 = 1;
        vo voVar = this.b;
        switch (i3) {
            case 0:
                bi biVar = voVar.P1;
                if (biVar.t2 != biVar.b2) {
                    voVar.R1.setText(org.telegram.messenger.bd.M0(2131745547, null));
                    bi biVar2 = voVar.P1;
                    biVar2.F1(biVar2.b2);
                    break;
                } else {
                    voVar.R1.setText(org.telegram.messenger.bd.M0(2131752138, null));
                    bi biVar3 = voVar.P1;
                    if (biVar3.j2 == null) {
                        Context context = biVar3.getContext();
                        org.telegram.ui.ActionBar.e6 e6Var = biVar3.J0;
                        qi qiVar = new qi(context, e6Var, biVar3);
                        qiVar.r = org.telegram.messenger.g0.L(80.0f);
                        qiVar.x = 3;
                        ci.j1 j1Var = new ci.j1(qiVar, context, e6Var, 14);
                        qiVar.n = j1Var;
                        ka kaVar = new ka(qiVar, context);
                        qiVar.w = kaVar;
                        j1Var.setAdapter(kaVar);
                        j1Var.setClipToPadding(false);
                        j1Var.setItemAnimator(null);
                        j1Var.setLayoutAnimation(null);
                        j1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.r6.m(j1Var, 21, org.telegram.ui.ActionBar.k6.A5, e6Var);
                        qiVar.addView(j1Var, b8.mf.c(-1.0f, -1));
                        j1Var.setOnScrollListener(new ji(qiVar, i10));
                        fi.g gVar = new fi.g(qiVar, qiVar.r, 2);
                        qiVar.s = gVar;
                        gVar.O = new ai.g2(qiVar, 9);
                        j1Var.setLayoutManager(gVar);
                        biVar3.j2 = qiVar;
                        qiVar.setDelegate(new ra(biVar3, 1));
                    }
                    biVar3.F1(biVar3.j2);
                    qi qiVar2 = voVar.P1.j2;
                    boolean z10 = voVar.E1;
                    ka kaVar2 = qiVar2.w;
                    ((ArrayList) kaVar2.e).clear();
                    WallpapersListActivity.E0((ArrayList) kaVar2.e, z10);
                    kaVar2.f();
                    break;
                }
            case 1:
                if (!voVar.P0()) {
                    voVar.dismiss();
                    break;
                } else {
                    voVar.T0(true);
                    voVar.Z0(true);
                    break;
                }
            case 2:
                if (voVar.K1 == null) {
                    voVar.V0(!voVar.E1);
                    break;
                }
                break;
            default:
                voVar.K0(false);
                break;
        }
    }
}
