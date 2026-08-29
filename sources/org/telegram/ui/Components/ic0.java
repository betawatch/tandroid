package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class ic0 extends hv0 implements r0.n, View.OnLayoutChangeListener {
    public final a5.e s0;
    public View t0;
    public hc0 u0;
    public org.telegram.ui.ActionBar.d3 v0;
    public int w0;
    public int x0;
    public boolean y0;

    public ic0(Context context) {
        super(context, null);
        this.s0 = new a5.e();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        hc0 hc0Var;
        if (viewGroup != this.t0 || (hc0Var = this.u0) == null || ((org.telegram.ui.q7) hc0Var).getListView() == null) {
            return;
        }
        int top = this.u0.getTop();
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.d3 d3Var = this.v0;
            if (d3Var != null) {
                d3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
                return;
            }
            return;
        }
        if (top > this.w0) {
            if (this.v0 == null || this.t0.canScrollVertically(i11)) {
                return;
            }
            this.v0.onNestedScroll(viewGroup, 0, 0, i10, i11);
            return;
        }
        jl0 listView = ((org.telegram.ui.q7) this.u0).getListView();
        int L0 = ((f2.j0) listView.getLayoutManager()).L0();
        if (L0 != -1) {
            f2.n1 K = listView.K(L0);
            int top2 = K != null ? K.a.getTop() : -1;
            int paddingTop = listView.getPaddingTop();
            if (top2 == paddingTop && L0 == 0) {
                return;
            }
            iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
            listView.scrollBy(0, i11);
        }
    }

    public final boolean Z() {
        hc0 hc0Var = this.u0;
        return hc0Var != null && hc0Var.getTop() == this.w0;
    }

    public final void a0(hc0 hc0Var, int i10) {
        this.x0 = i10;
        if (this.u0 != hc0Var) {
            this.u0 = hc0Var;
            if (this.y0 && hc0Var != null) {
                org.telegram.ui.q7 q7Var = (org.telegram.ui.q7) hc0Var;
                if (q7Var.getListView() != null) {
                    q7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        b0();
    }

    public final void b0() {
        View view = this.t0;
        if (view == null || this.u0 == null) {
            return;
        }
        if (this.x0 != 0) {
            this.w0 = view.getPaddingTop() + this.x0;
        } else {
            this.w0 = (view.getMeasuredHeight() - this.t0.getPaddingBottom()) - this.u0.getMeasuredHeight();
        }
    }

    @Override // org.telegram.ui.Components.hv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        hc0 hc0Var;
        if (viewGroup != this.t0 || (hc0Var = this.u0) == null || ((org.telegram.ui.q7) hc0Var).getListView() == null) {
            return;
        }
        jl0 listView = ((org.telegram.ui.q7) this.u0).getListView();
        if (this.u0.getTop() == this.w0) {
            iArr[1] = i13;
            listView.scrollBy(0, i13);
        }
    }

    public void n(int i10, View view) {
        this.s0.a = 0;
        org.telegram.ui.ActionBar.d3 d3Var = this.v0;
        if (d3Var != null) {
            d3Var.onStopNestedScroll(view);
        }
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return view != null && view.isAttachedToWindow() && i10 == 2;
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y0 = true;
        hc0 hc0Var = this.u0;
        if (hc0Var != null) {
            hc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y0 = false;
        hc0 hc0Var = this.u0;
        if (hc0Var != null) {
            hc0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        b0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b0();
    }

    public void s(View view, View view2, int i10, int i11) {
        this.s0.a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.d3 d3Var) {
        this.v0 = d3Var;
    }

    public void setChildLayout(hc0 hc0Var) {
        a0(hc0Var, 0);
    }

    public void setTargetListView(View view) {
        this.t0 = view;
        b0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
