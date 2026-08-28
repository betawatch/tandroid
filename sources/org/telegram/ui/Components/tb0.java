package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class tb0 extends xu0 implements r0.n, View.OnLayoutChangeListener {
    public final d5.p s0;
    public View t0;
    public sb0 u0;
    public org.telegram.ui.ActionBar.d3 v0;
    public int w0;
    public int x0;
    public boolean y0;

    public tb0(Context context) {
        super(context, null);
        this.s0 = new d5.p();
    }

    public void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
        sb0 sb0Var;
        if (viewGroup != this.t0 || (sb0Var = this.u0) == null || ((org.telegram.ui.r7) sb0Var).getListView() == null) {
            return;
        }
        int top = this.u0.getTop();
        if (i10 >= 0) {
            org.telegram.ui.ActionBar.d3 d3Var = this.v0;
            if (d3Var != null) {
                d3Var.onNestedPreScroll(viewGroup, i9, i10, iArr);
                return;
            }
            return;
        }
        if (top > this.w0) {
            if (this.v0 == null || this.t0.canScrollVertically(i10)) {
                return;
            }
            this.v0.onNestedScroll(viewGroup, 0, 0, i9, i10);
            return;
        }
        wk0 listView = ((org.telegram.ui.r7) this.u0).getListView();
        int L0 = ((f2.m0) listView.getLayoutManager()).L0();
        if (L0 != -1) {
            f2.q1 K = listView.K(L0);
            int top2 = K != null ? K.a.getTop() : -1;
            int paddingTop = listView.getPaddingTop();
            if (top2 == paddingTop && L0 == 0) {
                return;
            }
            iArr[1] = L0 != 0 ? i10 : Math.max(i10, top2 - paddingTop);
            listView.scrollBy(0, i10);
        }
    }

    public final boolean Z() {
        sb0 sb0Var = this.u0;
        return sb0Var != null && sb0Var.getTop() == this.w0;
    }

    public final void a0(sb0 sb0Var, int i9) {
        this.x0 = i9;
        if (this.u0 != sb0Var) {
            this.u0 = sb0Var;
            if (this.y0 && sb0Var != null) {
                org.telegram.ui.r7 r7Var = (org.telegram.ui.r7) sb0Var;
                if (r7Var.getListView() != null) {
                    r7Var.getListView().addOnLayoutChangeListener(this);
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

    @Override // org.telegram.ui.Components.xu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        sb0 sb0Var;
        if (viewGroup != this.t0 || (sb0Var = this.u0) == null || ((org.telegram.ui.r7) sb0Var).getListView() == null) {
            return;
        }
        wk0 listView = ((org.telegram.ui.r7) this.u0).getListView();
        if (this.u0.getTop() == this.w0) {
            iArr[1] = i12;
            listView.scrollBy(0, i12);
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y0 = true;
        sb0 sb0Var = this.u0;
        if (sb0Var != null) {
            sb0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y0 = false;
        sb0 sb0Var = this.u0;
        if (sb0Var != null) {
            sb0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        b0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        b0();
    }

    public void p(int i9, View view) {
        this.s0.a = 0;
        org.telegram.ui.ActionBar.d3 d3Var = this.v0;
        if (d3Var != null) {
            d3Var.onStopNestedScroll(view);
        }
    }

    public boolean q(View view, View view2, int i9, int i10) {
        return view != null && view.isAttachedToWindow() && i9 == 2;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.d3 d3Var) {
        this.v0 = d3Var;
    }

    public void setChildLayout(sb0 sb0Var) {
        a0(sb0Var, 0);
    }

    public void setTargetListView(View view) {
        this.t0 = view;
        b0();
    }

    public void t(View view, View view2, int i9, int i10) {
        this.s0.a = i9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
    }
}
