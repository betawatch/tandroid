package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ay extends org.telegram.ui.Components.yn0 {
    public final yf.y Z0;
    public final yf.y a1;
    public final /* synthetic */ ry b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(ry ryVar, Activity activity, ry ryVar2, int i10, int i11, int i12, long j3, wx wxVar) {
        super(activity, ryVar2, i10, i11, i12, j3, wxVar);
        this.b1 = ryVar;
        this.Z0 = new yf.y(2);
        this.a1 = new yf.y(8);
    }

    public final void S(int i10, int i11) {
        ry ryVar;
        ah.h hVar;
        if (Build.VERSION.SDK_INT < 31 || (hVar = (ryVar = this.b1).k4) == null) {
            return;
        }
        hVar.f(i10, i11);
        ryVar.m3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        ry ryVar = this.b1;
        if (ryVar.a0 != null || ryVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) ryVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(ryVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (ryVar.X2 != 0 ? dp : 0);
            org.telegram.ui.Components.ls lsVar = ryVar.J1;
            int c10 = dp2 + (lsVar != null ? (int) lsVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int l1 = org.telegram.ui.ActionBar.h6.l1(0.7f, ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            yf.y yVar = this.Z0;
            yVar.b(l1);
            yVar.c(c10, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            yVar.draw(canvas);
        }
        if (ryVar.f4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.h6.l1(0.9f, ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            yf.y yVar2 = this.a1;
            yVar2.b(l12);
            yVar2.setBounds(0, getMeasuredHeight() - ryVar.f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.b1.m3();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        l41 l41Var = this.b1.Z;
        if (l41Var != null) {
            l41Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.h81
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            ry ryVar = this.b1;
            if (ryVar.k4 != null) {
                ryVar.m3();
            }
        }
    }

    @Override // org.telegram.ui.Components.h81
    public final void x(int i10) {
        org.telegram.ui.Components.xn0 xn0Var = this.T;
        this.b1.c5(xn0Var != null && xn0Var.h(i10) == 2);
    }
}
