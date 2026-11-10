package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kv extends pj0 {
    public boolean e3;
    public boolean f3;
    public final /* synthetic */ gy g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(gy gyVar, Context context) {
        super(context, null);
        this.g3 = gyVar;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        gy gyVar = this.g3;
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, gyVar.h0, gyVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        gy gyVar = this.g3;
        if (gyVar.q0 && gyVar.n0.G > 1) {
            this.e3 = true;
            gyVar.i0.h1(0, 0);
            gyVar.o0.setVisibility(0);
            gyVar.p0.k(0, 0);
            gyVar.q0 = false;
            this.e3 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        gy.f(gyVar, true);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f3) {
            return;
        }
        this.g3.n0.f();
        this.f3 = true;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }
}
