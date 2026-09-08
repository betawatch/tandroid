package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class na0 extends ll0 {
    public boolean X2;
    public boolean Y2;
    public int Z2;
    public int a3;
    public final /* synthetic */ oa0 b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na0(oa0 oa0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.b3 = oa0Var;
        setOnScrollListener(new ah.e0(this, 29));
        i(new ma0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        oa0 oa0Var = this.b3;
        oa0Var.invalidate();
        oa0Var.b();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        oa0 oa0Var = this.b3;
        hg.k1 k1Var = oa0Var.f;
        hg.q1 q1Var = oa0Var.e;
        if (!oa0Var.c.t ? this.Y2 || q1Var == null || q1Var.e == null || !q1Var.f || motionEvent.getY() >= q1Var.e.getBottom() : this.Y2 || q1Var == null || q1Var.e == null || !q1Var.f || motionEvent.getY() <= q1Var.e.getTop()) {
            boolean z10 = !this.X2 && org.telegram.ui.st.q().r(motionEvent, oa0Var.b, null, this.p2);
            if (((k1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && k1Var.N()) {
                if (k1Var.n0 == null) {
                    hg.g1 g1Var = new hg.g1(k1Var, k1Var.f, k1Var.n, k1Var.r, 0);
                    k1Var.n0 = g1Var;
                    g1Var.a();
                }
                k1Var.n0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        oa0 oa0Var = this.b3;
        boolean g10 = oa0Var.g();
        s4.c0 currentLayoutManager = oa0Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i14 = m10.getTop() - (g10 ? 0 : this.a3 - i16);
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (oa0Var.H) {
            oa0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            oa0Var.G = false;
            oa0Var.H = false;
        } else if (L0 != -1 && i15 == this.Z2 && i16 - this.a3 != 0) {
            oa0Var.G = true;
            currentLayoutManager.i1(L0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            oa0Var.G = false;
        }
        this.a3 = i16;
        this.Z2 = i15;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        oa0 oa0Var = this.b3;
        hg.q1 q1Var = oa0Var.e;
        if (q1Var != null) {
            q1Var.d = Integer.valueOf(size);
            di.eb ebVar = q1Var.e;
            if (ebVar != null) {
                ebVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        oa0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        oa0 oa0Var = this.b3;
        hg.q1 q1Var = oa0Var.e;
        if (oa0Var.c.t) {
            if (!this.Y2 && q1Var != null && q1Var.e != null && q1Var.f && motionEvent.getY() > q1Var.e.getTop()) {
                return false;
            }
        } else if (!this.Y2 && q1Var != null && q1Var.e != null && q1Var.f && motionEvent.getY() < q1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ll0, android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        oa0 oa0Var = this.b3;
        oa0Var.invalidate();
        oa0Var.b();
    }
}
