package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ uo(kp kpVar, int i7) {
        this.a = i7;
        this.b = kpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        kp kpVar = this.b;
        switch (i7) {
            case 0:
                ti tiVar = kpVar.S1;
                if (tiVar.w2 != tiVar.e2) {
                    kpVar.U1.setText(org.telegram.messenger.gd.N0(2131745341, null));
                    ti tiVar2 = kpVar.S1;
                    tiVar2.G1(tiVar2.e2);
                    break;
                } else {
                    kpVar.U1.setText(org.telegram.messenger.gd.N0(2131752126, null));
                    ti tiVar3 = kpVar.S1;
                    if (tiVar3.m2 == null) {
                        Context context = tiVar3.getContext();
                        org.telegram.ui.ActionBar.i6 i6Var = tiVar3.J0;
                        gj gjVar = new gj(context, i6Var, tiVar3);
                        gjVar.r = org.telegram.messenger.g0.L(80.0f);
                        gjVar.x = 3;
                        di.b1 b1Var = new di.b1(gjVar, context, i6Var, 14);
                        gjVar.n = b1Var;
                        pa paVar = new pa(gjVar, context);
                        gjVar.w = paVar;
                        b1Var.setAdapter(paVar);
                        b1Var.setClipToPadding(false);
                        b1Var.setItemAnimator(null);
                        b1Var.setLayoutAnimation(null);
                        b1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.u6.l(b1Var, 21, org.telegram.ui.ActionBar.n6.A5, i6Var);
                        gjVar.addView(b1Var, c8.na.c(-1.0f, -1));
                        int i10 = 2;
                        b1Var.setOnScrollListener(new na(gjVar, i10));
                        gi.g gVar = new gi.g(gjVar, gjVar.r, i10);
                        gjVar.s = gVar;
                        gVar.O = new bi.y2(gjVar, 9);
                        b1Var.setLayoutManager(gVar);
                        tiVar3.m2 = gjVar;
                        gjVar.setDelegate(new wa(tiVar3, 1));
                    }
                    tiVar3.G1(tiVar3.m2);
                    gj gjVar2 = kpVar.S1.m2;
                    boolean z10 = kpVar.H1;
                    pa paVar2 = gjVar2.w;
                    ((ArrayList) paVar2.e).clear();
                    WallpapersListActivity.E0((ArrayList) paVar2.e, z10);
                    paVar2.f();
                    break;
                }
            case 1:
                if (!kpVar.Q0()) {
                    kpVar.dismiss();
                    break;
                } else {
                    kpVar.U0(true);
                    kpVar.a1(true);
                    break;
                }
            case 2:
                if (kpVar.N1 == null) {
                    kpVar.W0(!kpVar.H1);
                    break;
                }
                break;
            default:
                kpVar.L0(false);
                break;
        }
    }
}
