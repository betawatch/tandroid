package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp b;

    public /* synthetic */ vo(lp lpVar, int i7) {
        this.a = i7;
        this.b = lpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        lp lpVar = this.b;
        switch (i7) {
            case 0:
                si siVar = lpVar.S1;
                if (siVar.w2 != siVar.e2) {
                    lpVar.U1.setText(org.telegram.messenger.gd.M0(2131745342, null));
                    si siVar2 = lpVar.S1;
                    siVar2.G1(siVar2.e2);
                    break;
                } else {
                    lpVar.U1.setText(org.telegram.messenger.gd.M0(2131752127, null));
                    si siVar3 = lpVar.S1;
                    if (siVar3.m2 == null) {
                        Context context = siVar3.getContext();
                        org.telegram.ui.ActionBar.i6 i6Var = siVar3.J0;
                        fj fjVar = new fj(context, i6Var, siVar3);
                        fjVar.r = org.telegram.messenger.g0.L(80.0f);
                        fjVar.x = 3;
                        di.b1 b1Var = new di.b1(fjVar, context, i6Var, 14);
                        fjVar.n = b1Var;
                        qa qaVar = new qa(fjVar, context);
                        fjVar.w = qaVar;
                        b1Var.setAdapter(qaVar);
                        b1Var.setClipToPadding(false);
                        b1Var.setItemAnimator(null);
                        b1Var.setLayoutAnimation(null);
                        b1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.u6.l(b1Var, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
                        fjVar.addView(b1Var, c8.ma.c(-1.0f, -1));
                        int i10 = 2;
                        b1Var.setOnScrollListener(new oa(fjVar, i10));
                        gi.g gVar = new gi.g(fjVar, fjVar.r, i10);
                        fjVar.s = gVar;
                        gVar.O = new bi.s2(fjVar, 9);
                        b1Var.setLayoutManager(gVar);
                        siVar3.m2 = fjVar;
                        fjVar.setDelegate(new xa(siVar3, 1));
                    }
                    siVar3.G1(siVar3.m2);
                    fj fjVar2 = lpVar.S1.m2;
                    boolean z10 = lpVar.H1;
                    qa qaVar2 = fjVar2.w;
                    ((ArrayList) qaVar2.e).clear();
                    WallpapersListActivity.E0((ArrayList) qaVar2.e, z10);
                    qaVar2.f();
                    break;
                }
            case 1:
                if (!lpVar.Q0()) {
                    lpVar.dismiss();
                    break;
                } else {
                    lpVar.U0(true);
                    lpVar.a1(true);
                    break;
                }
            case 2:
                if (lpVar.N1 == null) {
                    lpVar.W0(!lpVar.H1);
                    break;
                }
                break;
            default:
                lpVar.L0(false);
                break;
        }
    }
}
