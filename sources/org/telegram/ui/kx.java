package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class kx extends v31 {
    public boolean P;
    public oy Q;
    public final /* synthetic */ iy R;
    public final /* synthetic */ Context S;
    public final /* synthetic */ py T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(py pyVar, Context context, iy iyVar, Context context2) {
        super(context);
        this.T = pyVar;
        this.R = iyVar;
        this.S = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.J = true;
    }

    @Override // org.telegram.ui.v31
    public final void d(boolean z4) {
        oy oyVar = this.Q;
        oyVar.c.G = true;
        oyVar.d.O(this.Q.a, c());
        oy oyVar2 = this.Q;
        oyVar2.d.D = false;
        oyVar2.D.D = false;
        py pyVar = this.T;
        pyVar.A4(false, true);
        this.Q.a.setClipChildren(true);
        this.Q.a.invalidate();
        this.Q.d.l();
        this.Q.D.l();
        this.Q.a.y1(null, 0.0f, z4);
        pyVar.y = false;
        this.R.requestLayout();
        if (!c()) {
            pyVar.N = true;
            pyVar.O = true;
            View view = pyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        yx yxVar = pyVar.z0;
        if (yxVar != null) {
            yxVar.R();
        }
        pyVar.V4(false, true);
        pyVar.D3();
        pyVar.U4();
    }

    @Override // org.telegram.ui.v31
    public final void e(boolean z4) {
        int i10;
        py pyVar = this.T;
        pyVar.y = true;
        pyVar.B = z4;
        this.R.requestLayout();
        oy oyVar = pyVar.b0[0];
        this.Q = oyVar;
        if (oyVar.C == null) {
            oyVar.C = new ix(this.S, null);
            this.Q.C.setLayoutManager(new jx(this, this.Q));
            oy oyVar2 = this.Q;
            int i11 = this.Q.s;
            int i12 = pyVar.S2;
            boolean z10 = pyVar.i2;
            ArrayList arrayList = pyVar.F2;
            i10 = ((org.telegram.ui.ActionBar.p2) pyVar).currentAccount;
            oyVar2.D = new uf.k(pyVar, this.S, i11, i12, z10, arrayList, i10, pyVar.D);
            oy oyVar3 = this.Q;
            uf.k kVar = oyVar3.D;
            kVar.P = true;
            oyVar3.C.setAdapter(kVar);
            oy oyVar4 = this.Q;
            oyVar4.addView(oyVar4.C);
        }
        if (!z4) {
            pyVar.N = false;
            pyVar.C4(-pyVar.T3());
        }
        this.Q.a.B0();
        oy oyVar5 = this.Q;
        uf.k kVar2 = oyVar5.D;
        kVar2.h = oyVar5.s;
        kVar2.l();
        oy oyVar6 = this.Q;
        oyVar6.d.O(oyVar6.a, false);
        oy oyVar7 = this.Q;
        oyVar7.d.D = true;
        oyVar7.D.D = true;
        oyVar7.c.H = false;
        pyVar.A4(true, true);
        pyVar.c4(this.P);
        this.Q.d.l();
        this.Q.D.l();
        float f10 = !z4 ? pyVar.K : -pyVar.K;
        oy oyVar8 = this.Q;
        oyVar8.a.y1(oyVar8.C, f10, false);
        this.Q.a.setClipChildren(false);
        this.Q.a.B0();
        pyVar.D3();
        pyVar.U4();
    }

    @Override // org.telegram.ui.v31
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        py pyVar = this.T;
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.v31
    public final void setOpenProgress(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ly lyVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z4 = f10 > 0.0f;
        if (this.P != z4) {
            this.P = z4;
        }
        py pyVar = this.T;
        View view = pyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            kVar3.getBackButton().setAlpha(f10 != 1.0f ? 1.0f : 0.0f);
        }
        if (pyVar.S2 != 0 || pyVar.U2 != 0) {
            Paint paint = pyVar.c1;
            int i10 = org.telegram.ui.ActionBar.k6.d6;
            paint.setColor(i0.a.d(f10, pyVar.getThemedColor(i10), pyVar.getThemedColor(i10)));
        }
        oy oyVar = this.Q;
        if (oyVar != null) {
            oyVar.a.setOpenRightFragmentProgress(f10);
        }
        pyVar.C3();
        pyVar.H3();
        pyVar.u3();
        pyVar.E3();
        oy oyVar2 = pyVar.b0[0];
        if (oyVar2 != null && (lyVar = oyVar2.a) != null) {
            lyVar.requestLayout();
        }
        View view2 = pyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
