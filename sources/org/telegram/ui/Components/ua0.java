package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ua0 extends qt0 implements r0.l, View.OnLayoutChangeListener {
    public final d2.t0 g0;
    public View h0;
    public ta0 i0;
    public org.telegram.ui.ActionBar.q2 j0;
    public int k0;
    public boolean l0;

    public ua0(Context context) {
        super(context, null);
        this.g0 = new d2.t0();
    }

    public final void X() {
        View view = this.h0;
        if (view == null || this.i0 == null) {
            return;
        }
        this.k0 = (view.getMeasuredHeight() - this.h0.getPaddingBottom()) - this.i0.getMeasuredHeight();
    }

    @Override // r0.k
    public final void m(int i3, View view) {
        this.g0.a = 0;
        org.telegram.ui.ActionBar.q2 q2Var = this.j0;
        if (q2Var != null) {
            q2Var.onStopNestedScroll(view);
        }
    }

    @Override // r0.l
    public final void n(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        ta0 ta0Var;
        if (view != this.h0 || (ta0Var = this.i0) == null || ((org.telegram.ui.u7) ta0Var).getListView() == null) {
            return;
        }
        tj0 listView = ((org.telegram.ui.u7) this.i0).getListView();
        if (this.i0.getTop() == this.k0) {
            iArr[1] = i12;
            listView.scrollBy(0, i12);
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l0 = true;
        ta0 ta0Var = this.i0;
        if (ta0Var != null) {
            ta0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l0 = false;
        ta0 ta0Var = this.i0;
        if (ta0Var != null) {
            ta0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        X();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        X();
    }

    @Override // r0.k
    public final boolean p(View view, View view2, int i3, int i10) {
        return view != null && view.isAttachedToWindow() && i3 == 2;
    }

    @Override // r0.k
    public final void s(View view, View view2, int i3, int i10) {
        this.g0.a = i3;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.q2 q2Var) {
        this.j0 = q2Var;
    }

    public void setChildLayout(ta0 ta0Var) {
        if (this.i0 != ta0Var) {
            this.i0 = ta0Var;
            if (this.l0 && ta0Var != null) {
                org.telegram.ui.u7 u7Var = (org.telegram.ui.u7) ta0Var;
                if (u7Var.getListView() != null) {
                    u7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.h0 = view;
        X();
    }

    @Override // r0.k
    public final void t(View view, int i3, int i10, int[] iArr, int i11) {
        ta0 ta0Var;
        if (view != this.h0 || (ta0Var = this.i0) == null || ((org.telegram.ui.u7) ta0Var).getListView() == null) {
            return;
        }
        int top = this.i0.getTop();
        if (i10 >= 0) {
            org.telegram.ui.ActionBar.q2 q2Var = this.j0;
            if (q2Var != null) {
                q2Var.onNestedPreScroll(view, i3, i10, iArr);
                return;
            }
            return;
        }
        if (top > this.k0) {
            if (this.j0 == null || this.h0.canScrollVertically(i10)) {
                return;
            }
            this.j0.onNestedScroll(view, 0, 0, i3, i10);
            return;
        }
        tj0 listView = ((org.telegram.ui.u7) this.i0).getListView();
        int L0 = ((u4.b0) listView.getLayoutManager()).L0();
        if (L0 != -1) {
            u4.d1 K = listView.K(L0);
            int top2 = K != null ? K.a.getTop() : -1;
            int paddingTop = listView.getPaddingTop();
            if (top2 == paddingTop && L0 == 0) {
                return;
            }
            iArr[1] = L0 != 0 ? i10 : Math.max(i10, top2 - paddingTop);
            listView.scrollBy(0, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.k
    public final void o(View view, int i3, int i10, int i11, int i12, int i13) {
    }
}
