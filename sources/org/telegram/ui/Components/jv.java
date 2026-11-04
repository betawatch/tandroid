package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jv extends tj0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ ey h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(ey eyVar, Context context) {
        super(context, null);
        this.h3 = eyVar;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.is p10 = org.telegram.ui.is.p();
        ey eyVar = this.h3;
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, eyVar.i0, eyVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        ey eyVar = this.h3;
        if (eyVar.r0 && eyVar.o0.H > 1) {
            this.f3 = true;
            eyVar.j0.h1(0, 0);
            eyVar.p0.setVisibility(0);
            eyVar.q0.k(0, 0);
            eyVar.r0 = false;
            this.f3 = false;
        }
        super.onLayout(z10, i3, i10, i11, i12);
        ey.f(eyVar, true);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        if (this.g3) {
            return;
        }
        this.h3.o0.f();
        this.g3 = true;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
