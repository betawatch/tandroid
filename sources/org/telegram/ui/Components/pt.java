package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pt extends yy {
    public int L2;
    public boolean M2;
    public boolean N2;
    public final /* synthetic */ tt O2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(tt ttVar, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.c6 c6Var, boolean z13) {
        super(n2Var, z10, false, false, context, z11, null, null, z12, c6Var, false, z13);
        this.O2 = ttVar;
    }

    @Override // org.telegram.ui.Components.yy, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        tt ttVar = this.O2;
        int i10 = ttVar.H;
        if (i10 == 2 || i10 == 3) {
            ttVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.yy, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        tt ttVar = this.O2;
        if (ttVar.b()) {
            int i15 = i13 - i11;
            if (!this.M2 && ttVar.x) {
                this.N2 = true;
            }
            if (this.N2 && (i14 = this.L2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.rl.o(animate().translationY(0.0f), org.telegram.ui.ActionBar.p1.w, 250L);
                this.N2 = false;
            }
            this.M2 = ttVar.x;
            this.L2 = i15;
        }
    }
}
