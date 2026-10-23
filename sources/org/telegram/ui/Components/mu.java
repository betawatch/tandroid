package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class mu extends tz {
    public int P2;
    public boolean Q2;
    public boolean R2;
    public final /* synthetic */ qu S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(qu quVar, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.d6 d6Var, boolean z13) {
        super(n2Var, z10, false, false, context, z11, null, null, z12, d6Var, false, z13);
        this.S2 = quVar;
    }

    @Override // org.telegram.ui.Components.tz, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        qu quVar = this.S2;
        int i10 = quVar.L;
        if (i10 == 2 || i10 == 3) {
            quVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.tz, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        qu quVar = this.S2;
        if (quVar.b()) {
            int i15 = i13 - i11;
            if (!this.Q2 && quVar.x) {
                this.R2 = true;
            }
            if (this.R2 && (i14 = this.P2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.nk.t(animate().translationY(0.0f), org.telegram.ui.ActionBar.o1.w, 250L);
                this.R2 = false;
            }
            this.Q2 = quVar.x;
            this.P2 = i15;
        }
    }
}
