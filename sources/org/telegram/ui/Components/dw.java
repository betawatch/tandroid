package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class dw extends rg.d {
    public boolean g3;
    public final /* synthetic */ ty h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw(ty tyVar, Context context) {
        super(context, null);
        this.h3 = tyVar;
    }

    @Override // rg.d, org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.h3.o2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        ty tyVar = this.h3;
        oy oyVar = tyVar.A0;
        if (tyVar.D0 != null) {
            tyVar.C0.setUnderlineHeight(tyVar.E0.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
        }
        if (oyVar != null && getAdapter() == oyVar && oyVar.d == 0) {
            oy oyVar2 = oyVar.P.x;
            if (oyVar2.R.H0.G || oyVar2.E) {
                return;
            }
            if (tyVar.F0.N0() + 50 > oyVar.b()) {
                ny nyVar = oyVar.P;
                Objects.requireNonNull(nyVar);
                org.telegram.messenger.g0.g3(new cw(nyVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ty tyVar = this.h3;
        if (tyVar.f) {
            return false;
        }
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        dw dwVar = tyVar.E0;
        tyVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, dwVar, tyVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ty tyVar = this.h3;
        if (tyVar.J0 && tyVar.z0.b() > 0) {
            this.g3 = true;
            tyVar.F0.h1(0, 0);
            tyVar.J0 = false;
            this.g3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        tyVar.q(true);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }
}
