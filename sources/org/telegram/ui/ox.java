package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ox extends org.telegram.ui.Components.tn0 {
    public final jf.b0 U0;
    public final jf.b0 V0;
    public final /* synthetic */ fy W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(fy fyVar, Activity activity, fy fyVar2, int i10, int i11, int i12, long j10, kx kxVar) {
        super(activity, fyVar2, i10, i11, i12, j10, kxVar);
        this.W0 = fyVar;
        this.U0 = new jf.b0(2);
        this.V0 = new jf.b0(8);
    }

    public final void S(int i10, int i11) {
        fy fyVar;
        lg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = (fyVar = this.W0).h4) == null) {
            return;
        }
        eVar.f(i10, i11);
        fyVar.m3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        super.dispatchDraw(canvas);
        fy fyVar = this.W0;
        if (fyVar.W != null || fyVar.T2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            lVar = ((org.telegram.ui.ActionBar.o2) fyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(fyVar.a) + lVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (fyVar.T2 != 0 ? dp : 0);
            org.telegram.ui.Components.fs fsVar = fyVar.F1;
            int c3 = dp2 + (fsVar != null ? (int) fsVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int l1 = org.telegram.ui.ActionBar.g6.l1(0.7f, fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            jf.b0 b0Var = this.U0;
            b0Var.b(l1);
            b0Var.c(c3, 0);
            b0Var.setBounds(0, 0, getMeasuredWidth(), c3 + dp);
            b0Var.draw(canvas);
        }
        if (fyVar.c4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.g6.l1(0.9f, fyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            jf.b0 b0Var2 = this.V0;
            b0Var2.b(l12);
            b0Var2.setBounds(0, getMeasuredHeight() - fyVar.c4, getMeasuredWidth(), getMeasuredHeight());
            b0Var2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f9) {
        super.setAlpha(f9);
        this.W0.m3();
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        p31 p31Var = this.W0.V;
        if (p31Var != null) {
            p31Var.setTranslationY(f9);
        }
    }

    @Override // org.telegram.ui.Components.z71
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            fy fyVar = this.W0;
            if (fyVar.h4 != null) {
                fyVar.m3();
            }
        }
    }

    @Override // org.telegram.ui.Components.z71
    public final void x(int i10) {
        org.telegram.ui.Components.sn0 sn0Var = this.P;
        this.W0.c5(sn0Var != null && sn0Var.h(i10) == 2);
    }
}
