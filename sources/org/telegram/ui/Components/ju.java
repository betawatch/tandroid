package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ju extends rz {
    public int P2;
    public boolean Q2;
    public boolean R2;
    public final /* synthetic */ nu S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(nu nuVar, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.f6 f6Var, boolean z13) {
        super(p2Var, z10, false, false, context, z11, null, null, z12, f6Var, false, z13);
        this.S2 = nuVar;
    }

    @Override // org.telegram.ui.Components.rz, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        nu nuVar = this.S2;
        int i10 = nuVar.L;
        if (i10 == 2 || i10 == 3) {
            nuVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.rz, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        nu nuVar = this.S2;
        if (nuVar.b()) {
            int i15 = i13 - i11;
            if (!this.Q2 && nuVar.x) {
                this.R2 = true;
            }
            if (this.R2 && (i14 = this.P2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.em.q(animate().translationY(0.0f), org.telegram.ui.ActionBar.r1.w, 250L);
                this.R2 = false;
            }
            this.Q2 = nuVar.x;
            this.P2 = i15;
        }
    }
}
