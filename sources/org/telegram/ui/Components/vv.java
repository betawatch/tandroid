package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vv extends ek0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ qy h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(qy qyVar, Context context) {
        super(context, null);
        this.h3 = qyVar;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        qy qyVar = this.h3;
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, qyVar.i0, qyVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        qy qyVar = this.h3;
        if (qyVar.r0 && qyVar.o0.H > 1) {
            this.f3 = true;
            qyVar.j0.h1(0, 0);
            qyVar.p0.setVisibility(0);
            qyVar.q0.k(0, 0);
            qyVar.r0 = false;
            this.f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        qy.f(qyVar, true);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.g3) {
            return;
        }
        this.h3.o0.f();
        this.g3 = true;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
