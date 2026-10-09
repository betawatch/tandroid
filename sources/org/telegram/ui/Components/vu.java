package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class vu extends a00 {
    public int P2;
    public boolean Q2;
    public boolean R2;
    public final /* synthetic */ zu S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(zu zuVar, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.e6 e6Var, boolean z13) {
        super(n2Var, z10, false, false, context, z11, null, null, z12, e6Var, false, z13);
        this.S2 = zuVar;
    }

    @Override // org.telegram.ui.Components.a00, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        zu zuVar = this.S2;
        int i10 = zuVar.L;
        if (i10 == 2 || i10 == 3) {
            zuVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.a00, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        zu zuVar = this.S2;
        if (zuVar.b()) {
            int i15 = i13 - i11;
            if (!this.Q2 && zuVar.x) {
                this.R2 = true;
            }
            if (this.R2 && (i14 = this.P2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.bi.t(animate().translationY(0.0f), org.telegram.ui.ActionBar.p1.w, 250L);
                this.R2 = false;
            }
            this.Q2 = zuVar.x;
            this.P2 = i15;
        }
    }
}
