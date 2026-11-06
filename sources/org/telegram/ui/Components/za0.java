package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class za0 extends rt0 implements r0.l, View.OnLayoutChangeListener {
    public final e2.r0 f0;
    public View g0;
    public ya0 h0;
    public org.telegram.ui.ActionBar.s2 i0;
    public int j0;
    public boolean k0;

    public za0(Context context) {
        super(context, null);
        this.f0 = new e2.r0();
    }

    public final void X() {
        View view = this.g0;
        if (view == null || this.h0 == null) {
            return;
        }
        this.j0 = (view.getMeasuredHeight() - this.g0.getPaddingBottom()) - this.h0.getMeasuredHeight();
    }

    @Override // r0.k
    public final void k(int i7, View view) {
        this.f0.a = 0;
        org.telegram.ui.ActionBar.s2 s2Var = this.i0;
        if (s2Var != null) {
            s2Var.onStopNestedScroll(view);
        }
    }

    @Override // r0.l
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        ya0 ya0Var;
        if (view != this.g0 || (ya0Var = this.h0) == null || ((org.telegram.ui.t7) ya0Var).getListView() == null) {
            return;
        }
        pj0 listView = ((org.telegram.ui.t7) this.h0).getListView();
        if (this.h0.getTop() == this.j0) {
            iArr[1] = i12;
            listView.scrollBy(0, i12);
        }
    }

    @Override // r0.k
    public final boolean o(View view, View view2, int i7, int i10) {
        return view != null && view.isAttachedToWindow() && i7 == 2;
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k0 = true;
        ya0 ya0Var = this.h0;
        if (ya0Var != null) {
            ya0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.k0 = false;
        ya0 ya0Var = this.h0;
        if (ya0Var != null) {
            ya0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        X();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        X();
    }

    @Override // r0.k
    public final void r(View view, View view2, int i7, int i10) {
        this.f0.a = i7;
    }

    @Override // r0.k
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        ya0 ya0Var;
        if (view != this.g0 || (ya0Var = this.h0) == null || ((org.telegram.ui.t7) ya0Var).getListView() == null) {
            return;
        }
        int top = this.h0.getTop();
        if (i10 >= 0) {
            org.telegram.ui.ActionBar.s2 s2Var = this.i0;
            if (s2Var != null) {
                s2Var.onNestedPreScroll(view, i7, i10, iArr);
                return;
            }
            return;
        }
        if (top > this.j0) {
            if (this.i0 == null || this.g0.canScrollVertically(i10)) {
                return;
            }
            this.i0.onNestedScroll(view, 0, 0, i7, i10);
            return;
        }
        pj0 listView = ((org.telegram.ui.t7) this.h0).getListView();
        int L0 = ((v4.b0) listView.getLayoutManager()).L0();
        if (L0 != -1) {
            v4.d1 K = listView.K(L0);
            int top2 = K != null ? K.a.getTop() : -1;
            int paddingTop = listView.getPaddingTop();
            if (top2 == paddingTop && L0 == 0) {
                return;
            }
            iArr[1] = L0 != 0 ? i10 : Math.max(i10, top2 - paddingTop);
            listView.scrollBy(0, i10);
        }
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.s2 s2Var) {
        this.i0 = s2Var;
    }

    public void setChildLayout(ya0 ya0Var) {
        if (this.h0 != ya0Var) {
            this.h0 = ya0Var;
            if (this.k0 && ya0Var != null) {
                org.telegram.ui.t7 t7Var = (org.telegram.ui.t7) ya0Var;
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
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
