package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class va0 extends wl0 {
    public boolean X2;
    public boolean Y2;
    public int Z2;
    public int a3;
    public final /* synthetic */ wa0 b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(wa0 wa0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.b3 = wa0Var;
        setOnScrollListener(new ai.r(this, 29));
        i(new ua0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10, int i11) {
        wa0 wa0Var = this.b3;
        wa0Var.invalidate();
        wa0Var.b();
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wa0 wa0Var = this.b3;
        gg.k1 k1Var = wa0Var.f;
        gg.q1 q1Var = wa0Var.e;
        if (!wa0Var.c.t ? this.Y2 || q1Var == null || q1Var.e == null || !q1Var.f || motionEvent.getY() >= q1Var.e.getBottom() : this.Y2 || q1Var == null || q1Var.e == null || !q1Var.f || motionEvent.getY() <= q1Var.e.getTop()) {
            boolean z10 = !this.X2 && org.telegram.ui.st.q().r(motionEvent, wa0Var.b, null, this.p2);
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

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        wa0 wa0Var = this.b3;
        boolean g10 = wa0Var.g();
        s4.c0 currentLayoutManager = wa0Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i14 = m10.getTop() - (g10 ? 0 : this.a3 - i16);
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (wa0Var.H) {
            wa0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            wa0Var.G = false;
            wa0Var.H = false;
        } else if (L0 != -1 && i15 == this.Z2 && i16 - this.a3 != 0) {
            wa0Var.G = true;
            currentLayoutManager.i1(L0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            wa0Var.G = false;
        }
        this.a3 = i16;
        this.Z2 = i15;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        wa0 wa0Var = this.b3;
        gg.q1 q1Var = wa0Var.e;
        if (q1Var != null) {
            q1Var.d = Integer.valueOf(size);
            ci.eb ebVar = q1Var.e;
            if (ebVar != null) {
                ebVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        wa0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wa0 wa0Var = this.b3;
        gg.q1 q1Var = wa0Var.e;
        if (wa0Var.c.t) {
            if (!this.Y2 && q1Var != null && q1Var.e != null && q1Var.f && motionEvent.getY() > q1Var.e.getTop()) {
                return false;
            }
        } else if (!this.Y2 && q1Var != null && q1Var.e != null && q1Var.f && motionEvent.getY() < q1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.wl0, android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        wa0 wa0Var = this.b3;
        wa0Var.invalidate();
        wa0Var.b();
    }
}
