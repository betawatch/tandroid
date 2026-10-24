package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class id0 extends ow0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public int B0;
    public boolean C0;
    public final b2.u0 w0;
    public View x0;
    public hd0 y0;
    public org.telegram.ui.ActionBar.e3 z0;

    public id0(Context context) {
        super(context, null);
        this.w0 = new b2.u0();
    }

    public void D(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        hd0 hd0Var;
        if (viewGroup != this.x0 || (hd0Var = this.y0) == null || ((org.telegram.ui.v7) hd0Var).getListView() == null) {
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
        mm0 listView = ((org.telegram.ui.v7) this.y0).getListView();
        int L0 = ((s4.b0) listView.getLayoutManager()).L0();
        if (L0 != -1) {
            s4.b1 K = listView.K(L0);
            int top2 = K != null ? K.a.getTop() : -1;
            int paddingTop = listView.getPaddingTop();
            if (top2 == paddingTop && L0 == 0) {
                return;
            }
            iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
            listView.scrollBy(0, i11);
        }
    }

    public final boolean Y() {
        hd0 hd0Var = this.y0;
        return hd0Var != null && hd0Var.getTop() == this.A0;
    }

    public final void Z(hd0 hd0Var, int i10) {
        this.B0 = i10;
        if (this.y0 != hd0Var) {
            this.y0 = hd0Var;
            if (this.C0 && hd0Var != null) {
                org.telegram.ui.v7 v7Var = (org.telegram.ui.v7) hd0Var;
                if (v7Var.getListView() != null) {
                    v7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        a0();
    }

    public final void a0() {
        View view = this.x0;
        if (view == null || this.y0 == null) {
            return;
        }
        if (this.B0 != 0) {
            this.A0 = view.getPaddingTop() + this.B0;
        } else {
            this.A0 = (view.getMeasuredHeight() - this.x0.getPaddingBottom()) - this.y0.getMeasuredHeight();
        }
    }

    public void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        hd0 hd0Var;
        if (viewGroup != this.x0 || (hd0Var = this.y0) == null || ((org.telegram.ui.v7) hd0Var).getListView() == null) {
            return;
        }
        mm0 listView = ((org.telegram.ui.v7) this.y0).getListView();
        if (this.y0.getTop() == this.A0) {
            iArr[1] = i13;
            listView.scrollBy(0, i13);
        }
    }

    public void m(int i10, View view) {
        this.w0.a = 0;
        org.telegram.ui.ActionBar.e3 e3Var = this.z0;
        if (e3Var != null) {
            e3Var.onStopNestedScroll(view);
        }
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return view != null && view.isAttachedToWindow() && i10 == 2;
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        hd0 hd0Var = this.y0;
        if (hd0Var != null) {
            hd0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        hd0 hd0Var = this.y0;
        if (hd0Var != null) {
            hd0Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        a0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        a0();
    }

    public void r(View view, View view2, int i10, int i11) {
        this.w0.a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.e3 e3Var) {
        this.z0 = e3Var;
    }

    public void setChildLayout(hd0 hd0Var) {
        Z(hd0Var, 0);
    }

    public void setTargetListView(View view) {
        this.x0 = view;
        a0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
    }

    public void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
