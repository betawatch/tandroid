package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bu extends mz {
    public int M2;
    public boolean N2;
    public boolean O2;
    public final /* synthetic */ fu P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(fu fuVar, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var, boolean z12) {
        super(p2Var, z4, false, false, context, z10, null, null, z11, g6Var, false, z12);
        this.P2 = fuVar;
    }

    @Override // org.telegram.ui.Components.mz, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        fu fuVar = this.P2;
        int i10 = fuVar.I;
        if (i10 == 2 || i10 == 3) {
            fuVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.mz, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        fu fuVar = this.P2;
        if (fuVar.b()) {
            int i15 = i13 - i11;
            if (!this.N2 && fuVar.x) {
                this.O2 = true;
            }
            if (this.O2 && (i14 = this.M2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.ui.b.p(animate().translationY(0.0f), org.telegram.ui.ActionBar.r1.w, 250L);
                this.O2 = false;
            }
            this.N2 = fuVar.x;
            this.M2 = i15;
        }
    }
}
