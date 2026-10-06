package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class iu extends nz {
    public int N2;
    public boolean O2;
    public boolean P2;
    public final /* synthetic */ mu Q2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(mu muVar, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.d6 d6Var, boolean z13) {
        super(n2Var, z10, false, false, context, z11, null, null, z12, d6Var, false, z13);
        this.Q2 = muVar;
    }

    @Override // org.telegram.ui.Components.nz, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        mu muVar = this.Q2;
        int i10 = muVar.L;
        if (i10 == 2 || i10 == 3) {
            muVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.nz, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        mu muVar = this.Q2;
        if (muVar.b()) {
            int i15 = i13 - i11;
            if (!this.O2 && muVar.x) {
                this.P2 = true;
            }
            if (this.P2 && (i14 = this.N2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.bi.r(animate().translationY(0.0f), org.telegram.ui.ActionBar.p1.w, 250L);
                this.P2 = false;
            }
            this.O2 = muVar.x;
            this.N2 = i15;
        }
    }
}
