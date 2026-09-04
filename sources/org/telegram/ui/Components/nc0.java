package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class nc0 extends ov0 implements r0.m, View.OnLayoutChangeListener {
    public int A0;
    public int B0;
    public boolean C0;
    public final b2.q0 w0;
    public View x0;
    public mc0 y0;
    public org.telegram.ui.ActionBar.d3 z0;

    public nc0(Context context) {
        super(context, null);
        this.w0 = new b2.q0();
    }

    public void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        mc0 mc0Var;
        if (viewGroup != this.x0 || (mc0Var = this.y0) == null || ((org.telegram.ui.s7) mc0Var).getListView() == null) {
            return;
        }
        int top = this.y0.getTop();
        if (i11 >= 0) {
            org.telegram.ui.ActionBar.d3 d3Var = this.z0;
            if (d3Var != null) {
                d3Var.onNestedPreScroll(viewGroup, i10, i11, iArr);
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
        ll0 listView = ((org.telegram.ui.s7) this.y0).getListView();
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

    public final boolean Z() {
        mc0 mc0Var = this.y0;
        return mc0Var != null && mc0Var.getTop() == this.A0;
    }

    public final void a0(mc0 mc0Var, int i10) {
        this.B0 = i10;
        if (this.y0 != mc0Var) {
            this.y0 = mc0Var;
            if (this.C0 && mc0Var != null) {
                org.telegram.ui.s7 s7Var = (org.telegram.ui.s7) mc0Var;
                if (s7Var.getListView() != null) {
                    s7Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        b0();
    }

    public final void b0() {
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

    @Override // org.telegram.ui.Components.ov0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        mc0 mc0Var;
        if (viewGroup != this.x0 || (mc0Var = this.y0) == null || ((org.telegram.ui.s7) mc0Var).getListView() == null) {
            return;
        }
        ll0 listView = ((org.telegram.ui.s7) this.y0).getListView();
        if (this.y0.getTop() == this.A0) {
            iArr[1] = i13;
            listView.scrollBy(0, i13);
        }
    }

    public void n(int i10, View view) {
        this.w0.a = 0;
        org.telegram.ui.ActionBar.d3 d3Var = this.z0;
        if (d3Var != null) {
            d3Var.onStopNestedScroll(view);
        }
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C0 = true;
        mc0 mc0Var = this.y0;
        if (mc0Var != null) {
            mc0Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C0 = false;
        mc0 mc0Var = this.y0;
        if (mc0Var != null) {
            mc0Var.removeOnLayoutChangeListener(this);
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
        this.w0.a = i10;
    }

    public void setBottomSheetContainerView(org.telegram.ui.ActionBar.d3 d3Var) {
        this.z0 = d3Var;
    }

    public void setChildLayout(mc0 mc0Var) {
        a0(mc0Var, 0);
    }

    public void setTargetListView(View view) {
        this.x0 = view;
        b0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
    }

    public void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
