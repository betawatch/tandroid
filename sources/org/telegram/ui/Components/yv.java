package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class yv extends ek0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ ty h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(ty tyVar, Context context) {
        super(context, null);
        this.h3 = tyVar;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ty tyVar = this.h3;
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, tyVar.i0, tyVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ty tyVar = this.h3;
        if (tyVar.r0 && tyVar.o0.H > 1) {
            this.f3 = true;
            tyVar.j0.h1(0, 0);
            tyVar.p0.setVisibility(0);
            tyVar.q0.k(0, 0);
            tyVar.r0 = false;
            this.f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        ty.f(tyVar, true);
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
