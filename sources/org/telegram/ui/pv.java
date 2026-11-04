package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pv extends my0 {
    public boolean T;
    public tw U;
    public final /* synthetic */ mw V;
    public final /* synthetic */ Context W;
    public final /* synthetic */ uw a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(uw uwVar, Context context, mw mwVar, Context context2) {
        super(context);
        this.a0 = uwVar;
        this.V = mwVar;
        this.W = context2;
        this.e = 0.0f;
        this.n = new g2.g((int[]) null);
        this.N = true;
    }

    @Override // org.telegram.ui.my0
    public final void d(boolean z10) {
        tw twVar = this.U;
        twVar.c.G = true;
        twVar.d.P(this.U.a, c());
        tw twVar2 = this.U;
        twVar2.d.H = false;
        twVar2.H.H = false;
        uw uwVar = this.a0;
        uwVar.M4(false, true);
        this.U.a.setClipChildren(true);
        this.U.a.invalidate();
        this.U.d.f();
        this.U.H.f();
        this.U.a.B1(null, 0.0f, z10);
        uwVar.E = false;
        this.V.requestLayout();
        if (!c()) {
            uwVar.R = true;
            if (uwVar.O != 0.0f) {
                uwVar.S = true;
            }
            View view = uwVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        cw cwVar = uwVar.D0;
        if (cwVar != null) {
            cwVar.S();
        }
        uwVar.i5(false, true);
        uwVar.P3();
        uwVar.g5();
    }

    @Override // org.telegram.ui.my0
    public final void e(boolean z10) {
        pi.q qVar;
        int i3;
        uw uwVar = this.a0;
        uwVar.E = true;
        uwVar.F = z10;
        this.V.requestLayout();
        tw twVar = uwVar.f0[0];
        this.U = twVar;
        if (twVar.G == null) {
            twVar.G = new nv(this.W, null);
            qVar = ((org.telegram.ui.ActionBar.d2) uwVar).glassEngine;
            qVar.b(this.U.G);
            this.U.G.setLayoutManager(new ov(this, this.U));
            tw twVar2 = this.U;
            int i10 = this.U.s;
            int i11 = uwVar.X2;
            boolean z11 = uwVar.m2;
            ArrayList arrayList = uwVar.J2;
            i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
            twVar2.H = new kg.m(uwVar, this.W, i10, i11, z11, arrayList, i3, uwVar.H);
            tw twVar3 = this.U;
            kg.m mVar = twVar3.H;
            mVar.T = true;
            twVar3.G.setAdapter(mVar);
            tw twVar4 = this.U;
            twVar4.addView(twVar4.G);
        }
        if (!z10) {
            uwVar.R = false;
            u4.d1 L = this.U.a.L((uwVar.l4() && this.U.s == 0) ? 1 : 0, false);
            uwVar.O4((L == null || L.a.getTop() < this.U.a.getPaddingTop()) ? -uwVar.f4() : 0.0f);
        }
        this.U.a.C0();
        tw twVar5 = this.U;
        kg.m mVar2 = twVar5.H;
        mVar2.h = twVar5.s;
        mVar2.f();
        tw twVar6 = this.U;
        twVar6.d.P(twVar6.a, false);
        tw twVar7 = this.U;
        twVar7.d.H = true;
        twVar7.H.H = true;
        twVar7.c.H = false;
        uwVar.M4(true, true);
        uwVar.o4(this.T);
        this.U.d.f();
        this.U.H.f();
        float f10 = !z10 ? uwVar.O : -uwVar.O;
        tw twVar8 = this.U;
        twVar8.a.B1(twVar8.G, f10, false);
        this.U.a.setClipChildren(false);
        this.U.a.C0();
        uwVar.P3();
        uwVar.g5();
    }

    @Override // org.telegram.ui.my0
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uw uwVar = this.a0;
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.my0
    public final void setOpenProgress(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        pw pwVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f10 > 0.0f;
        if (this.T != z10) {
            this.T = z10;
        }
        uw uwVar = this.a0;
        View view = uwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            kVar3.getBackButton().setAlpha(f10 != 1.0f ? 1.0f : 0.0f);
        }
        if (uwVar.X2 != 0 || uwVar.Z2 != 0) {
            Paint paint = uwVar.g1;
            int i3 = org.telegram.ui.ActionBar.k6.d6;
            paint.setColor(i0.a.f(f10, uwVar.getThemedColor(i3), uwVar.getThemedColor(i3)));
        }
        tw twVar = this.U;
        if (twVar != null) {
            twVar.a.setOpenRightFragmentProgress(f10);
        }
        uwVar.O3();
        uwVar.T3();
        uwVar.G3();
        uwVar.Q3();
        tw twVar2 = uwVar.f0[0];
        if (twVar2 != null && (pwVar = twVar2.a) != null) {
            pwVar.requestLayout();
        }
        View view2 = uwVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
