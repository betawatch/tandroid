package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ja0 extends jl0 {
    public boolean T2;
    public boolean U2;
    public int V2;
    public int W2;
    public final /* synthetic */ ka0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(ka0 ka0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.X2 = ka0Var;
        setOnScrollListener(new h00(this, 1));
        i(new ia0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        ka0 ka0Var = this.X2;
        ka0Var.invalidate();
        ka0Var.b();
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ka0 ka0Var = this.X2;
        rf.v0 v0Var = ka0Var.f;
        rf.a1 a1Var = ka0Var.e;
        if (!ka0Var.c.t ? this.U2 || a1Var == null || a1Var.e == null || !a1Var.f || motionEvent.getY() >= a1Var.e.getBottom() : this.U2 || a1Var == null || a1Var.e == null || !a1Var.f || motionEvent.getY() <= a1Var.e.getTop()) {
            boolean z10 = !this.T2 && org.telegram.ui.ht.q().r(motionEvent, ka0Var.b, null, this.l2);
            if (((v0Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && v0Var.N()) {
                if (v0Var.j0 == null) {
                    vw vwVar = new vw(v0Var, v0Var.f, v0Var.n, v0Var.r, 1);
                    v0Var.j0 = vwVar;
                    vwVar.a();
                }
                v0Var.j0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        ka0 ka0Var = this.X2;
        boolean g10 = ka0Var.g();
        f2.j0 currentLayoutManager = ka0Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i14 = m10.getTop() - (g10 ? 0 : this.W2 - i16);
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (ka0Var.D) {
            ka0Var.C = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            ka0Var.C = false;
            ka0Var.D = false;
        } else if (L0 != -1 && i15 == this.V2 && i16 - this.W2 != 0) {
            ka0Var.C = true;
            currentLayoutManager.i1(L0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            ka0Var.C = false;
        }
        this.W2 = i16;
        this.V2 = i15;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        ka0 ka0Var = this.X2;
        rf.a1 a1Var = ka0Var.e;
        if (a1Var != null) {
            a1Var.d = Integer.valueOf(size);
            org.telegram.ui.op0 op0Var = a1Var.e;
            if (op0Var != null) {
                op0Var.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        ka0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ka0 ka0Var = this.X2;
        rf.a1 a1Var = ka0Var.e;
        if (ka0Var.c.t) {
            if (!this.U2 && a1Var != null && a1Var.e != null && a1Var.f && motionEvent.getY() > a1Var.e.getTop()) {
                return false;
            }
        } else if (!this.U2 && a1Var != null && a1Var.e != null && a1Var.f && motionEvent.getY() < a1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.C) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.jl0, android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        ka0 ka0Var = this.X2;
        ka0Var.invalidate();
        ka0Var.b();
    }
}
