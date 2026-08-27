package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class xb0 extends zu0 implements r0.n, View.OnLayoutChangeListener {
    public final d5.p s0;
    public View t0;
    public wb0 u0;
    public org.telegram.ui.ActionBar.c3 v0;
    public int w0;
    public int x0;
    public boolean y0;

    public xb0(Context context) {
        super(context, null);
        this.s0 = new d5.p();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        wb0 wb0Var;
        if (viewGroup != this.t0 || (wb0Var = this.u0) == null || ((org.telegram.ui.s7) wb0Var).getListView() == null) {
            return;
        }
        int top = this.u0.getTop();
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.c3 c3Var = this.v0;
            if (c3Var != null) {
                c3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
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
        zk0 listView = ((org.telegram.ui.s7) this.u0).getListView();
        int L0 = ((f2.k0) listView.getLayoutManager()).L0();
        if (L0 != -1) {
            f2.o1 K = listView.K(L0);
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
        wb0 wb0Var = this.u0;
        return wb0Var != null && wb0Var.getTop() == this.w0;
    }

    public final void a0(wb0 wb0Var, int i10) {
        this.x0 = i10;
        if (this.u0 != wb0Var) {
            this.u0 = wb0Var;
            if (this.y0 && wb0Var != null) {
                org.telegram.ui.s7 s7Var = (org.telegram.ui.s7) wb0Var;
                if (s7Var.getListView() != null) {
                    s7Var.getListView().addOnLayoutChangeListener(this);
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

    @Override // org.telegram.ui.Components.zu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        wb0 wb0Var;
        if (viewGroup != this.t0 || (wb0Var = this.u0) == null || ((org.telegram.ui.s7) wb0Var).getListView() == null) {
            return;
        }
        zk0 listView = ((org.telegram.ui.s7) this.u0).getListView();
        if (this.u0.getTop() == this.w0) {
            iArr[1] = i13;
            listView.scrollBy(0, i13);
        }
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y0 = true;
        wb0 wb0Var = this.u0;
        if (wb0Var != null) {
            wb0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y0 = false;
        wb0 wb0Var = this.u0;
        if (wb0Var != null) {
            wb0Var.removeOnLayoutChangeListener(this);
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

    public void p(int i10, View view) {
        this.s0.a = 0;
        org.telegram.ui.ActionBar.c3 c3Var = this.v0;
        if (c3Var != null) {
            c3Var.onStopNestedScroll(view);
        }
    }

    public boolean q(View view, View view2, int i10, int i11) {
        return view != null && view.isAttachedToWindow() && i10 == 2;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.c3 c3Var) {
        this.v0 = c3Var;
    }

    public void setChildLayout(wb0 wb0Var) {
        a0(wb0Var, 0);
    }

    public void setTargetListView(View view) {
        this.t0 = view;
        b0();
    }

    public void t(View view, View view2, int i10, int i11) {
        this.s0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
    }

    public void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
