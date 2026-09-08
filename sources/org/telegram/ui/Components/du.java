package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class du extends kz {
    public int P2;
    public boolean Q2;
    public boolean R2;
    public final /* synthetic */ hu S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(hu huVar, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.f6 f6Var, boolean z13) {
        super(n2Var, z10, false, false, context, z11, null, null, z12, f6Var, false, z13);
        this.S2 = huVar;
    }

    @Override // org.telegram.ui.Components.kz, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        hu huVar = this.S2;
        int i10 = huVar.L;
        if (i10 == 2 || i10 == 3) {
            huVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.kz, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        hu huVar = this.S2;
        if (huVar.b()) {
            int i15 = i13 - i11;
            if (!this.Q2 && huVar.x) {
                this.R2 = true;
            }
            if (this.R2 && (i14 = this.P2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.wl.q(animate().translationY(0.0f), org.telegram.ui.ActionBar.p1.w, 250L);
                this.R2 = false;
            }
            this.Q2 = huVar.x;
            this.P2 = i15;
        }
    }
}
