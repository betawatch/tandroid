package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ox extends o41 {
    public boolean S;
    public ty T;
    public final /* synthetic */ ny U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ uy W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(uy uyVar, Context context, ny nyVar, Context context2) {
        super(context);
        this.W = uyVar;
        this.U = nyVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override // org.telegram.ui.o41
    public final void d(boolean z10) {
        ty tyVar = this.T;
        tyVar.c.G = true;
        tyVar.d.O(this.T.a, c());
        ty tyVar2 = this.T;
        tyVar2.d.G = false;
        tyVar2.G.G = false;
        uy uyVar = this.W;
        uyVar.A4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.a.x1(null, 0.0f, z10);
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
        ey eyVar = uyVar.C0;
        if (eyVar != null) {
            eyVar.R();
        }
        uyVar.V4(false, true);
        uyVar.D3();
        uyVar.U4();
    }

    @Override // org.telegram.ui.o41
    public final void e(boolean z10) {
        int i10;
        uy uyVar = this.W;
        uyVar.y = true;
        uyVar.E = z10;
        this.U.requestLayout();
        ty tyVar = uyVar.e0[0];
        this.T = tyVar;
        if (tyVar.F == null) {
            tyVar.F = new mx(this.V, null);
            this.T.F.setLayoutManager(new nx(this, this.T));
            ty tyVar2 = this.T;
            int i11 = this.T.s;
            int i12 = uyVar.V2;
            boolean z11 = uyVar.l2;
            ArrayList arrayList = uyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
            tyVar2.G = new hg.m(uyVar, this.V, i11, i12, z11, arrayList, i10, uyVar.G);
            ty tyVar3 = this.T;
            hg.m mVar = tyVar3.G;
            mVar.S = true;
            tyVar3.F.setAdapter(mVar);
            ty tyVar4 = this.T;
            tyVar4.addView(tyVar4.F);
        }
        if (!z10) {
            uyVar.Q = false;
            uyVar.C4(-uyVar.T3());
        }
        this.T.a.B0();
        ty tyVar5 = this.T;
        hg.m mVar2 = tyVar5.G;
        mVar2.h = tyVar5.s;
        mVar2.l();
        ty tyVar6 = this.T;
        tyVar6.d.O(tyVar6.a, false);
        ty tyVar7 = this.T;
        tyVar7.d.G = true;
        tyVar7.G.G = true;
        tyVar7.c.H = false;
        uyVar.A4(true, true);
        uyVar.c4(this.S);
        this.T.d.l();
        this.T.G.l();
        float f7 = !z10 ? uyVar.N : -uyVar.N;
        ty tyVar8 = this.T;
        tyVar8.a.x1(tyVar8.F, f7, false);
        this.T.a.setClipChildren(false);
        this.T.a.B0();
        uyVar.D3();
        uyVar.U4();
    }

    @Override // org.telegram.ui.o41
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

    @Override // org.telegram.ui.o41
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
            int i10 = org.telegram.ui.ActionBar.j6.d6;
            paint.setColor(i0.a.d(f7, uyVar.getThemedColor(i10), uyVar.getThemedColor(i10)));
        }
        ty tyVar = this.T;
        if (tyVar != null) {
            tyVar.a.setOpenRightFragmentProgress(f7);
        }
        uyVar.C3();
        uyVar.H3();
        uyVar.u3();
        uyVar.E3();
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
