package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gy extends org.telegram.ui.Components.ho0 {
    public final xf.z Y0;
    public final xf.z Z0;
    public final /* synthetic */ wy a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(wy wyVar, Activity activity, wy wyVar2, int i10, int i11, int i12, long j3, cy cyVar) {
        super(activity, wyVar2, i10, i11, i12, j3, cyVar);
        this.a1 = wyVar;
        this.Y0 = new xf.z(2);
        this.Z0 = new xf.z(8);
    }

    public final void S(int i10, int i11) {
        wy wyVar;
        zg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = (wyVar = this.a1).l4) == null) {
            return;
        }
        eVar.f(i10, i11);
        wyVar.m3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        super.dispatchDraw(canvas);
        wy wyVar = this.a1;
        if (wyVar.a0 != null || wyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            lVar = ((org.telegram.ui.ActionBar.p2) wyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(wyVar.a) + lVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (wyVar.X2 != 0 ? dp : 0);
            org.telegram.ui.Components.qs qsVar = wyVar.J1;
            int c10 = dp2 + (qsVar != null ? (int) qsVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.7f, wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            xf.z zVar = this.Y0;
            zVar.b(l1);
            zVar.c(c10, 0);
            zVar.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            zVar.draw(canvas);
        }
        if (wyVar.g4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.9f, wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            xf.z zVar2 = this.Z0;
            zVar2.b(l12);
            zVar2.setBounds(0, getMeasuredHeight() - wyVar.g4, getMeasuredWidth(), getMeasuredHeight());
            zVar2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.a1.m3();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        y41 y41Var = this.a1.Z;
        if (y41Var != null) {
            y41Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.v81
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            wy wyVar = this.a1;
            if (wyVar.l4 != null) {
                wyVar.m3();
            }
        }
    }

    @Override // org.telegram.ui.Components.v81
    public final void x(int i10) {
        org.telegram.ui.Components.go0 go0Var = this.T;
        this.a1.c5(go0Var != null && go0Var.h(i10) == 2);
    }
}
