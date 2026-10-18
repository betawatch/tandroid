package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class nx extends org.telegram.ui.Components.vo0 {
    public final zf.y Z0;
    public final zf.y a1;
    public final /* synthetic */ ey b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(ey eyVar, Activity activity, ey eyVar2, int i10, int i11, int i12, long j10, jx jxVar) {
        super(activity, eyVar2, i10, i11, i12, j10, jxVar);
        this.b1 = eyVar;
        this.Z0 = new zf.y(2);
        this.a1 = new zf.y(8);
    }

    public final void S(int i10, int i11) {
        ey eyVar;
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = (eyVar = this.b1).l4) == null) {
            return;
        }
        fVar.f(i10, i11);
        eyVar.j3();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        super.dispatchDraw(canvas);
        ey eyVar = this.b1;
        if (eyVar.a0 != null || eyVar.Y2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.n2) eyVar).actionBar;
            int dp2 = ((AndroidUtilities.dp(eyVar.a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f)) - (eyVar.Y2 != 0 ? dp : 0);
            org.telegram.ui.Components.us usVar = eyVar.J1;
            int c10 = dp2 + (usVar != null ? (int) usVar.c(AndroidUtilities.dp(7.0f)) : 0);
            int m12 = org.telegram.ui.ActionBar.h6.m1(0.7f, eyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            zf.y yVar = this.Z0;
            yVar.b(m12);
            yVar.c(c10, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), c10 + dp);
            yVar.draw(canvas);
        }
        if (eyVar.g4 > AndroidUtilities.dp(32.0f)) {
            int m13 = org.telegram.ui.ActionBar.h6.m1(0.9f, eyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            zf.y yVar2 = this.a1;
            yVar2.b(m13);
            yVar2.setBounds(0, getMeasuredHeight() - eyVar.g4, getMeasuredWidth(), getMeasuredHeight());
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
        k31 k31Var = this.b1.Z;
        if (k31Var != null) {
            k31Var.setTranslationY(f7);
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            ey eyVar = this.b1;
            if (eyVar.l4 != null) {
                eyVar.j3();
            }
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final void x(int i10) {
        org.telegram.ui.Components.uo0 uo0Var = this.T;
        this.b1.a5(uo0Var != null && uo0Var.h(i10) == 2);
    }
}
