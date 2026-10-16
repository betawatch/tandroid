package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class nb0 extends mm0 {
    public boolean V2;
    public boolean W2;
    public int X2;
    public int Y2;
    public final /* synthetic */ ob0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(ob0 ob0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.Z2 = ob0Var;
        setOnScrollListener(new ah.d0(this, 29));
        i(new mb0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        ob0 ob0Var = this.Z2;
        ob0Var.invalidate();
        ob0Var.b();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ob0 ob0Var = this.Z2;
        hg.j1 j1Var = ob0Var.f;
        hg.p1 p1Var = ob0Var.e;
        if (!ob0Var.c.t ? this.W2 || p1Var == null || p1Var.e == null || !p1Var.f || motionEvent.getY() >= p1Var.e.getBottom() : this.W2 || p1Var == null || p1Var.e == null || !p1Var.f || motionEvent.getY() <= p1Var.e.getTop()) {
            boolean z10 = !this.V2 && org.telegram.ui.xt.q().r(motionEvent, ob0Var.b, null, this.n2);
            if (((j1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && j1Var.N()) {
                if (j1Var.n0 == null) {
                    hg.f1 f1Var = new hg.f1(j1Var, j1Var.f, j1Var.n, j1Var.r, 0);
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
        ob0 ob0Var = this.Z2;
        boolean g10 = ob0Var.g();
        s4.b0 currentLayoutManager = ob0Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i14 = m10.getTop() - (g10 ? 0 : this.Y2 - i16);
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (ob0Var.H) {
            ob0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            ob0Var.G = false;
            ob0Var.H = false;
        } else if (L0 != -1 && i15 == this.X2 && i16 - this.Y2 != 0) {
            ob0Var.G = true;
            currentLayoutManager.i1(L0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            ob0Var.G = false;
        }
        this.Y2 = i16;
        this.X2 = i15;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        ob0 ob0Var = this.Z2;
        hg.p1 p1Var = ob0Var.e;
        if (p1Var != null) {
            p1Var.d = Integer.valueOf(size);
            di.ab abVar = p1Var.e;
            if (abVar != null) {
                abVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        ob0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ob0 ob0Var = this.Z2;
        hg.p1 p1Var = ob0Var.e;
        if (ob0Var.c.t) {
            if (!this.W2 && p1Var != null && p1Var.e != null && p1Var.f && motionEvent.getY() > p1Var.e.getTop()) {
                return false;
            }
        } else if (!this.W2 && p1Var != null && p1Var.e != null && p1Var.f && motionEvent.getY() < p1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Z2.G) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.mm0, android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ob0 ob0Var = this.Z2;
        ob0Var.invalidate();
        ob0Var.b();
    }
}
