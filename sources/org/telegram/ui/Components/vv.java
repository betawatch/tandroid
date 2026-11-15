package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vv extends rg.d {
    public boolean g3;
    public final /* synthetic */ ly h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(ly lyVar, Context context) {
        super(context, null);
        this.h3 = lyVar;
    }

    @Override // rg.d, org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.h3.o2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        ly lyVar = this.h3;
        gy gyVar = lyVar.A0;
        if (lyVar.D0 != null) {
            lyVar.C0.setUnderlineHeight(lyVar.E0.canScrollVertically(-1) ? org.telegram.messenger.g0.f1() : 0);
        }
        if (gyVar != null && getAdapter() == gyVar && gyVar.d == 0) {
            gy gyVar2 = gyVar.P.x;
            if (gyVar2.R.H0.G || gyVar2.E) {
                return;
            }
            if (lyVar.F0.N0() + 50 > gyVar.b()) {
                fy fyVar = gyVar.P;
                Objects.requireNonNull(fyVar);
                org.telegram.messenger.g0.h3(new uv(fyVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ly lyVar = this.h3;
        if (lyVar.f) {
            return false;
        }
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        vv vvVar = lyVar.E0;
        lyVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || p10.q(motionEvent, vvVar, lyVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ly lyVar = this.h3;
        if (lyVar.J0 && lyVar.z0.b() > 0) {
            this.g3 = true;
            lyVar.F0.h1(0, 0);
            lyVar.J0 = false;
            this.g3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        lyVar.q(true);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }
}
