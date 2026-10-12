package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class iy extends org.telegram.ui.Components.zo0 {
    public final zf.z Z0;
    public final zf.z a1;
    public final /* synthetic */ yy b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(yy yyVar, Activity activity, yy yyVar2, int i10, int i11, int i12, long j10, ey eyVar) {
        super(activity, yyVar2, i10, i11, i12, j10, eyVar);
        this.b1 = yyVar;
        this.Z0 = new zf.z(2);
        this.a1 = new zf.z(8);
    }

    public final void S(int i10, int i11) {
        yy yyVar;
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = (yyVar = this.b1).k4) == null) {
            return;
        }
        fVar.f(i10, i11);
        yyVar.j3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        yy yyVar = this.b1;
        if (yyVar.a0 != null || yyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(yyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (yyVar.X2 != 0 ? dp : 0);
            org.telegram.ui.Components.xs xsVar = yyVar.J1;
            int c10 = dp2 + (xsVar != null ? (int) xsVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int m12 = org.telegram.ui.ActionBar.g6.m1(0.7f, yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            zf.z zVar = this.Z0;
            zVar.b(m12);
            zVar.c(c10, 0);
            zVar.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            zVar.draw(canvas);
        }
        if (yyVar.f4 > AndroidUtilities.dp(32.0f)) {
            int m13 = org.telegram.ui.ActionBar.g6.m1(0.9f, yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            zf.z zVar2 = this.a1;
            zVar2.b(m13);
            zVar2.setBounds(0, getMeasuredHeight() - yyVar.f4, getMeasuredWidth(), getMeasuredHeight());
            zVar2.draw(canvas);
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
        c51 c51Var = this.b1.Z;
        if (c51Var != null) {
            c51Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.k91
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            yy yyVar = this.b1;
            if (yyVar.k4 != null) {
                yyVar.j3();
            }
        }
    }

    @Override // org.telegram.ui.Components.k91
    public final void x(int i10) {
        org.telegram.ui.Components.yo0 yo0Var = this.T;
        this.b1.Z4(yo0Var != null && yo0Var.h(i10) == 2);
    }
}
