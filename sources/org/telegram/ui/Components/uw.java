package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class uw extends im0 {
    public boolean V2;
    public boolean W2;
    public final /* synthetic */ tz X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(tz tzVar, Context context) {
        super(context, null);
        this.X2 = tzVar;
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.gt q6 = org.telegram.ui.gt.q();
        tz tzVar = this.X2;
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, tzVar.h0, tzVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        tz tzVar = this.X2;
        if (tzVar.q0 && tzVar.n0.G > 1) {
            this.V2 = true;
            tzVar.i0.h1(0, 0);
            tzVar.o0.setVisibility(0);
            tzVar.p0.k(0, 0);
            tzVar.q0 = false;
            this.V2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        tz.f(tzVar, true);
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.W2) {
            return;
        }
        this.X2.n0.l();
        this.W2 = true;
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
