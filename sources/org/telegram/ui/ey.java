package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ey extends org.telegram.ui.Components.yn0 {
    public final yf.z Y0;
    public final yf.z Z0;
    public final /* synthetic */ uy a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(uy uyVar, Activity activity, uy uyVar2, int i10, int i11, int i12, long j3, zx zxVar) {
        super(activity, uyVar2, i10, i11, i12, j3, zxVar);
        this.a1 = uyVar;
        this.Y0 = new yf.z(2);
        this.Z0 = new yf.z(8);
    }

    public final void S(int i10, int i11) {
        uy uyVar;
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = (uyVar = this.a1).l4) == null) {
            return;
        }
        fVar.f(i10, i11);
        uyVar.m3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        uy uyVar = this.a1;
        if (uyVar.a0 != null || uyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(uyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (uyVar.X2 != 0 ? dp : 0);
            org.telegram.ui.Components.js jsVar = uyVar.J1;
            int c10 = dp2 + (jsVar != null ? (int) jsVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.7f, uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            yf.z zVar = this.Y0;
            zVar.b(l1);
            zVar.c(c10, 0);
            zVar.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            zVar.draw(canvas);
        }
        if (uyVar.g4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.9f, uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            yf.z zVar2 = this.Z0;
            zVar2.b(l12);
            zVar2.setBounds(0, getMeasuredHeight() - uyVar.g4, getMeasuredWidth(), getMeasuredHeight());
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
        v41 v41Var = this.a1.Z;
        if (v41Var != null) {
            v41Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.i81
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            uy uyVar = this.a1;
            if (uyVar.l4 != null) {
                uyVar.m3();
            }
        }
    }

    @Override // org.telegram.ui.Components.i81
    public final void x(int i10) {
        org.telegram.ui.Components.xn0 xn0Var = this.T;
        this.a1.c5(xn0Var != null && xn0Var.h(i10) == 2);
    }
}
