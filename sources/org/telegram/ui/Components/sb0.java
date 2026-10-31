package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class sb0 extends uu0 implements r0.l, View.OnLayoutChangeListener {
    public final ac.g f0;
    public View g0;
    public rb0 h0;
    public org.telegram.ui.ActionBar.w2 i0;
    public int j0;
    public boolean k0;

    public sb0(Context context) {
        super(context, null);
        this.f0 = new ac.g();
    }

    public final void X() {
        View view = this.g0;
        if (view == null || this.h0 == null) {
            return;
        }
        this.j0 = (view.getMeasuredHeight() - this.g0.getPaddingBottom()) - this.h0.getMeasuredHeight();
    }

    @Override // r0.k
    public final void k(int i10, View view) {
        this.f0.a = 0;
        org.telegram.ui.ActionBar.w2 w2Var = this.i0;
        if (w2Var != null) {
            w2Var.onStopNestedScroll(view);
        }
    }

    @Override // r0.l
    public final void l(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        rb0 rb0Var;
        if (view != this.g0 || (rb0Var = this.h0) == null || ((org.telegram.ui.t7) rb0Var).getListView() == null) {
            return;
        }
        tk0 listView = ((org.telegram.ui.t7) this.h0).getListView();
        if (this.h0.getTop() == this.j0) {
            iArr[1] = i13;
            listView.scrollBy(0, i13);
        }
    }

    @Override // r0.k
    public final boolean n(View view, View view2, int i10, int i11) {
        return view != null && view.isAttachedToWindow() && i10 == 2;
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k0 = true;
        rb0 rb0Var = this.h0;
        if (rb0Var != null) {
            rb0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k0 = false;
        rb0 rb0Var = this.h0;
        if (rb0Var != null) {
            rb0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        X();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        X();
    }

    @Override // r0.k
    public final void q(View view, View view2, int i10, int i11) {
        this.f0.a = i10;
    }

    @Override // r0.k
    public final void s(View view, int i10, int i11, int[] iArr, int i12) {
        rb0 rb0Var;
        if (view != this.g0 || (rb0Var = this.h0) == null || ((org.telegram.ui.t7) rb0Var).getListView() == null) {
            return;
        }
        int top = this.h0.getTop();
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.w2 w2Var = this.i0;
            if (w2Var != null) {
                w2Var.onNestedPreScroll(view, i10, i11, iArr);
                return;
            }
            return;
        }
        if (top > this.j0) {
            if (this.i0 == null || this.g0.canScrollVertically(i11)) {
                return;
            }
            this.i0.onNestedScroll(view, 0, 0, i10, i11);
            return;
        }
        tk0 listView = ((org.telegram.ui.t7) this.h0).getListView();
        int L0 = ((s4.a0) listView.getLayoutManager()).L0();
        if (L0 != -1) {
            s4.c1 K = listView.K(L0);
            int top2 = K != null ? K.a.getTop() : -1;
            int paddingTop = listView.getPaddingTop();
            if (top2 == paddingTop && L0 == 0) {
                return;
            }
            iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
            listView.scrollBy(0, i11);
        }
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.w2 w2Var) {
        this.i0 = w2Var;
    }

    public void setChildLayout(rb0 rb0Var) {
        if (this.h0 != rb0Var) {
            this.h0 = rb0Var;
            if (this.k0 && rb0Var != null) {
                org.telegram.ui.t7 t7Var = (org.telegram.ui.t7) rb0Var;
                if (t7Var.getListView() != null) {
                    t7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.g0 = view;
        X();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.k
    public final void m(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
