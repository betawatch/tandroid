package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ep b;

    public /* synthetic */ oo(ep epVar, int i7) {
        this.a = i7;
        this.b = epVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        int i10 = 1;
        ep epVar = this.b;
        switch (i7) {
            case 0:
                ki kiVar = epVar.S1;
                if (kiVar.w2 != kiVar.e2) {
                    epVar.U1.setText(org.telegram.messenger.hd.M0(2131745537, null));
                    ki kiVar2 = epVar.S1;
                    kiVar2.F1(kiVar2.e2);
                    break;
                } else {
                    epVar.U1.setText(org.telegram.messenger.hd.M0(2131752138, null));
                    ki kiVar3 = epVar.S1;
                    if (kiVar3.m2 == null) {
                        Context context = kiVar3.getContext();
                        org.telegram.ui.ActionBar.e6 e6Var = kiVar3.J0;
                        yi yiVar = new yi(context, e6Var, kiVar3);
                        yiVar.r = org.telegram.messenger.g0.L(80.0f);
                        yiVar.x = 3;
                        di.c1 c1Var = new di.c1(yiVar, context, e6Var, 14);
                        yiVar.n = c1Var;
                        ha haVar = new ha(yiVar, context);
                        yiVar.w = haVar;
                        c1Var.setAdapter(haVar);
                        c1Var.setClipToPadding(false);
                        c1Var.setItemAnimator(null);
                        c1Var.setLayoutAnimation(null);
                        c1Var.setVerticalScrollBarEnabled(false);
                        org.telegram.ui.ActionBar.q6.l(c1Var, 21, org.telegram.ui.ActionBar.j6.A5, e6Var);
                        yiVar.addView(c1Var, c8.ja.c(-1.0f, -1));
                        c1Var.setOnScrollListener(new ri(yiVar, i10));
                        gi.g gVar = new gi.g(yiVar, yiVar.r, 2);
                        yiVar.s = gVar;
                        gVar.O = new bi.y1(yiVar, 9);
                        c1Var.setLayoutManager(gVar);
                        kiVar3.m2 = yiVar;
                        yiVar.setDelegate(new oa(kiVar3, 1));
                    }
                    kiVar3.F1(kiVar3.m2);
                    yi yiVar2 = epVar.S1.m2;
                    boolean z10 = epVar.H1;
                    ha haVar2 = yiVar2.w;
                    ((ArrayList) haVar2.e).clear();
                    WallpapersListActivity.E0((ArrayList) haVar2.e, z10);
                    haVar2.f();
                    break;
                }
            case 1:
                if (!epVar.P0()) {
                    epVar.dismiss();
                    break;
                } else {
                    epVar.T0(true);
                    epVar.Z0(true);
                    break;
                }
            case 2:
                if (epVar.N1 == null) {
                    epVar.V0(!epVar.H1);
                    break;
                }
                break;
            default:
                epVar.K0(false);
                break;
        }
    }
}
