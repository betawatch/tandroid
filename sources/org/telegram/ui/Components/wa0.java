package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wa0 extends vl0 {
    public boolean X2;
    public boolean Y2;
    public int Z2;
    public int a3;
    public final /* synthetic */ xa0 b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa0(xa0 xa0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.b3 = xa0Var;
        setOnScrollListener(new bi.a2(this, 26));
        i(new va0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        xa0 xa0Var = this.b3;
        xa0Var.invalidate();
        xa0Var.b();
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xa0 xa0Var = this.b3;
        fg.l1 l1Var = xa0Var.f;
        fg.r1 r1Var = xa0Var.e;
        if (!xa0Var.c.t ? this.Y2 || r1Var == null || r1Var.e == null || !r1Var.f || motionEvent.getY() >= r1Var.e.getBottom() : this.Y2 || r1Var == null || r1Var.e == null || !r1Var.f || motionEvent.getY() <= r1Var.e.getTop()) {
            boolean z10 = !this.X2 && org.telegram.ui.tt.q().r(motionEvent, xa0Var.b, null, this.p2);
            if (((l1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && l1Var.N()) {
                if (l1Var.n0 == null) {
                    fg.h1 h1Var = new fg.h1(l1Var, l1Var.f, l1Var.n, l1Var.r, 0);
                    l1Var.n0 = h1Var;
                    h1Var.a();
                }
                l1Var.n0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        xa0 xa0Var = this.b3;
        boolean g10 = xa0Var.g();
        s4.c0 currentLayoutManager = xa0Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i14 = m10.getTop() - (g10 ? 0 : this.a3 - i16);
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (xa0Var.H) {
            xa0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            xa0Var.G = false;
            xa0Var.H = false;
        } else if (L0 != -1 && i15 == this.Z2 && i16 - this.a3 != 0) {
            xa0Var.G = true;
            currentLayoutManager.i1(L0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            xa0Var.G = false;
        }
        this.a3 = i16;
        this.Z2 = i15;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        xa0 xa0Var = this.b3;
        fg.r1 r1Var = xa0Var.e;
        if (r1Var != null) {
            r1Var.d = Integer.valueOf(size);
            bi.nc ncVar = r1Var.e;
            if (ncVar != null) {
                ncVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        xa0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xa0 xa0Var = this.b3;
        fg.r1 r1Var = xa0Var.e;
        if (xa0Var.c.t) {
            if (!this.Y2 && r1Var != null && r1Var.e != null && r1Var.f && motionEvent.getY() > r1Var.e.getTop()) {
                return false;
            }
        } else if (!this.Y2 && r1Var != null && r1Var.e != null && r1Var.f && motionEvent.getY() < r1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.vl0, android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        xa0 xa0Var = this.b3;
        xa0Var.invalidate();
        xa0Var.b();
    }
}
