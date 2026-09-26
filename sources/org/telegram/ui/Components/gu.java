package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class gu extends lz {
    public int P2;
    public boolean Q2;
    public boolean R2;
    public final /* synthetic */ ku S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu(ku kuVar, org.telegram.ui.ActionBar.m2 m2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.d6 d6Var, boolean z13) {
        super(m2Var, z10, false, false, context, z11, null, null, z12, d6Var, false, z13);
        this.S2 = kuVar;
    }

    @Override // org.telegram.ui.Components.lz, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ku kuVar = this.S2;
        int i10 = kuVar.L;
        if (i10 == 2 || i10 == 3) {
            kuVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.lz, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        ku kuVar = this.S2;
        if (kuVar.b()) {
            int i15 = i13 - i11;
            if (!this.Q2 && kuVar.x) {
                this.R2 = true;
            }
            if (this.R2 && (i14 = this.P2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.ok.s(animate().translationY(0.0f), org.telegram.ui.ActionBar.o1.w, 250L);
                this.R2 = false;
            }
            this.Q2 = kuVar.x;
            this.P2 = i15;
        }
    }
}
