package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class ed0 extends vw0 implements r0.m, View.OnLayoutChangeListener {
    public final b2.v0 l0;
    public View m0;
    public dd0 n0;
    public org.telegram.ui.ActionBar.h3 o0;
    public int p0;
    public boolean q0;

    public ed0(Context context) {
        super(context, null);
        this.l0 = new b2.v0();
    }

    public final void X() {
        View view = this.m0;
        if (view == null || this.n0 == null) {
            return;
        }
        this.p0 = (view.getMeasuredHeight() - this.m0.getPaddingBottom()) - this.n0.getMeasuredHeight();
    }

    @Override // r0.l
    public final void m(int i10, View view) {
        this.l0.a = 0;
        org.telegram.ui.ActionBar.h3 h3Var = this.o0;
        if (h3Var != null) {
            h3Var.onStopNestedScroll(view);
        }
    }

    @Override // r0.m
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        dd0 dd0Var;
        if (view != this.m0 || (dd0Var = this.n0) == null || ((org.telegram.ui.x7) dd0Var).getListView() == null) {
            return;
        }
        mm0 listView = ((org.telegram.ui.x7) this.n0).getListView();
        if (this.n0.getTop() == this.p0) {
            iArr[1] = i13;
            listView.scrollBy(0, i13);
        }
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q0 = true;
        dd0 dd0Var = this.n0;
        if (dd0Var != null) {
            dd0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q0 = false;
        dd0 dd0Var = this.n0;
        if (dd0Var != null) {
            dd0Var.removeOnLayoutChangeListener(this);
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

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        return view != null && view.isAttachedToWindow() && i10 == 2;
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        this.l0.a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.h3 h3Var) {
        this.o0 = h3Var;
    }

    public void setChildLayout(dd0 dd0Var) {
        if (this.n0 != dd0Var) {
            this.n0 = dd0Var;
            if (this.q0 && dd0Var != null) {
                org.telegram.ui.x7 x7Var = (org.telegram.ui.x7) dd0Var;
                if (x7Var.getListView() != null) {
                    x7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.m0 = view;
        X();
    }

    @Override // r0.l
    public final void t(View view, int i10, int i11, int[] iArr, int i12) {
        dd0 dd0Var;
        if (view != this.m0 || (dd0Var = this.n0) == null || ((org.telegram.ui.x7) dd0Var).getListView() == null) {
            return;
        }
        int top = this.n0.getTop();
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.h3 h3Var = this.o0;
            if (h3Var != null) {
                h3Var.onNestedPreScroll(view, i10, i11, iArr);
                return;
            }
            return;
        }
        if (top > this.p0) {
            if (this.o0 == null || this.m0.canScrollVertically(i11)) {
                return;
            }
            this.o0.onNestedScroll(view, 0, 0, i10, i11);
            return;
        }
        mm0 listView = ((org.telegram.ui.x7) this.n0).getListView();
        int L0 = ((s4.c0) listView.getLayoutManager()).L0();
        if (L0 != -1) {
            s4.e1 K = listView.K(L0);
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
