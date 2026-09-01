package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class qc0 extends qv0 implements r0.n, View.OnLayoutChangeListener {
    public final c5.e t0;
    public View u0;
    public pc0 v0;
    public org.telegram.ui.ActionBar.f3 w0;
    public int x0;
    public int y0;
    public boolean z0;

    public qc0(Context context) {
        super(context, null);
        this.t0 = new c5.e();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        pc0 pc0Var;
        if (viewGroup != this.u0 || (pc0Var = this.v0) == null || ((org.telegram.ui.u7) pc0Var).getListView() == null) {
            return;
        }
        int top = this.v0.getTop();
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.f3 f3Var = this.w0;
            if (f3Var != null) {
                f3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
                return;
            }
            return;
        }
        if (top > this.x0) {
            if (this.w0 == null || this.u0.canScrollVertically(i11)) {
                return;
            }
            this.w0.onNestedScroll(viewGroup, 0, 0, i10, i11);
            return;
        }
        tl0 listView = ((org.telegram.ui.u7) this.v0).getListView();
        int L0 = ((f2.j0) listView.getLayoutManager()).L0();
        if (L0 != -1) {
            f2.m1 K = listView.K(L0);
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
        pc0 pc0Var = this.v0;
        return pc0Var != null && pc0Var.getTop() == this.x0;
    }

    public final void a0(pc0 pc0Var, int i10) {
        this.y0 = i10;
        if (this.v0 != pc0Var) {
            this.v0 = pc0Var;
            if (this.z0 && pc0Var != null) {
                org.telegram.ui.u7 u7Var = (org.telegram.ui.u7) pc0Var;
                if (u7Var.getListView() != null) {
                    u7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        b0();
    }

    public final void b0() {
        View view = this.u0;
        if (view == null || this.v0 == null) {
            return;
        }
        if (this.y0 != 0) {
            this.x0 = view.getPaddingTop() + this.y0;
        } else {
            this.x0 = (view.getMeasuredHeight() - this.u0.getPaddingBottom()) - this.v0.getMeasuredHeight();
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        pc0 pc0Var;
        if (viewGroup != this.u0 || (pc0Var = this.v0) == null || ((org.telegram.ui.u7) pc0Var).getListView() == null) {
            return;
        }
        tl0 listView = ((org.telegram.ui.u7) this.v0).getListView();
        if (this.v0.getTop() == this.x0) {
            iArr[1] = i13;
            listView.scrollBy(0, i13);
        }
    }

    public void o(int i10, View view) {
        this.t0.a = 0;
        org.telegram.ui.ActionBar.f3 f3Var = this.w0;
        if (f3Var != null) {
            f3Var.onStopNestedScroll(view);
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z0 = true;
        pc0 pc0Var = this.v0;
        if (pc0Var != null) {
            pc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0 = false;
        pc0 pc0Var = this.v0;
        if (pc0Var != null) {
            pc0Var.removeOnLayoutChangeListener(this);
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

    public boolean p(View view, View view2, int i10, int i11) {
        return view != null && view.isAttachedToWindow() && i10 == 2;
    }

    public void s(View view, View view2, int i10, int i11) {
        this.t0.a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.f3 f3Var) {
        this.w0 = f3Var;
    }

    public void setChildLayout(pc0 pc0Var) {
        a0(pc0Var, 0);
    }

    public void setTargetListView(View view) {
        this.u0 = view;
        b0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
