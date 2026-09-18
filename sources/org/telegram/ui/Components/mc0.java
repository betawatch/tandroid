package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class mc0 extends qv0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public boolean B0;
    public final b2.q0 w0;
    public View x0;
    public lc0 y0;
    public org.telegram.ui.ActionBar.e3 z0;

    public mc0(Context context) {
        super(context, null);
        this.w0 = new b2.q0();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        lc0 lc0Var;
        if (viewGroup != this.x0 || (lc0Var = this.y0) == null || ((org.telegram.ui.u7) lc0Var).getListView() == null) {
            return;
        }
        int top = this.y0.getTop();
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.e3 e3Var = this.z0;
            if (e3Var != null) {
                e3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
                return;
            }
            return;
        }
        if (top > this.A0) {
            if (this.z0 == null || this.x0.canScrollVertically(i11)) {
                return;
            }
            this.z0.onNestedScroll(viewGroup, 0, 0, i10, i11);
            return;
        }
        ml0 listView = ((org.telegram.ui.u7) this.y0).getListView();
        int L0 = ((s4.c0) listView.getLayoutManager()).L0();
        if (L0 != -1) {
            s4.c1 L = listView.L(L0);
            int top2 = L != null ? L.a.getTop() : -1;
            int paddingTop = listView.getPaddingTop();
            if (top2 == paddingTop && L0 == 0) {
                return;
            }
            iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
            listView.scrollBy(0, i11);
        }
    }

    public final void Z() {
        View view = this.x0;
        if (view == null || this.y0 == null) {
            return;
        }
        this.A0 = (view.getMeasuredHeight() - this.x0.getPaddingBottom()) - this.y0.getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        lc0 lc0Var;
        if (viewGroup != this.x0 || (lc0Var = this.y0) == null || ((org.telegram.ui.u7) lc0Var).getListView() == null) {
            return;
        }
        ml0 listView = ((org.telegram.ui.u7) this.y0).getListView();
        if (this.y0.getTop() == this.A0) {
            iArr[1] = i13;
            listView.scrollBy(0, i13);
        }
    }

    public void o(int i10, View view) {
        this.w0.a = 0;
        org.telegram.ui.ActionBar.e3 e3Var = this.z0;
        if (e3Var != null) {
            e3Var.onStopNestedScroll(view);
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0 = true;
        lc0 lc0Var = this.y0;
        if (lc0Var != null) {
            lc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0 = false;
        lc0 lc0Var = this.y0;
        if (lc0Var != null) {
            lc0Var.removeOnLayoutChangeListener(this);
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

    public boolean p(View view, View view2, int i10, int i11) {
        return view != null && view.isAttachedToWindow() && i10 == 2;
    }

    public void s(View view, View view2, int i10, int i11) {
        this.w0.a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.e3 e3Var) {
        this.z0 = e3Var;
    }

    public void setChildLayout(lc0 lc0Var) {
        if (this.y0 != lc0Var) {
            this.y0 = lc0Var;
            if (this.B0 && lc0Var != null) {
                org.telegram.ui.u7 u7Var = (org.telegram.ui.u7) lc0Var;
                if (u7Var.getListView() != null) {
                    u7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        Z();
    }

    public void setTargetListView(View view) {
        this.x0 = view;
        Z();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
    }

    public void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
