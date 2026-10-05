package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class yc0 extends mw0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public boolean B0;
    public final b2.q0 w0;
    public View x0;
    public xc0 y0;
    public org.telegram.ui.ActionBar.d3 z0;

    public yc0(Context context) {
        super(context, null);
        this.w0 = new b2.q0();
    }

    public final void Z() {
        View view = this.x0;
        if (view == null || this.y0 == null) {
            return;
        }
        this.A0 = (view.getMeasuredHeight() - this.x0.getPaddingBottom()) - this.y0.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.mw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // r0.l
    public final void m(int i10, View view) {
        this.w0.a = 0;
        org.telegram.ui.ActionBar.d3 d3Var = this.z0;
        if (d3Var != null) {
            d3Var.onStopNestedScroll(view);
        }
    }

    @Override // r0.m
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        xc0 xc0Var;
        if (view != this.x0 || (xc0Var = this.y0) == null || ((org.telegram.ui.v7) xc0Var).getListView() == null) {
            return;
        }
        zl0 listView = ((org.telegram.ui.v7) this.y0).getListView();
        if (this.y0.getTop() == this.A0) {
            iArr[1] = i13;
            listView.scrollBy(0, i13);
        }
    }

    @Override // org.telegram.ui.Components.mw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0 = true;
        xc0 xc0Var = this.y0;
        if (xc0Var != null) {
            xc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.mw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0 = false;
        xc0 xc0Var = this.y0;
        if (xc0Var != null) {
            xc0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Z();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Z();
    }

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        return view != null && view.isAttachedToWindow() && i10 == 2;
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        this.w0.a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.d3 d3Var) {
        this.z0 = d3Var;
    }

    public void setChildLayout(xc0 xc0Var) {
        if (this.y0 != xc0Var) {
            this.y0 = xc0Var;
            if (this.B0 && xc0Var != null) {
                org.telegram.ui.v7 v7Var = (org.telegram.ui.v7) xc0Var;
                if (v7Var.getListView() != null) {
                    v7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        Z();
    }

    public void setTargetListView(View view) {
        this.x0 = view;
        Z();
    }

    @Override // r0.l
    public final void t(View view, int i10, int i11, int[] iArr, int i12) {
        xc0 xc0Var;
        if (view != this.x0 || (xc0Var = this.y0) == null || ((org.telegram.ui.v7) xc0Var).getListView() == null) {
            return;
        }
        int top = this.y0.getTop();
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.d3 d3Var = this.z0;
            if (d3Var != null) {
                d3Var.onNestedPreScroll(view, i10, i11, iArr);
                return;
            }
            return;
        }
        if (top > this.A0) {
            if (this.z0 == null || this.x0.canScrollVertically(i11)) {
                return;
            }
            this.z0.onNestedScroll(view, 0, 0, i10, i11);
            return;
        }
        zl0 listView = ((org.telegram.ui.v7) this.y0).getListView();
        int L0 = ((s4.c0) listView.getLayoutManager()).L0();
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

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.l
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
