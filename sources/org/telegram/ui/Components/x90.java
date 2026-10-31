package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x90 extends tk0 {
    public boolean e3;
    public boolean f3;
    public int g3;
    public int h3;
    public final /* synthetic */ y90 i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(y90 y90Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.i3 = y90Var;
        setOnScrollListener(new ag.u(this, 24));
        i(new w90(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        y90 y90Var = this.i3;
        y90Var.invalidate();
        y90Var.b();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        y90 y90Var = this.i3;
        zf.x0 x0Var = y90Var.f;
        zf.c1 c1Var = y90Var.e;
        if (!y90Var.c.t ? this.f3 || c1Var == null || c1Var.e == null || !c1Var.f || motionEvent.getY() >= c1Var.e.getBottom() : this.f3 || c1Var == null || c1Var.e == null || !c1Var.f || motionEvent.getY() <= c1Var.e.getTop()) {
            boolean z10 = !this.e3 && org.telegram.ui.lt.p().q(motionEvent, y90Var.b, null, this.n2);
            if (((x0Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && x0Var.N()) {
                if (x0Var.n0 == null) {
                    mw mwVar = new mw(x0Var, x0Var.f, x0Var.n, x0Var.r, 1);
                    x0Var.n0 = mwVar;
                    mwVar.a();
                }
                x0Var.n0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        y90 y90Var = this.i3;
        boolean g10 = y90Var.g();
        s4.a0 currentLayoutManager = y90Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i14 = m10.getTop() - (g10 ? 0 : this.h3 - i16);
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (y90Var.H) {
            y90Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            y90Var.G = false;
            y90Var.H = false;
        } else if (L0 != -1 && i15 == this.g3 && i16 - this.h3 != 0) {
            y90Var.G = true;
            currentLayoutManager.i1(L0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            y90Var.G = false;
        }
        this.h3 = i16;
        this.g3 = i15;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        y90 y90Var = this.i3;
        zf.c1 c1Var = y90Var.e;
        if (c1Var != null) {
            c1Var.d = Integer.valueOf(size);
            org.telegram.ui.do0 do0Var = c1Var.e;
            if (do0Var != null) {
                do0Var.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.i0.L(126.0f), org.telegram.messenger.i0.q.y * 0.22f);
        y90Var.w = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y90 y90Var = this.i3;
        zf.c1 c1Var = y90Var.e;
        if (y90Var.c.t) {
            if (!this.f3 && c1Var != null && c1Var.e != null && c1Var.f && motionEvent.getY() > c1Var.e.getTop()) {
                return false;
            }
        } else if (!this.f3 && c1Var != null && c1Var.e != null && c1Var.f && motionEvent.getY() < c1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.i3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.tk0, android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        y90 y90Var = this.i3;
        y90Var.invalidate();
        y90Var.b();
    }
}
