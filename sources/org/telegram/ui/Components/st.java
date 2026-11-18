package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class st extends ry {
    public int W2;
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ wt Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st(wt wtVar, org.telegram.ui.ActionBar.h2 h2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.i6 i6Var, boolean z13) {
        super(h2Var, z10, false, false, context, z11, null, null, z12, i6Var, false, z13);
        this.Z2 = wtVar;
    }

    @Override // org.telegram.ui.Components.ry, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wt wtVar = this.Z2;
        int i7 = wtVar.M;
        if (i7 == 2 || i7 == 3) {
            wtVar.g(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ry, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        wt wtVar = this.Z2;
        if (wtVar.b()) {
            int i14 = i12 - i10;
            if (!this.X2 && wtVar.y) {
                this.Y2 = true;
            }
            if (this.Y2 && (i13 = this.W2) > 0 && i14 > 0 && i14 != i13) {
                setTranslationY(i14 - i13);
                org.telegram.messenger.n10.o(animate().translationY(0.0f), org.telegram.ui.ActionBar.j1.w, 250L);
                this.Y2 = false;
            }
            this.X2 = wtVar.y;
            this.W2 = i14;
        }
    }
}
