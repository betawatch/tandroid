package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gy extends org.telegram.ui.Components.zn0 {
    public final yf.y a1;
    public final yf.y b1;
    public final /* synthetic */ wy c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(wy wyVar, Activity activity, wy wyVar2, int i10, int i11, int i12, long j3, cy cyVar) {
        super(activity, wyVar2, i10, i11, i12, j3, cyVar);
        this.c1 = wyVar;
        this.a1 = new yf.y(2);
        this.b1 = new yf.y(8);
    }

    public final void T(int i10, int i11) {
        wy wyVar;
        ah.i iVar;
        if (Build.VERSION.SDK_INT < 31 || (iVar = (wyVar = this.c1).k4) == null) {
            return;
        }
        iVar.f(i10, i11);
        wyVar.m3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        wy wyVar = this.c1;
        if (wyVar.a0 != null || wyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.o2) wyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(wyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (wyVar.X2 != 0 ? dp : 0);
            org.telegram.ui.Components.ks ksVar = wyVar.J1;
            int c10 = dp2 + (ksVar != null ? (int) ksVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.7f, wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            yf.y yVar = this.a1;
            yVar.b(l1);
            yVar.c(c10, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            yVar.draw(canvas);
        }
        if (wyVar.f4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.9f, wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            yf.y yVar2 = this.b1;
            yVar2.b(l12);
            yVar2.setBounds(0, getMeasuredHeight() - wyVar.f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.c1.m3();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        v41 v41Var = this.c1.Z;
        if (v41Var != null) {
            v41Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.j81
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            wy wyVar = this.c1;
            if (wyVar.k4 != null) {
                wyVar.m3();
            }
        }
    }

    @Override // org.telegram.ui.Components.j81
    public final void y(int i10) {
        org.telegram.ui.Components.yn0 yn0Var = this.U;
        this.c1.c5(yn0Var != null && yn0Var.h(i10) == 2);
    }
}
