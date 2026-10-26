package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fb0 extends mm0 {
    public boolean f3;
    public boolean g3;
    public int h3;
    public int i3;
    public final /* synthetic */ gb0 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(gb0 gb0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.j3 = gb0Var;
        setOnScrollListener(new ml(this, 7));
        i(new eb0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        gb0 gb0Var = this.j3;
        gb0Var.invalidate();
        gb0Var.b();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gb0 gb0Var = this.j3;
        ig.j1 j1Var = gb0Var.f;
        ig.p1 p1Var = gb0Var.e;
        if (!gb0Var.c.t ? this.g3 || p1Var == null || p1Var.e == null || !p1Var.f || motionEvent.getY() >= p1Var.e.getBottom() : this.g3 || p1Var == null || p1Var.e == null || !p1Var.f || motionEvent.getY() <= p1Var.e.getTop()) {
            boolean z10 = !this.f3 && org.telegram.ui.ft.o().p(motionEvent, gb0Var.b, null, this.n2);
            if (((j1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && j1Var.N()) {
                if (j1Var.n0 == null) {
                    ig.f1 f1Var = new ig.f1(j1Var, j1Var.f, j1Var.n, j1Var.r, 0);
                    j1Var.n0 = f1Var;
                    f1Var.a();
                }
                j1Var.n0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        gb0 gb0Var = this.j3;
        boolean g7 = gb0Var.g();
        s4.c0 currentLayoutManager = gb0Var.getCurrentLayoutManager();
        int L0 = g7 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i14 = m10.getTop() - (g7 ? 0 : this.i3 - i16);
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (gb0Var.H) {
            gb0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            gb0Var.G = false;
            gb0Var.H = false;
        } else if (L0 != -1 && i15 == this.h3 && i16 - this.i3 != 0) {
            gb0Var.G = true;
            currentLayoutManager.i1(L0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            gb0Var.G = false;
        }
        this.i3 = i16;
        this.h3 = i15;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        gb0 gb0Var = this.j3;
        ig.p1 p1Var = gb0Var.e;
        if (p1Var != null) {
            p1Var.d = Integer.valueOf(size);
            bi.cc ccVar = p1Var.e;
            if (ccVar != null) {
                ccVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        gb0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gb0 gb0Var = this.j3;
        ig.p1 p1Var = gb0Var.e;
        if (gb0Var.c.t) {
            if (!this.g3 && p1Var != null && p1Var.e != null && p1Var.f && motionEvent.getY() > p1Var.e.getTop()) {
                return false;
            }
        } else if (!this.g3 && p1Var != null && p1Var.e != null && p1Var.f && motionEvent.getY() < p1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.j3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.mm0, android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        gb0 gb0Var = this.j3;
        gb0Var.invalidate();
        gb0Var.b();
    }
}
