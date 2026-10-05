package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class mx extends d41 {
    public boolean S;
    public ty T;
    public final /* synthetic */ ny U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ uy W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(uy uyVar, Context context, ny nyVar, Context context2) {
        super(context);
        this.W = uyVar;
        this.U = nyVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override // org.telegram.ui.d41
    public final void d(boolean z10) {
        ty tyVar = this.T;
        tyVar.c.G = true;
        tyVar.d.O(this.T.a, c());
        ty tyVar2 = this.T;
        tyVar2.d.G = false;
        tyVar2.G.G = false;
        uy uyVar = this.W;
        uyVar.J4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.a.z1(null, 0.0f, z10);
        uyVar.y = false;
        this.U.requestLayout();
        if (!c()) {
            uyVar.Q = true;
            uyVar.R = true;
            View view = uyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        dy dyVar = uyVar.C0;
        if (dyVar != null) {
            dyVar.T();
        }
        uyVar.e5(false, true);
        uyVar.M3();
        uyVar.d5();
    }

    @Override // org.telegram.ui.d41
    public final void e(boolean z10) {
        li.p pVar;
        int i10;
        uy uyVar = this.W;
        uyVar.y = true;
        uyVar.E = z10;
        this.U.requestLayout();
        ty tyVar = uyVar.e0[0];
        this.T = tyVar;
        if (tyVar.F == null) {
            tyVar.F = new kx(this.V, null);
            pVar = ((org.telegram.ui.ActionBar.n2) uyVar).glassEngine;
            pVar.b(this.T.F);
            this.T.F.setLayoutManager(new lx(this, this.T));
            ty tyVar2 = this.T;
            int i11 = this.T.s;
            int i12 = uyVar.V2;
            boolean z11 = uyVar.l2;
            ArrayList arrayList = uyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            tyVar2.G = new gg.m(uyVar, this.V, i11, i12, z11, arrayList, i10, uyVar.G);
            ty tyVar3 = this.T;
            gg.m mVar = tyVar3.G;
            mVar.S = true;
            tyVar3.F.setAdapter(mVar);
            ty tyVar4 = this.T;
            tyVar4.addView(tyVar4.F);
        }
        if (!z10) {
            uyVar.Q = false;
            uyVar.L4(-uyVar.c4());
        }
        this.T.a.C0();
        ty tyVar5 = this.T;
        gg.m mVar2 = tyVar5.G;
        mVar2.h = tyVar5.s;
        mVar2.l();
        ty tyVar6 = this.T;
        tyVar6.d.O(tyVar6.a, false);
        ty tyVar7 = this.T;
        tyVar7.d.G = true;
        tyVar7.G.G = true;
        tyVar7.c.H = false;
        uyVar.J4(true, true);
        uyVar.l4(this.S);
        this.T.d.l();
        this.T.G.l();
        float f7 = !z10 ? uyVar.N : -uyVar.N;
        ty tyVar8 = this.T;
        tyVar8.a.z1(tyVar8.F, f7, false);
        this.T.a.setClipChildren(false);
        this.T.a.C0();
        uyVar.M3();
        uyVar.d5();
    }

    @Override // org.telegram.ui.d41
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uy uyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.d41
    public final void setOpenProgress(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qy qyVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f7 > 0.0f;
        if (this.S != z10) {
            this.S = z10;
        }
        uy uyVar = this.W;
        View view = uyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            kVar3.getBackButton().setAlpha(f7 != 1.0f ? 1.0f : 0.0f);
        }
        if (uyVar.V2 != 0 || uyVar.X2 != 0) {
            Paint paint = uyVar.f1;
            int i10 = org.telegram.ui.ActionBar.i6.d6;
            paint.setColor(i0.a.d(f7, uyVar.getThemedColor(i10), uyVar.getThemedColor(i10)));
        }
        ty tyVar = this.T;
        if (tyVar != null) {
            tyVar.a.setOpenRightFragmentProgress(f7);
        }
        uyVar.L3();
        uyVar.Q3();
        uyVar.D3();
        uyVar.N3();
        ty tyVar2 = uyVar.e0[0];
        if (tyVar2 != null && (qyVar = tyVar2.a) != null) {
            qyVar.requestLayout();
        }
        View view2 = uyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
