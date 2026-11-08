package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;

    public /* synthetic */ fo(vo voVar, int i7) {
        this.a = i7;
        this.b = voVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        vo voVar = this.b;
        switch (i7) {
            case 0:
                di diVar = voVar.O1;
                if (diVar.s2 != diVar.a2) {
                    voVar.Q1.setText(org.telegram.messenger.id.M0(2131745540, null));
                    di diVar2 = voVar.O1;
                    diVar2.F1(diVar2.a2);
                    break;
                } else {
                    voVar.Q1.setText(org.telegram.messenger.id.M0(2131752138, null));
                    di diVar3 = voVar.O1;
                    if (diVar3.i2 == null) {
                        Context context = diVar3.getContext();
                        org.telegram.ui.ActionBar.f6 f6Var = diVar3.I0;
                        qi qiVar = new qi(context, f6Var, diVar3);
                        qiVar.r = org.telegram.messenger.g0.L(80.0f);
                        qiVar.x = 3;
                        bi.q1 q1Var = new bi.q1(qiVar, context, f6Var, 14);
                        qiVar.n = q1Var;
                        la laVar = new la(qiVar, context);
                        qiVar.w = laVar;
                        q1Var.setAdapter(laVar);
                        q1Var.setClipToPadding(false);
                        q1Var.setItemAnimator(null);
                        q1Var.setLayoutAnimation(null);
                        q1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.r6.m(q1Var, 21, org.telegram.ui.ActionBar.k6.A5, f6Var);
                        qiVar.addView(q1Var, c8.ha.c(-1.0f, -1));
                        q1Var.setOnScrollListener(new ai.b(qiVar, 29));
                        ei.h hVar = new ei.h(qiVar, qiVar.r, 2);
                        qiVar.s = hVar;
                        hVar.O = new ai.l(qiVar, 6);
                        q1Var.setLayoutManager(hVar);
                        diVar3.i2 = qiVar;
                        qiVar.setDelegate(new sa(diVar3, 1));
                    }
                    diVar3.F1(diVar3.i2);
                    qi qiVar2 = voVar.O1.i2;
                    boolean z9 = voVar.D1;
                    la laVar2 = qiVar2.w;
                    ((ArrayList) laVar2.e).clear();
                    WallpapersListActivity.E0((ArrayList) laVar2.e, z9);
                    laVar2.f();
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
                if (voVar.J1 == null) {
                    voVar.V0(!voVar.D1);
                    break;
                }
                break;
            default:
                voVar.K0(false);
                break;
        }
    }
}
