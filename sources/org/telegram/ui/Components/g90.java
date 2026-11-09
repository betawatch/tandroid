package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g90 extends qj0 {
    public boolean e3;
    public boolean f3;
    public int g3;
    public int h3;
    public final /* synthetic */ h90 i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(h90 h90Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.i3 = h90Var;
        setOnScrollListener(new ui(this, 9));
        i(new f90(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        h90 h90Var = this.i3;
        h90Var.invalidate();
        h90Var.b();
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h90 h90Var = this.i3;
        jg.i1 i1Var = h90Var.f;
        jg.o1 o1Var = h90Var.e;
        if (!h90Var.c.t ? this.f3 || o1Var == null || o1Var.e == null || !o1Var.f || motionEvent.getY() >= o1Var.e.getBottom() : this.f3 || o1Var == null || o1Var.e == null || !o1Var.f || motionEvent.getY() <= o1Var.e.getTop()) {
            boolean z9 = !this.e3 && org.telegram.ui.ms.p().q(motionEvent, h90Var.b, null, this.n2);
            if (((i1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && i1Var.N()) {
                if (i1Var.n0 == null) {
                    jg.e1 e1Var = new jg.e1(i1Var, i1Var.f, i1Var.n, i1Var.r, 0);
                    i1Var.n0 = e1Var;
                    e1Var.a();
                }
                i1Var.n0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z9) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i7;
        int i15 = i12 - i10;
        h90 h90Var = this.i3;
        boolean g10 = h90Var.g();
        v4.b0 currentLayoutManager = h90Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i13 = m10.getTop() - (g10 ? 0 : this.h3 - i15);
        } else {
            i13 = 0;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        if (h90Var.H) {
            h90Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i7, i10, i11, i12);
            h90Var.G = false;
            h90Var.H = false;
        } else if (L0 != -1 && i14 == this.g3 && i15 - this.h3 != 0) {
            h90Var.G = true;
            currentLayoutManager.i1(L0, i13, false);
            super.onLayout(false, i7, i10, i11, i12);
            h90Var.G = false;
        }
        this.h3 = i15;
        this.g3 = i14;
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        h90 h90Var = this.i3;
        jg.o1 o1Var = h90Var.e;
        if (o1Var != null) {
            o1Var.d = Integer.valueOf(size);
            bi.ec ecVar = o1Var.e;
            if (ecVar != null) {
                ecVar.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.q.y * 0.22f);
        h90Var.w = min;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h90 h90Var = this.i3;
        jg.o1 o1Var = h90Var.e;
        if (h90Var.c.t) {
            if (!this.f3 && o1Var != null && o1Var.e != null && o1Var.f && motionEvent.getY() > o1Var.e.getTop()) {
                return false;
            }
        } else if (!this.f3 && o1Var != null && o1Var.e != null && o1Var.f && motionEvent.getY() < o1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.i3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.qj0, android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        h90 h90Var = this.i3;
        h90Var.invalidate();
        h90Var.b();
    }
}
