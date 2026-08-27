package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bx extends g31 {
    public boolean N;
    public fy O;
    public final /* synthetic */ yx P;
    public final /* synthetic */ Context Q;
    public final /* synthetic */ gy R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(gy gyVar, Context context, yx yxVar, Context context2) {
        super(context);
        this.R = gyVar;
        this.P = yxVar;
        this.Q = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.I = true;
    }

    @Override // org.telegram.ui.g31
    public final void d(boolean z10) {
        fy fyVar = this.O;
        fyVar.c.G = true;
        fyVar.d.O(this.O.a, c());
        fy fyVar2 = this.O;
        fyVar2.d.C = false;
        fyVar2.C.C = false;
        gy gyVar = this.R;
        gyVar.A4(false, true);
        this.O.a.setClipChildren(true);
        this.O.a.invalidate();
        this.O.d.l();
        this.O.C.l();
        this.O.a.y1(null, 0.0f, z10);
        gyVar.y = false;
        this.P.requestLayout();
        if (!c()) {
            gyVar.M = true;
            gyVar.N = true;
            View view = gyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        px pxVar = gyVar.y0;
        if (pxVar != null) {
            pxVar.R();
        }
        gyVar.V4(false, true);
        gyVar.D3();
        gyVar.U4();
    }

    @Override // org.telegram.ui.g31
    public final void e(boolean z10) {
        int i10;
        gy gyVar = this.R;
        gyVar.y = true;
        gyVar.A = z10;
        this.P.requestLayout();
        fy fyVar = gyVar.a0[0];
        this.O = fyVar;
        if (fyVar.B == null) {
            fyVar.B = new zw(this.Q, null);
            this.O.B.setLayoutManager(new ax(this, this.O));
            fy fyVar2 = this.O;
            int i11 = this.O.s;
            int i12 = gyVar.R2;
            boolean z11 = gyVar.h2;
            ArrayList arrayList = gyVar.E2;
            i10 = ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount;
            fyVar2.C = new pf.k(gyVar, this.Q, i11, i12, z11, arrayList, i10, gyVar.C);
            fy fyVar3 = this.O;
            pf.k kVar = fyVar3.C;
            kVar.O = true;
            fyVar3.B.setAdapter(kVar);
            fy fyVar4 = this.O;
            fyVar4.addView(fyVar4.B);
        }
        if (!z10) {
            gyVar.M = false;
            gyVar.C4(-gyVar.T3());
        }
        this.O.a.B0();
        fy fyVar5 = this.O;
        pf.k kVar2 = fyVar5.C;
        kVar2.h = fyVar5.s;
        kVar2.l();
        fy fyVar6 = this.O;
        fyVar6.d.O(fyVar6.a, false);
        fy fyVar7 = this.O;
        fyVar7.d.C = true;
        fyVar7.C.C = true;
        fyVar7.c.H = false;
        gyVar.A4(true, true);
        gyVar.c4(this.N);
        this.O.d.l();
        this.O.C.l();
        float f10 = !z10 ? gyVar.J : -gyVar.J;
        fy fyVar8 = this.O;
        fyVar8.a.y1(fyVar8.B, f10, false);
        this.O.a.setClipChildren(false);
        this.O.a.B0();
        gyVar.D3();
        gyVar.U4();
    }

    @Override // org.telegram.ui.g31
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        gy gyVar = this.R;
        kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
        if (kVar == null) {
            return false;
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
        return kVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.g31
    public final void setOpenProgress(float f10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cy cyVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        boolean z10 = f10 > 0.0f;
        if (this.N != z10) {
            this.N = z10;
        }
        gy gyVar = this.R;
        View view = gyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.n2) gyVar).actionBar;
            kVar3.getBackButton().setAlpha(f10 != 1.0f ? 1.0f : 0.0f);
        }
        if (gyVar.R2 != 0 || gyVar.T2 != 0) {
            Paint paint = gyVar.b1;
            int i10 = org.telegram.ui.ActionBar.g6.d6;
            paint.setColor(i0.b.d(f10, gyVar.getThemedColor(i10), gyVar.getThemedColor(i10)));
        }
        fy fyVar = this.O;
        if (fyVar != null) {
            fyVar.a.setOpenRightFragmentProgress(f10);
        }
        gyVar.C3();
        gyVar.H3();
        gyVar.u3();
        gyVar.E3();
        fy fyVar2 = gyVar.a0[0];
        if (fyVar2 != null && (cyVar = fyVar2.a) != null) {
            cyVar.requestLayout();
        }
        View view2 = gyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
