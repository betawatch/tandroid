package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class uw extends nm0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ sz h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(sz szVar, Context context) {
        super(context, null);
        this.h3 = szVar;
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        sz szVar = this.h3;
        return super.onInterceptTouchEvent(motionEvent) || o10.p(motionEvent, szVar.h0, szVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        sz szVar = this.h3;
        if (szVar.q0 && szVar.n0.G > 1) {
            this.f3 = true;
            szVar.i0.h1(0, 0);
            szVar.o0.setVisibility(0);
            szVar.p0.k(0, 0);
            szVar.q0 = false;
            this.f3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        sz.f(szVar, true);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.g3) {
            return;
        }
        this.h3.n0.l();
        this.g3 = true;
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
