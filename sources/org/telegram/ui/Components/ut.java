package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ut extends ty {
    public int W2;
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ yt Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut(yt ytVar, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.h6 h6Var, boolean z13) {
        super(g2Var, z10, false, false, context, z11, null, null, z12, h6Var, false, z13);
        this.Z2 = ytVar;
    }

    @Override // org.telegram.ui.Components.ty, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        yt ytVar = this.Z2;
        int i7 = ytVar.M;
        if (i7 == 2 || i7 == 3) {
            ytVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ty, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        yt ytVar = this.Z2;
        if (ytVar.b()) {
            int i14 = i12 - i10;
            if (!this.X2 && ytVar.y) {
                this.Y2 = true;
            }
            if (this.Y2 && (i13 = this.W2) > 0 && i14 > 0 && i14 != i13) {
                setTranslationY(i14 - i13);
                org.telegram.messenger.o10.o(animate().translationY(0.0f), org.telegram.ui.ActionBar.i1.w, 250L);
                this.Y2 = false;
            }
            this.X2 = ytVar.y;
            this.W2 = i14;
        }
    }
}
