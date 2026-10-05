package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ab0 extends zl0 {
    public boolean e3;
    public boolean f3;
    public int g3;
    public int h3;
    public final /* synthetic */ bb0 i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(bb0 bb0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.i3 = bb0Var;
        setOnScrollListener(new ai.r(this, 29));
        i(new za0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        bb0 bb0Var = this.i3;
        bb0Var.invalidate();
        bb0Var.b();
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        bb0 bb0Var = this.i3;
        gg.k1 k1Var = bb0Var.f;
        gg.q1 q1Var = bb0Var.e;
        if (!bb0Var.c.t ? this.f3 || q1Var == null || q1Var.e == null || !q1Var.f || motionEvent.getY() >= q1Var.e.getBottom() : this.f3 || q1Var == null || q1Var.e == null || !q1Var.f || motionEvent.getY() <= q1Var.e.getTop()) {
            boolean z10 = !this.e3 && org.telegram.ui.rt.q().r(motionEvent, bb0Var.b, null, this.p2);
            if (((k1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && k1Var.N()) {
                if (k1Var.n0 == null) {
                    gg.g1 g1Var = new gg.g1(k1Var, k1Var.f, k1Var.n, k1Var.r, 0);
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

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        bb0 bb0Var = this.i3;
        boolean g10 = bb0Var.g();
        s4.c0 currentLayoutManager = bb0Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i14 = m10.getTop() - (g10 ? 0 : this.h3 - i16);
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (bb0Var.H) {
            bb0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            bb0Var.G = false;
            bb0Var.H = false;
        } else if (L0 != -1 && i15 == this.g3 && i16 - this.h3 != 0) {
            bb0Var.G = true;
            currentLayoutManager.i1(L0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            bb0Var.G = false;
        }
        this.h3 = i16;
        this.g3 = i15;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        bb0 bb0Var = this.i3;
        gg.q1 q1Var = bb0Var.e;
        if (q1Var != null) {
            q1Var.d = Integer.valueOf(size);
            ci.ab abVar = q1Var.e;
            if (abVar != null) {
                abVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        bb0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bb0 bb0Var = this.i3;
        gg.q1 q1Var = bb0Var.e;
        if (bb0Var.c.t) {
            if (!this.f3 && q1Var != null && q1Var.e != null && q1Var.f && motionEvent.getY() > q1Var.e.getTop()) {
                return false;
            }
        } else if (!this.f3 && q1Var != null && q1Var.e != null && q1Var.f && motionEvent.getY() < q1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.i3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.zl0, android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        bb0 bb0Var = this.i3;
        bb0Var.invalidate();
        bb0Var.b();
    }
}
