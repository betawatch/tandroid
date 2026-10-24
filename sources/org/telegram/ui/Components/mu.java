package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class mu extends tz {
    public int V2;
    public boolean W2;
    public boolean X2;
    public final /* synthetic */ qu Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(qu quVar, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, Context context, boolean z11, boolean z12, org.telegram.ui.ActionBar.g6 g6Var, boolean z13) {
        super(o2Var, z10, false, false, context, z11, null, null, z12, g6Var, false, z13);
        this.Y2 = quVar;
    }

    @Override // org.telegram.ui.Components.tz, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        qu quVar = this.Y2;
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
        qu quVar = this.Y2;
        if (quVar.b()) {
            int i15 = i13 - i11;
            if (!this.W2 && quVar.x) {
                this.X2 = true;
            }
            if (this.X2 && (i14 = this.V2) > 0 && i15 > 0 && i15 != i14) {
                setTranslationY(i15 - i14);
                org.telegram.messenger.sl.t(animate().translationY(0.0f), org.telegram.ui.ActionBar.o1.w, 250L);
                this.X2 = false;
            }
            this.W2 = quVar.x;
            this.V2 = i15;
        }
    }
}
