package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ax extends h31 {
    public boolean O;
    public ey P;
    public final /* synthetic */ xx Q;
    public final /* synthetic */ Context R;
    public final /* synthetic */ fy S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(fy fyVar, Context context, xx xxVar, Context context2) {
        super(context);
        this.S = fyVar;
        this.Q = xxVar;
        this.R = context2;
        this.e = 0.0f;
        this.n = new AnimationNotificationsLocker();
        this.I = true;
    }

    @Override // org.telegram.ui.h31
    public final void d(boolean z10) {
        ey eyVar = this.P;
        eyVar.c.G = true;
        eyVar.d.O(this.P.a, c());
        ey eyVar2 = this.P;
        eyVar2.d.C = false;
        eyVar2.C.C = false;
        fy fyVar = this.S;
        fyVar.A4(false, true);
        this.P.a.setClipChildren(true);
        this.P.a.invalidate();
        this.P.d.l();
        this.P.C.l();
        this.P.a.y1(null, 0.0f, z10);
        fyVar.y = false;
        this.Q.requestLayout();
        if (!c()) {
            fyVar.M = true;
            fyVar.N = true;
            View view = fyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        ox oxVar = fyVar.y0;
        if (oxVar != null) {
            oxVar.R();
        }
        fyVar.V4(false, true);
        fyVar.D3();
        fyVar.U4();
    }

    @Override // org.telegram.ui.h31
    public final void e(boolean z10) {
        int i10;
        fy fyVar = this.S;
        fyVar.y = true;
        fyVar.A = z10;
        this.Q.requestLayout();
        ey eyVar = fyVar.a0[0];
        this.P = eyVar;
        if (eyVar.B == null) {
            eyVar.B = new yw(this.R, null);
            this.P.B.setLayoutManager(new zw(this, this.P));
            ey eyVar2 = this.P;
            int i11 = this.P.s;
            int i12 = fyVar.R2;
            boolean z11 = fyVar.h2;
            ArrayList arrayList = fyVar.E2;
            i10 = ((org.telegram.ui.ActionBar.o2) fyVar).currentAccount;
            eyVar2.C = new rf.l(fyVar, this.R, i11, i12, z11, arrayList, i10, fyVar.C);
            ey eyVar3 = this.P;
            rf.l lVar = eyVar3.C;
            lVar.O = true;
            eyVar3.B.setAdapter(lVar);
            ey eyVar4 = this.P;
            eyVar4.addView(eyVar4.B);
        }
        if (!z10) {
            fyVar.M = false;
            fyVar.C4(-fyVar.T3());
        }
        this.P.a.B0();
        ey eyVar5 = this.P;
        rf.l lVar2 = eyVar5.C;
        lVar2.h = eyVar5.s;
        lVar2.l();
        ey eyVar6 = this.P;
        eyVar6.d.O(eyVar6.a, false);
        ey eyVar7 = this.P;
        eyVar7.d.C = true;
        eyVar7.C.C = true;
        eyVar7.c.H = false;
        fyVar.A4(true, true);
        fyVar.c4(this.O);
        this.P.d.l();
        this.P.C.l();
        float f9 = !z10 ? fyVar.J : -fyVar.J;
        ey eyVar8 = this.P;
        eyVar8.a.y1(eyVar8.B, f9, false);
        this.P.a.setClipChildren(false);
        this.P.a.B0();
        fyVar.D3();
        fyVar.U4();
    }

    @Override // org.telegram.ui.h31
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        fy fyVar = this.S;
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        if (lVar == null) {
            return false;
        }
        lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        return lVar2.getOccupyStatusBar();
    }

    @Override // org.telegram.ui.h31
    public final void setOpenProgress(float f9) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        ay ayVar;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        boolean z10 = f9 > 0.0f;
        if (this.O != z10) {
            this.O = z10;
        }
        fy fyVar = this.S;
        View view = fyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        if (lVar.getTitleTextView() != null) {
            lVar4 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            lVar4.getTitleTextView().setAlpha(1.0f - f9);
            lVar5 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            if (lVar5.getTitleTextView().getAlpha() > 0.0f) {
                lVar6 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
                lVar6.getTitleTextView().setVisibility(0);
            }
        }
        lVar2 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
        if (lVar2.getBackButton() != null) {
            lVar3 = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            lVar3.getBackButton().setAlpha(f9 != 1.0f ? 1.0f : 0.0f);
        }
        if (fyVar.R2 != 0 || fyVar.T2 != 0) {
            Paint paint = fyVar.b1;
            int i10 = org.telegram.ui.ActionBar.g6.d6;
            paint.setColor(i0.a.d(f9, fyVar.getThemedColor(i10), fyVar.getThemedColor(i10)));
        }
        ey eyVar = this.P;
        if (eyVar != null) {
            eyVar.a.setOpenRightFragmentProgress(f9);
        }
        fyVar.C3();
        fyVar.H3();
        fyVar.u3();
        fyVar.E3();
        ey eyVar2 = fyVar.a0[0];
        if (eyVar2 != null && (ayVar = eyVar2.a) != null) {
            ayVar.requestLayout();
        }
        View view2 = fyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
