package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uw extends mm0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ sz h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(sz szVar, Context context) {
        super(context, null);
        this.h3 = szVar;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
        sz szVar = this.h3;
        return super.onInterceptTouchEvent(motionEvent) || o10.p(motionEvent, szVar.h0, szVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.g3) {
            return;
        }
        this.h3.n0.l();
        this.g3 = true;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
