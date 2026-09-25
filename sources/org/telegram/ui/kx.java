package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class kx extends d41 {
    public boolean S;
    public py T;
    public final /* synthetic */ jy U;
    public final /* synthetic */ Context V;
    public final /* synthetic */ qy W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(qy qyVar, Context context, jy jyVar, Context context2) {
        super(context);
        this.W = qyVar;
        this.U = jyVar;
        this.V = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override // org.telegram.ui.d41
    public final void d(boolean z10) {
        py pyVar = this.T;
        pyVar.c.G = true;
        pyVar.d.O(this.T.a, c());
        py pyVar2 = this.T;
        pyVar2.d.G = false;
        pyVar2.G.G = false;
        qy qyVar = this.W;
        qyVar.A4(false, true);
        this.T.a.setClipChildren(true);
        this.T.a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.a.y1(null, 0.0f, z10);
        qyVar.y = false;
        this.U.requestLayout();
        if (!c()) {
            qyVar.Q = true;
            qyVar.R = true;
            View view = qyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        zx zxVar = qyVar.C0;
        if (zxVar != null) {
            zxVar.R();
        }
        qyVar.V4(false, true);
        qyVar.D3();
        qyVar.U4();
    }

    @Override // org.telegram.ui.d41
    public final void e(boolean z10) {
        int i10;
        qy qyVar = this.W;
        qyVar.y = true;
        qyVar.E = z10;
        this.U.requestLayout();
        py pyVar = qyVar.e0[0];
        this.T = pyVar;
        if (pyVar.F == null) {
            pyVar.F = new ix(this.V, null);
            this.T.F.setLayoutManager(new jx(this, this.T));
            py pyVar2 = this.T;
            int i11 = this.T.s;
            int i12 = qyVar.V2;
            boolean z11 = qyVar.l2;
            ArrayList arrayList = qyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.m2) qyVar).currentAccount;
            pyVar2.G = new gg.m(qyVar, this.V, i11, i12, z11, arrayList, i10, qyVar.G);
            py pyVar3 = this.T;
            gg.m mVar = pyVar3.G;
            mVar.S = true;
            pyVar3.F.setAdapter(mVar);
            py pyVar4 = this.T;
            pyVar4.addView(pyVar4.F);
        }
        if (!z10) {
            qyVar.Q = false;
            qyVar.C4(-qyVar.T3());
        }
        this.T.a.B0();
        py pyVar5 = this.T;
        gg.m mVar2 = pyVar5.G;
        mVar2.h = pyVar5.s;
        mVar2.l();
        py pyVar6 = this.T;
        pyVar6.d.O(pyVar6.a, false);
        py pyVar7 = this.T;
        pyVar7.d.G = true;
        pyVar7.G.G = true;
        pyVar7.c.H = false;
        qyVar.A4(true, true);
        qyVar.c4(this.S);
        this.T.d.l();
        this.T.G.l();
        float f7 = !z10 ? qyVar.N : -qyVar.N;
        py pyVar8 = this.T;
        pyVar8.a.y1(pyVar8.F, f7, false);
        this.T.a.setClipChildren(false);
        this.T.a.B0();
        qyVar.D3();
        qyVar.U4();
    }

    @Override // org.telegram.ui.d41
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        qy qyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.d41
    public final void setOpenProgress(float f7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        my myVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f7 > 0.0f;
        if (this.S != z10) {
            this.S = z10;
        }
        qy qyVar = this.W;
        View view = qyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            kVar3.getBackButton().setAlpha(f7 != 1.0f ? 1.0f : 0.0f);
        }
        if (qyVar.V2 != 0 || qyVar.X2 != 0) {
            Paint paint = qyVar.f1;
            int i10 = org.telegram.ui.ActionBar.h6.d6;
            paint.setColor(i0.a.d(f7, qyVar.getThemedColor(i10), qyVar.getThemedColor(i10)));
        }
        py pyVar = this.T;
        if (pyVar != null) {
            pyVar.a.setOpenRightFragmentProgress(f7);
        }
        qyVar.C3();
        qyVar.H3();
        qyVar.u3();
        qyVar.E3();
        py pyVar2 = qyVar.e0[0];
        if (pyVar2 != null && (myVar = pyVar2.a) != null) {
            myVar.requestLayout();
        }
        View view2 = qyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
