package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class lx extends org.telegram.ui.Components.wo0 {
    public final zf.y Z0;
    public final zf.y a1;
    public final /* synthetic */ cy b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(cy cyVar, Activity activity, cy cyVar2, int i10, int i11, int i12, long j10, hx hxVar) {
        super(activity, cyVar2, i10, i11, i12, j10, hxVar);
        this.b1 = cyVar;
        this.Z0 = new zf.y(2);
        this.a1 = new zf.y(8);
    }

    public final void S(int i10, int i11) {
        cy cyVar;
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = (cyVar = this.b1).l4) == null) {
            return;
        }
        fVar.f(i10, i11);
        cyVar.j3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        cy cyVar = this.b1;
        if (cyVar.a0 != null || cyVar.Y2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(cyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (cyVar.Y2 != 0 ? dp : 0);
            org.telegram.ui.Components.us usVar = cyVar.J1;
            int c10 = dp2 + (usVar != null ? (int) usVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int m12 = org.telegram.ui.ActionBar.h6.m1(0.7f, cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            zf.y yVar = this.Z0;
            yVar.b(m12);
            yVar.c(c10, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            yVar.draw(canvas);
        }
        if (cyVar.g4 > AndroidUtilities.dp(32.0f)) {
            int m13 = org.telegram.ui.ActionBar.h6.m1(0.9f, cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            zf.y yVar2 = this.a1;
            yVar2.b(m13);
            yVar2.setBounds(0, getMeasuredHeight() - cyVar.g4, getMeasuredWidth(), getMeasuredHeight());
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
        i31 i31Var = this.b1.Z;
        if (i31Var != null) {
            i31Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.e91
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            cy cyVar = this.b1;
            if (cyVar.l4 != null) {
                cyVar.j3();
            }
        }
    }

    @Override // org.telegram.ui.Components.e91
    public final void x(int i10) {
        org.telegram.ui.Components.vo0 vo0Var = this.T;
        this.b1.a5(vo0Var != null && vo0Var.h(i10) == 2);
    }
}
