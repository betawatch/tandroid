package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class yt extends kz {
    public int M2;
    public boolean N2;
    public boolean O2;
    public final /* synthetic */ cu P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt(cu cuVar, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.f6 f6Var, boolean z12) {
        super(p2Var, z4, false, false, context, z10, null, null, z11, f6Var, false, z12);
        this.P2 = cuVar;
    }

    @Override // org.telegram.ui.Components.kz, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        cu cuVar = this.P2;
        int i10 = cuVar.I;
        if (i10 == 2 || i10 == 3) {
            cuVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.kz, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        cu cuVar = this.P2;
        if (cuVar.b()) {
            int i15 = i13 - i11;
            if (!this.N2 && cuVar.x) {
                this.O2 = true;
            }
            if (this.O2 && (i14 = this.M2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.ui.b.p(animate().translationY(0.0f), org.telegram.ui.ActionBar.r1.w, 250L);
                this.O2 = false;
            }
            this.N2 = cuVar.x;
            this.M2 = i15;
        }
    }
}
