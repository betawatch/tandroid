package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jx extends t31 {
    public boolean P;
    public ny Q;
    public final /* synthetic */ hy R;
    public final /* synthetic */ Context S;
    public final /* synthetic */ oy T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(oy oyVar, Context context, hy hyVar, Context context2) {
        super(context);
        this.T = oyVar;
        this.R = hyVar;
        this.S = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.J = true;
    }

    @Override // org.telegram.ui.t31
    public final void d(boolean z4) {
        ny nyVar = this.Q;
        nyVar.c.G = true;
        nyVar.d.O(this.Q.a, c());
        ny nyVar2 = this.Q;
        nyVar2.d.D = false;
        nyVar2.D.D = false;
        oy oyVar = this.T;
        oyVar.A4(false, true);
        this.Q.a.setClipChildren(true);
        this.Q.a.invalidate();
        this.Q.d.l();
        this.Q.D.l();
        this.Q.a.y1(null, 0.0f, z4);
        oyVar.y = false;
        this.R.requestLayout();
        if (!c()) {
            oyVar.N = true;
            oyVar.O = true;
            View view = oyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        xx xxVar = oyVar.z0;
        if (xxVar != null) {
            xxVar.R();
        }
        oyVar.V4(false, true);
        oyVar.D3();
        oyVar.U4();
    }

    @Override // org.telegram.ui.t31
    public final void e(boolean z4) {
        int i10;
        oy oyVar = this.T;
        oyVar.y = true;
        oyVar.B = z4;
        this.R.requestLayout();
        ny nyVar = oyVar.b0[0];
        this.Q = nyVar;
        if (nyVar.C == null) {
            nyVar.C = new hx(this.S, null);
            this.Q.C.setLayoutManager(new ix(this, this.Q));
            ny nyVar2 = this.Q;
            int i11 = this.Q.s;
            int i12 = oyVar.S2;
            boolean z10 = oyVar.i2;
            ArrayList arrayList = oyVar.F2;
            i10 = ((org.telegram.ui.ActionBar.p2) oyVar).currentAccount;
            nyVar2.D = new tf.k(oyVar, this.S, i11, i12, z10, arrayList, i10, oyVar.D);
            ny nyVar3 = this.Q;
            tf.k kVar = nyVar3.D;
            kVar.P = true;
            nyVar3.C.setAdapter(kVar);
            ny nyVar4 = this.Q;
            nyVar4.addView(nyVar4.C);
        }
        if (!z4) {
            oyVar.N = false;
            oyVar.C4(-oyVar.T3());
        }
        this.Q.a.B0();
        ny nyVar5 = this.Q;
        tf.k kVar2 = nyVar5.D;
        kVar2.h = nyVar5.s;
        kVar2.l();
        ny nyVar6 = this.Q;
        nyVar6.d.O(nyVar6.a, false);
        ny nyVar7 = this.Q;
        nyVar7.d.D = true;
        nyVar7.D.D = true;
        nyVar7.c.H = false;
        oyVar.A4(true, true);
        oyVar.c4(this.P);
        this.Q.d.l();
        this.Q.D.l();
        float f10 = !z4 ? oyVar.K : -oyVar.K;
        ny nyVar8 = this.Q;
        nyVar8.a.y1(nyVar8.C, f10, false);
        this.Q.a.setClipChildren(false);
        this.Q.a.B0();
        oyVar.D3();
        oyVar.U4();
    }

    @Override // org.telegram.ui.t31
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        oy oyVar = this.T;
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.t31
    public final void setOpenProgress(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ky kyVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z4 = f10 > 0.0f;
        if (this.P != z4) {
            this.P = z4;
        }
        oy oyVar = this.T;
        View view = oyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            kVar3.getBackButton().setAlpha(f10 != 1.0f ? 1.0f : 0.0f);
        }
        if (oyVar.S2 != 0 || oyVar.U2 != 0) {
            Paint paint = oyVar.c1;
            int i10 = org.telegram.ui.ActionBar.j6.d6;
            paint.setColor(i0.a.d(f10, oyVar.getThemedColor(i10), oyVar.getThemedColor(i10)));
        }
        ny nyVar = this.Q;
        if (nyVar != null) {
            nyVar.a.setOpenRightFragmentProgress(f10);
        }
        oyVar.C3();
        oyVar.H3();
        oyVar.u3();
        oyVar.E3();
        ny nyVar2 = oyVar.b0[0];
        if (nyVar2 != null && (kyVar = nyVar2.a) != null) {
            kyVar.requestLayout();
        }
        View view2 = oyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
