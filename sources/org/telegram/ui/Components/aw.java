package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class aw extends rg.d {
    public boolean g3;
    public final /* synthetic */ qy h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(qy qyVar, Context context) {
        super(context, null);
        this.h3 = qyVar;
    }

    @Override // rg.d, org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.h3.o2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        qy qyVar = this.h3;
        ly lyVar = qyVar.A0;
        if (qyVar.D0 != null) {
            qyVar.C0.setUnderlineHeight(qyVar.E0.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
        }
        if (lyVar != null && getAdapter() == lyVar && lyVar.d == 0) {
            ly lyVar2 = lyVar.P.x;
            if (lyVar2.R.H0.G || lyVar2.E) {
                return;
            }
            if (qyVar.F0.N0() + 50 > lyVar.b()) {
                ky kyVar = lyVar.P;
                Objects.requireNonNull(kyVar);
                org.telegram.messenger.g0.g3(new zv(kyVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        qy qyVar = this.h3;
        if (qyVar.f) {
            return false;
        }
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        aw awVar = qyVar.E0;
        qyVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, awVar, qyVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        qy qyVar = this.h3;
        if (qyVar.J0 && qyVar.z0.b() > 0) {
            this.g3 = true;
            qyVar.F0.h1(0, 0);
            qyVar.J0 = false;
            this.g3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        qyVar.q(true);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }
}
