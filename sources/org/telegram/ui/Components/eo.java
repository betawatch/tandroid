package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo b;

    public /* synthetic */ eo(vo voVar, int i7) {
        this.a = i7;
        this.b = voVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        vo voVar = this.b;
        switch (i7) {
            case 0:
                ci ciVar = voVar.R1;
                if (ciVar.v2 != ciVar.d2) {
                    voVar.T1.setText(org.telegram.messenger.id.M0(2131745537, null));
                    ci ciVar2 = voVar.R1;
                    ciVar2.F1(ciVar2.d2);
                    break;
                } else {
                    voVar.T1.setText(org.telegram.messenger.id.M0(2131752138, null));
                    ci ciVar3 = voVar.R1;
                    if (ciVar3.l2 == null) {
                        Context context = ciVar3.getContext();
                        org.telegram.ui.ActionBar.h6 h6Var = ciVar3.I0;
                        pi piVar = new pi(context, h6Var, ciVar3);
                        piVar.r = org.telegram.messenger.g0.L(80.0f);
                        piVar.x = 3;
                        bi.q1 q1Var = new bi.q1(piVar, context, h6Var, 14);
                        piVar.n = q1Var;
                        ka kaVar = new ka(piVar, context);
                        piVar.w = kaVar;
                        q1Var.setAdapter(kaVar);
                        q1Var.setClipToPadding(false);
                        q1Var.setItemAnimator(null);
                        q1Var.setLayoutAnimation(null);
                        q1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.t6.l(q1Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
                        piVar.addView(q1Var, c8.ha.c(-1.0f, -1));
                        q1Var.setOnScrollListener(new ai.b(piVar, 29));
                        ei.h hVar = new ei.h(piVar, piVar.r, 2);
                        piVar.s = hVar;
                        hVar.O = new ai.l(piVar, 6);
                        q1Var.setLayoutManager(hVar);
                        ciVar3.l2 = piVar;
                        piVar.setDelegate(new ra(ciVar3, 1));
                    }
                    ciVar3.F1(ciVar3.l2);
                    pi piVar2 = voVar.R1.l2;
                    boolean z9 = voVar.G1;
                    ka kaVar2 = piVar2.w;
                    ((ArrayList) kaVar2.e).clear();
                    WallpapersListActivity.E0((ArrayList) kaVar2.e, z9);
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
                if (voVar.M1 == null) {
                    voVar.V0(!voVar.G1);
                    break;
                }
                break;
            default:
                voVar.K0(false);
                break;
        }
    }
}
