package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class lx extends e41 {
    public boolean S;
    public qy T;
    public final /* synthetic */ ky U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ ry W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(ry ryVar, Context context, ky kyVar, Context context2) {
        super(context);
        this.W = ryVar;
        this.U = kyVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override // org.telegram.ui.e41
    public final void d(boolean z10) {
        qy qyVar = this.T;
        qyVar.c.G = true;
        qyVar.d.O(this.T.a, c());
        qy qyVar2 = this.T;
        qyVar2.d.G = false;
        qyVar2.G.G = false;
        ry ryVar = this.W;
        ryVar.A4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.a.y1(null, 0.0f, z10);
        ryVar.y = false;
        this.U.requestLayout();
        if (!c()) {
            ryVar.Q = true;
            ryVar.R = true;
            View view = ryVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        ay ayVar = ryVar.C0;
        if (ayVar != null) {
            ayVar.R();
        }
        ryVar.V4(false, true);
        ryVar.D3();
        ryVar.U4();
    }

    @Override // org.telegram.ui.e41
    public final void e(boolean z10) {
        int i10;
        ry ryVar = this.W;
        ryVar.y = true;
        ryVar.E = z10;
        this.U.requestLayout();
        qy qyVar = ryVar.e0[0];
        this.T = qyVar;
        if (qyVar.F == null) {
            qyVar.F = new jx(this.V, null);
            this.T.F.setLayoutManager(new kx(this, this.T));
            qy qyVar2 = this.T;
            int i11 = this.T.s;
            int i12 = ryVar.V2;
            boolean z11 = ryVar.l2;
            ArrayList arrayList = ryVar.I2;
            i10 = ((org.telegram.ui.ActionBar.n2) ryVar).currentAccount;
            qyVar2.G = new gg.m(ryVar, this.V, i11, i12, z11, arrayList, i10, ryVar.G);
            qy qyVar3 = this.T;
            gg.m mVar = qyVar3.G;
            mVar.S = true;
            qyVar3.F.setAdapter(mVar);
            qy qyVar4 = this.T;
            qyVar4.addView(qyVar4.F);
        }
        if (!z10) {
            ryVar.Q = false;
            ryVar.C4(-ryVar.T3());
        }
        this.T.a.B0();
        qy qyVar5 = this.T;
        gg.m mVar2 = qyVar5.G;
        mVar2.h = qyVar5.s;
        mVar2.l();
        qy qyVar6 = this.T;
        qyVar6.d.O(qyVar6.a, false);
        qy qyVar7 = this.T;
        qyVar7.d.G = true;
        qyVar7.G.G = true;
        qyVar7.c.H = false;
        ryVar.A4(true, true);
        ryVar.c4(this.S);
        this.T.d.l();
        this.T.G.l();
        float f7 = !z10 ? ryVar.N : -ryVar.N;
        qy qyVar8 = this.T;
        qyVar8.a.y1(qyVar8.F, f7, false);
        this.T.a.setClipChildren(false);
        this.T.a.B0();
        ryVar.D3();
        ryVar.U4();
    }

    @Override // org.telegram.ui.e41
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ry ryVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.e41
    public final void setOpenProgress(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ny nyVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f7 > 0.0f;
        if (this.S != z10) {
            this.S = z10;
        }
        ry ryVar = this.W;
        View view = ryVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
            kVar3.getBackButton().setAlpha(f7 != 1.0f ? 1.0f : 0.0f);
        }
        if (ryVar.V2 != 0 || ryVar.X2 != 0) {
            Paint paint = ryVar.f1;
            int i10 = org.telegram.ui.ActionBar.h6.d6;
            paint.setColor(i0.a.d(f7, ryVar.getThemedColor(i10), ryVar.getThemedColor(i10)));
        }
        qy qyVar = this.T;
        if (qyVar != null) {
            qyVar.a.setOpenRightFragmentProgress(f7);
        }
        ryVar.C3();
        ryVar.H3();
        ryVar.u3();
        ryVar.E3();
        qy qyVar2 = ryVar.e0[0];
        if (qyVar2 != null && (nyVar = qyVar2.a) != null) {
            nyVar.requestLayout();
        }
        View view2 = ryVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
