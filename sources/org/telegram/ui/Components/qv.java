package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class qv extends uj0 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ ly h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(ly lyVar, Context context) {
        super(context, null);
        this.h3 = lyVar;
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ly lyVar = this.h3;
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, lyVar.i0, lyVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ly lyVar = this.h3;
        if (lyVar.r0 && lyVar.o0.H > 1) {
            this.f3 = true;
            lyVar.j0.h1(0, 0);
            lyVar.p0.setVisibility(0);
            lyVar.q0.k(0, 0);
            lyVar.r0 = false;
            this.f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        ly.f(lyVar, true);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.g3) {
            return;
        }
        this.h3.o0.f();
        this.g3 = true;
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
