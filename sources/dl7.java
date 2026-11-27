// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class dl7 extends wma implements bl7, View.OnLayoutChangeListener {
    public final l09 g0;
    public View h0;
    public cl7 i0;
    public lx0 j0;
    public int k0;
    public boolean l0;

    public dl7(Context context) {
        super(context, null);
        this.g0 = new l09((byte) 3);
    }

    public final void X() {
        View view = this.h0;
        if (view == null || this.i0 == null) {
            return;
        }
        this.k0 = (view.getMeasuredHeight() - this.h0.getPaddingBottom()) - this.i0.getMeasuredHeight();
    }

    @Override // al7
    public final void k(int i, View view) {
        this.g0.b = 0;
        lx0 lx0Var = this.j0;
        if (lx0Var != null) {
            lx0Var.onStopNestedScroll(view);
        }
    }

    @Override // bl7
    public final void l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        cl7 cl7Var;
        if (view != this.h0 || (cl7Var = this.i0) == null || ((w71) cl7Var).getListView() == null) {
            return;
        }
        d79 listView = ((w71) this.i0).getListView();
        if (this.i0.getTop() == this.k0) {
            iArr[1] = i4;
            listView.scrollBy(0, i4);
        }
    }

    @Override // al7
    public final boolean n(View view, View view2, int i, int i2) {
        return view.isAttachedToWindow() && i == 2;
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l0 = true;
        cl7 cl7Var = this.i0;
        if (cl7Var != null) {
            cl7Var.addOnLayoutChangeListener(this);
        }
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l0 = false;
        cl7 cl7Var = this.i0;
        if (cl7Var != null) {
            cl7Var.removeOnLayoutChangeListener(this);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        X();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        X();
    }

    @Override // al7
    public final void q(View view, View view2, int i, int i2) {
        this.g0.b = i;
    }

    @Override // al7
    public final void r(View view, int i, int i2, int[] iArr, int i3) {
        cl7 cl7Var;
        if (view != this.h0 || (cl7Var = this.i0) == null || ((w71) cl7Var).getListView() == null) {
            return;
        }
        int top = this.i0.getTop();
        if (i2 >= 0) {
            lx0 lx0Var = this.j0;
            if (lx0Var != null) {
                lx0Var.onNestedPreScroll(view, i, i2, iArr);
                return;
            }
            return;
        }
        if (top > this.k0) {
            if (this.j0 == null || this.h0.canScrollVertically(i2)) {
                return;
            }
            this.j0.onNestedScroll(view, 0, 0, i, i2);
            return;
        }
        d79 listView = ((w71) this.i0).getListView();
        int K0 = ((x46) listView.getLayoutManager()).K0();
        if (K0 != -1) {
            f89 L = listView.L(K0);
            int top2 = L != null ? L.a.getTop() : -1;
            int paddingTop = listView.getPaddingTop();
            if (top2 == paddingTop && K0 == 0) {
                return;
            }
            iArr[1] = K0 != 0 ? i2 : Math.max(i2, top2 - paddingTop);
            listView.scrollBy(0, i2);
        }
    }

    public void setBottomSheetContainerView(lx0 lx0Var) {
        this.j0 = lx0Var;
    }

    public void setChildLayout(cl7 cl7Var) {
        if (this.i0 != cl7Var) {
            this.i0 = cl7Var;
            if (this.l0 && cl7Var != null) {
                w71 w71Var = (w71) cl7Var;
                if (w71Var.getListView() != null) {
                    w71Var.getListView().addOnLayoutChangeListener(this);
                }
            }
        }
        X();
    }

    public void setTargetListView(View view) {
        this.h0 = view;
        X();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // al7
    public final void m(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
