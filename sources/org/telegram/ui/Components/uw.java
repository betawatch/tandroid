package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class uw extends mm0 {
    public boolean Y2;
    public boolean Z2;
    public final /* synthetic */ tz a3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(tz tzVar, Context context) {
        super(context, null);
        this.a3 = tzVar;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        tz tzVar = this.a3;
        return super.onInterceptTouchEvent(motionEvent) || o10.p(motionEvent, tzVar.h0, tzVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        tz tzVar = this.a3;
        if (tzVar.q0 && tzVar.n0.G > 1) {
            this.Y2 = true;
            tzVar.i0.h1(0, 0);
            tzVar.o0.setVisibility(0);
            tzVar.p0.k(0, 0);
            tzVar.q0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        tz.f(tzVar, true);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.Z2) {
            return;
        }
        this.a3.n0.l();
        this.Z2 = true;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}
