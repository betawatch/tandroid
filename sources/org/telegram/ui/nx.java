package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nx extends l41 {
    public boolean S;
    public sy T;
    public final /* synthetic */ my U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ ty W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(ty tyVar, Context context, my myVar, Context context2) {
        super(context);
        this.W = tyVar;
        this.U = myVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override // org.telegram.ui.l41
    public final void d(boolean z10) {
        sy syVar = this.T;
        syVar.c.G = true;
        syVar.d.O(this.T.a, c());
        sy syVar2 = this.T;
        syVar2.d.G = false;
        syVar2.G.G = false;
        ty tyVar = this.W;
        tyVar.x4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.a.z1(null, 0.0f, z10);
        tyVar.y = false;
        this.U.requestLayout();
        if (!c()) {
            tyVar.Q = true;
            tyVar.R = true;
            View view = tyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        dy dyVar = tyVar.C0;
        if (dyVar != null) {
            dyVar.R();
        }
        tyVar.S4(false, true);
        tyVar.A3();
        tyVar.R4();
    }

    @Override // org.telegram.ui.l41
    public final void e(boolean z10) {
        int i10;
        ty tyVar = this.W;
        tyVar.y = true;
        tyVar.E = z10;
        this.U.requestLayout();
        sy syVar = tyVar.e0[0];
        this.T = syVar;
        if (syVar.F == null) {
            syVar.F = new lx(this.V, null);
            this.T.F.setLayoutManager(new mx(this, this.T));
            sy syVar2 = this.T;
            int i11 = this.T.s;
            int i12 = tyVar.V2;
            boolean z11 = tyVar.l2;
            ArrayList arrayList = tyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
            syVar2.G = new gg.m(tyVar, this.V, i11, i12, z11, arrayList, i10, tyVar.G);
            sy syVar3 = this.T;
            gg.m mVar = syVar3.G;
            mVar.S = true;
            syVar3.F.setAdapter(mVar);
            sy syVar4 = this.T;
            syVar4.addView(syVar4.F);
        }
        if (!z10) {
            tyVar.Q = false;
            tyVar.z4(-tyVar.Q3());
        }
        this.T.a.B0();
        sy syVar5 = this.T;
        gg.m mVar2 = syVar5.G;
        mVar2.h = syVar5.s;
        mVar2.l();
        sy syVar6 = this.T;
        syVar6.d.O(syVar6.a, false);
        sy syVar7 = this.T;
        syVar7.d.G = true;
        syVar7.G.G = true;
        syVar7.c.H = false;
        tyVar.x4(true, true);
        tyVar.Z3(this.S);
        this.T.d.l();
        this.T.G.l();
        float f7 = !z10 ? tyVar.N : -tyVar.N;
        sy syVar8 = this.T;
        syVar8.a.z1(syVar8.F, f7, false);
        this.T.a.setClipChildren(false);
        this.T.a.B0();
        tyVar.A3();
        tyVar.R4();
    }

    @Override // org.telegram.ui.l41
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ty tyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.l41
    public final void setOpenProgress(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        py pyVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f7 > 0.0f;
        if (this.S != z10) {
            this.S = z10;
        }
        ty tyVar = this.W;
        View view = tyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            kVar3.getBackButton().setAlpha(f7 != 1.0f ? 1.0f : 0.0f);
        }
        if (tyVar.V2 != 0 || tyVar.X2 != 0) {
            Paint paint = tyVar.f1;
            int i10 = org.telegram.ui.ActionBar.i6.d6;
            paint.setColor(i0.a.d(f7, tyVar.getThemedColor(i10), tyVar.getThemedColor(i10)));
        }
        sy syVar = this.T;
        if (syVar != null) {
            syVar.a.setOpenRightFragmentProgress(f7);
        }
        tyVar.z3();
        tyVar.E3();
        tyVar.r3();
        tyVar.B3();
        sy syVar2 = tyVar.e0[0];
        if (syVar2 != null && (pyVar = syVar2.a) != null) {
            pyVar.requestLayout();
        }
        View view2 = tyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
