package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b90 extends tj0 {
    public boolean f3;
    public boolean g3;
    public int h3;
    public int i3;
    public final /* synthetic */ c90 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b90(c90 c90Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.j3 = c90Var;
        setOnScrollListener(new ji(this, 11));
        i(new a90(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i3) {
        c90 c90Var = this.j3;
        c90Var.invalidate();
        c90Var.b();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        c90 c90Var = this.j3;
        kg.e1 e1Var = c90Var.f;
        kg.k1 k1Var = c90Var.e;
        if (!c90Var.c.t ? this.g3 || k1Var == null || k1Var.e == null || !k1Var.f || motionEvent.getY() >= k1Var.e.getBottom() : this.g3 || k1Var == null || k1Var.e == null || !k1Var.f || motionEvent.getY() <= k1Var.e.getTop()) {
            boolean z10 = !this.f3 && org.telegram.ui.is.p().q(motionEvent, c90Var.b, null, this.o2);
            if (((e1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && e1Var.N()) {
                if (e1Var.o0 == null) {
                    kg.a1 a1Var = new kg.a1(e1Var, e1Var.f, e1Var.n, e1Var.r, 0);
                    e1Var.o0 = a1Var;
                    a1Var.a();
                }
                e1Var.o0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i3;
        int i15 = i12 - i10;
        c90 c90Var = this.j3;
        boolean g7 = c90Var.g();
        u4.b0 currentLayoutManager = c90Var.getCurrentLayoutManager();
        int L0 = g7 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i13 = m10.getTop() - (g7 ? 0 : this.i3 - i15);
        } else {
            i13 = 0;
        }
        super.onLayout(z10, i3, i10, i11, i12);
        if (c90Var.I) {
            c90Var.H = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i3, i10, i11, i12);
            c90Var.H = false;
            c90Var.I = false;
        } else if (L0 != -1 && i14 == this.h3 && i15 - this.i3 != 0) {
            c90Var.H = true;
            currentLayoutManager.i1(L0, i13, false);
            super.onLayout(false, i3, i10, i11, i12);
            c90Var.H = false;
        }
        this.i3 = i15;
        this.h3 = i14;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        c90 c90Var = this.j3;
        kg.k1 k1Var = c90Var.e;
        if (k1Var != null) {
            k1Var.d = Integer.valueOf(size);
            ai.x2 x2Var = k1Var.e;
            if (x2Var != null) {
                x2Var.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.q.y * 0.22f);
        c90Var.w = min;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c90 c90Var = this.j3;
        kg.k1 k1Var = c90Var.e;
        if (c90Var.c.t) {
            if (!this.g3 && k1Var != null && k1Var.e != null && k1Var.f && motionEvent.getY() > k1Var.e.getTop()) {
                return false;
            }
        } else if (!this.g3 && k1Var != null && k1Var.e != null && k1Var.f && motionEvent.getY() < k1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.j3.H) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.tj0, android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        c90 c90Var = this.j3;
        c90Var.invalidate();
        c90Var.b();
    }
}
