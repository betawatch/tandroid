package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class dy extends org.telegram.ui.Components.dp0 {
    public final yf.y Z0;
    public final yf.y a1;
    public final /* synthetic */ ty b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(ty tyVar, Activity activity, ty tyVar2, int i10, int i11, int i12, long j3, yx yxVar) {
        super(activity, tyVar2, i10, i11, i12, j3, yxVar);
        this.b1 = tyVar;
        this.Z0 = new yf.y(2);
        this.a1 = new yf.y(8);
    }

    public final void S(int i10, int i11) {
        ty tyVar;
        ah.h hVar;
        if (Build.VERSION.SDK_INT < 31 || (hVar = (tyVar = this.b1).k4) == null) {
            return;
        }
        hVar.f(i10, i11);
        tyVar.j3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        ty tyVar = this.b1;
        if (tyVar.a0 != null || tyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) tyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(tyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (tyVar.X2 != 0 ? dp : 0);
            org.telegram.ui.Components.at atVar = tyVar.J1;
            int c10 = dp2 + (atVar != null ? (int) atVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int m12 = org.telegram.ui.ActionBar.i6.m1(0.7f, tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            yf.y yVar = this.Z0;
            yVar.b(m12);
            yVar.c(c10, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            yVar.draw(canvas);
        }
        if (tyVar.f4 > AndroidUtilities.dp(32.0f)) {
            int m13 = org.telegram.ui.ActionBar.i6.m1(0.9f, tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            yf.y yVar2 = this.a1;
            yVar2.b(m13);
            yVar2.setBounds(0, getMeasuredHeight() - tyVar.f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.b1.j3();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        v41 v41Var = this.b1.Z;
        if (v41Var != null) {
            v41Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.o91
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            ty tyVar = this.b1;
            if (tyVar.k4 != null) {
                tyVar.j3();
            }
        }
    }

    @Override // org.telegram.ui.Components.o91
    public final void x(int i10) {
        org.telegram.ui.Components.cp0 cp0Var = this.T;
        this.b1.Z4(cp0Var != null && cp0Var.h(i10) == 2);
    }
}
