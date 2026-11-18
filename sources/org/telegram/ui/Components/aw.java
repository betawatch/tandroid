package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class aw extends rg.d {
    public boolean g3;
    public final /* synthetic */ ry h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(ry ryVar, Context context) {
        super(context, null);
        this.h3 = ryVar;
    }

    @Override // rg.d, org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.h3.o2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        ry ryVar = this.h3;
        my myVar = ryVar.A0;
        if (ryVar.D0 != null) {
            ryVar.C0.setUnderlineHeight(ryVar.E0.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
        }
        if (myVar != null && getAdapter() == myVar && myVar.d == 0) {
            my myVar2 = myVar.P.x;
            if (myVar2.R.H0.G || myVar2.E) {
                return;
            }
            if (ryVar.F0.N0() + 50 > myVar.b()) {
                ly lyVar = myVar.P;
                Objects.requireNonNull(lyVar);
                org.telegram.messenger.g0.g3(new zv(lyVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ry ryVar = this.h3;
        if (ryVar.f) {
            return false;
        }
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        aw awVar = ryVar.E0;
        ryVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, awVar, ryVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ry ryVar = this.h3;
        if (ryVar.J0 && ryVar.z0.b() > 0) {
            this.g3 = true;
            ryVar.F0.h1(0, 0);
            ryVar.J0 = false;
            this.g3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        ryVar.q(true);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }
}
