package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zv extends wk0 {
    public boolean T2;
    public boolean U2;
    public final /* synthetic */ wy V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv(wy wyVar, Context context) {
        super(context, null);
        this.V2 = wyVar;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
        wy wyVar = this.V2;
        return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, wyVar.d0, wyVar.c2, this.l2);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        wy wyVar = this.V2;
        if (wyVar.m0 && wyVar.j0.C > 1) {
            this.T2 = true;
            wyVar.e0.h1(0, 0);
            wyVar.k0.setVisibility(0);
            wyVar.l0.k(0, 0);
            wyVar.m0 = false;
            this.T2 = false;
        }
        super.onLayout(z10, i9, i10, i11, i12);
        wy.f(wyVar, true);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.U2) {
            return;
        }
        this.V2.j0.l();
        this.U2 = true;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }
}
