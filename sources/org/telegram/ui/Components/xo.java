package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ xo(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        np npVar = this.b;
        switch (i7) {
            case 0:
                ui uiVar = npVar.S1;
                if (uiVar.w2 != uiVar.e2) {
                    npVar.U1.setText(org.telegram.messenger.hd.N0(2131745341, null));
                    ui uiVar2 = npVar.S1;
                    uiVar2.G1(uiVar2.e2);
                    break;
                } else {
                    npVar.U1.setText(org.telegram.messenger.hd.N0(2131752126, null));
                    ui uiVar3 = npVar.S1;
                    if (uiVar3.m2 == null) {
                        Context context = uiVar3.getContext();
                        org.telegram.ui.ActionBar.h6 h6Var = uiVar3.J0;
                        hj hjVar = new hj(context, h6Var, uiVar3);
                        hjVar.r = org.telegram.messenger.g0.L(80.0f);
                        hjVar.x = 3;
                        di.b1 b1Var = new di.b1(hjVar, context, h6Var, 14);
                        hjVar.n = b1Var;
                        qa qaVar = new qa(hjVar, context);
                        hjVar.w = qaVar;
                        b1Var.setAdapter(qaVar);
                        b1Var.setClipToPadding(false);
                        b1Var.setItemAnimator(null);
                        b1Var.setLayoutAnimation(null);
                        b1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.t6.l(b1Var, 21, org.telegram.ui.ActionBar.m6.A5, h6Var);
                        hjVar.addView(b1Var, c8.ma.c(-1.0f, -1));
                        int i10 = 2;
                        b1Var.setOnScrollListener(new oa(hjVar, i10));
                        gi.g gVar = new gi.g(hjVar, hjVar.r, i10);
                        hjVar.s = gVar;
                        gVar.O = new bi.w2(hjVar, 9);
                        b1Var.setLayoutManager(gVar);
                        uiVar3.m2 = hjVar;
                        hjVar.setDelegate(new xa(uiVar3, 1));
                    }
                    uiVar3.G1(uiVar3.m2);
                    hj hjVar2 = npVar.S1.m2;
                    boolean z10 = npVar.H1;
                    qa qaVar2 = hjVar2.w;
                    ((ArrayList) qaVar2.e).clear();
                    WallpapersListActivity.E0((ArrayList) qaVar2.e, z10);
                    qaVar2.f();
                    break;
                }
            case 1:
                if (!npVar.Q0()) {
                    npVar.dismiss();
                    break;
                } else {
                    npVar.U0(true);
                    npVar.a1(true);
                    break;
                }
            case 2:
                if (npVar.N1 == null) {
                    npVar.W0(!npVar.H1);
                    break;
                }
                break;
            default:
                npVar.L0(false);
                break;
        }
    }
}
