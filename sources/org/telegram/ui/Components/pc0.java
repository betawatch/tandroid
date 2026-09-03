package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class pc0 extends qv0 implements r0.n, View.OnLayoutChangeListener {
    public final c5.e t0;
    public View u0;
    public oc0 v0;
    public org.telegram.ui.ActionBar.e3 w0;
    public int x0;
    public int y0;
    public boolean z0;

    public pc0(Context context) {
        super(context, null);
        this.t0 = new c5.e();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        oc0 oc0Var;
        if (viewGroup != this.u0 || (oc0Var = this.v0) == null || ((org.telegram.ui.w7) oc0Var).getListView() == null) {
            return;
        }
        int top = this.v0.getTop();
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.e3 e3Var = this.w0;
            if (e3Var != null) {
                e3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
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
        rl0 listView = ((org.telegram.ui.w7) this.v0).getListView();
        int L0 = ((f2.i0) listView.getLayoutManager()).L0();
        if (L0 != -1) {
            f2.l1 K = listView.K(L0);
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
        oc0 oc0Var = this.v0;
        return oc0Var != null && oc0Var.getTop() == this.x0;
    }

    public final void a0(oc0 oc0Var, int i10) {
        this.y0 = i10;
        if (this.v0 != oc0Var) {
            this.v0 = oc0Var;
            if (this.z0 && oc0Var != null) {
                org.telegram.ui.w7 w7Var = (org.telegram.ui.w7) oc0Var;
                if (w7Var.getListView() != null) {
                    w7Var.getListView().addOnLayoutChangeListener(this);
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

    public void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        oc0 oc0Var;
        if (viewGroup != this.u0 || (oc0Var = this.v0) == null || ((org.telegram.ui.w7) oc0Var).getListView() == null) {
            return;
        }
        rl0 listView = ((org.telegram.ui.w7) this.v0).getListView();
        if (this.v0.getTop() == this.x0) {
            iArr[1] = i13;
            listView.scrollBy(0, i13);
        }
    }

    public void n(int i10, View view) {
        this.t0.a = 0;
        org.telegram.ui.ActionBar.e3 e3Var = this.w0;
        if (e3Var != null) {
            e3Var.onStopNestedScroll(view);
        }
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return view != null && view.isAttachedToWindow() && i10 == 2;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z0 = true;
        oc0 oc0Var = this.v0;
        if (oc0Var != null) {
            oc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.z0 = false;
        oc0 oc0Var = this.v0;
        if (oc0Var != null) {
            oc0Var.removeOnLayoutChangeListener(this);
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

    public void s(View view, View view2, int i10, int i11) {
        this.t0.a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.e3 e3Var) {
        this.w0 = e3Var;
    }

    public void setChildLayout(oc0 oc0Var) {
        a0(oc0Var, 0);
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
