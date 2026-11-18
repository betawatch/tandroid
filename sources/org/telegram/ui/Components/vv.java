package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class vv extends ck0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ ry h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(ry ryVar, Context context) {
        super(context, null);
        this.h3 = ryVar;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ry ryVar = this.h3;
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, ryVar.i0, ryVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ry ryVar = this.h3;
        if (ryVar.r0 && ryVar.o0.H > 1) {
            this.f3 = true;
            ryVar.j0.h1(0, 0);
            ryVar.p0.setVisibility(0);
            ryVar.q0.k(0, 0);
            ryVar.r0 = false;
            this.f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        ry.f(ryVar, true);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.g3) {
            return;
        }
        this.h3.o0.f();
        this.g3 = true;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
