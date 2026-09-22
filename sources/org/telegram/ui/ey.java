package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ey extends org.telegram.ui.Components.no0 {
    public final yf.y a1;
    public final yf.y b1;
    public final /* synthetic */ uy c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(uy uyVar, Activity activity, uy uyVar2, int i10, int i11, int i12, long j3, zx zxVar) {
        super(activity, uyVar2, i10, i11, i12, j3, zxVar);
        this.c1 = uyVar;
        this.a1 = new yf.y(2);
        this.b1 = new yf.y(8);
    }

    public final void T(int i10, int i11) {
        uy uyVar;
        ah.i iVar;
        if (Build.VERSION.SDK_INT < 31 || (iVar = (uyVar = this.c1).k4) == null) {
            return;
        }
        iVar.f(i10, i11);
        uyVar.m3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        uy uyVar = this.c1;
        if (uyVar.a0 != null || uyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(uyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (uyVar.X2 != 0 ? dp : 0);
            org.telegram.ui.Components.ks ksVar = uyVar.J1;
            int c10 = dp2 + (ksVar != null ? (int) ksVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.7f, uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            yf.y yVar = this.a1;
            yVar.b(l1);
            yVar.c(c10, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            yVar.draw(canvas);
        }
        if (uyVar.f4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.9f, uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            yf.y yVar2 = this.b1;
            yVar2.b(l12);
            yVar2.setBounds(0, getMeasuredHeight() - uyVar.f4, getMeasuredWidth(), getMeasuredHeight());
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
        w41 w41Var = this.c1.Z;
        if (w41Var != null) {
            w41Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.z81
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            uy uyVar = this.c1;
            if (uyVar.k4 != null) {
                uyVar.m3();
            }
        }
    }

    @Override // org.telegram.ui.Components.z81
    public final void y(int i10) {
        org.telegram.ui.Components.mo0 mo0Var = this.U;
        this.c1.c5(mo0Var != null && mo0Var.h(i10) == 2);
    }
}
