package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ob0 extends qm0 {
    public boolean V2;
    public boolean W2;
    public int X2;
    public int Y2;
    public final /* synthetic */ pb0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob0(pb0 pb0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.Z2 = pb0Var;
        setOnScrollListener(new ai.r(this, 28));
        i(new nb0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        pb0 pb0Var = this.Z2;
        pb0Var.invalidate();
        pb0Var.b();
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        pb0 pb0Var = this.Z2;
        gg.j1 j1Var = pb0Var.f;
        gg.p1 p1Var = pb0Var.e;
        if (!pb0Var.c.t ? this.W2 || p1Var == null || p1Var.e == null || !p1Var.f || motionEvent.getY() >= p1Var.e.getBottom() : this.W2 || p1Var == null || p1Var.e == null || !p1Var.f || motionEvent.getY() <= p1Var.e.getTop()) {
            boolean z10 = !this.V2 && org.telegram.ui.rt.q().r(motionEvent, pb0Var.b, null, this.n2);
            if (((j1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && j1Var.N()) {
                if (j1Var.n0 == null) {
                    gg.f1 f1Var = new gg.f1(j1Var, j1Var.f, j1Var.n, j1Var.r, 0);
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

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        pb0 pb0Var = this.Z2;
        boolean g10 = pb0Var.g();
        s4.d0 currentLayoutManager = pb0Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i14 = m10.getTop() - (g10 ? 0 : this.Y2 - i16);
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (pb0Var.H) {
            pb0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            pb0Var.G = false;
            pb0Var.H = false;
        } else if (L0 != -1 && i15 == this.X2 && i16 - this.Y2 != 0) {
            pb0Var.G = true;
            currentLayoutManager.i1(L0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            pb0Var.G = false;
        }
        this.Y2 = i16;
        this.X2 = i15;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        pb0 pb0Var = this.Z2;
        gg.p1 p1Var = pb0Var.e;
        if (p1Var != null) {
            p1Var.d = Integer.valueOf(size);
            ci.bb bbVar = p1Var.e;
            if (bbVar != null) {
                bbVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        pb0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pb0 pb0Var = this.Z2;
        gg.p1 p1Var = pb0Var.e;
        if (pb0Var.c.t) {
            if (!this.W2 && p1Var != null && p1Var.e != null && p1Var.f && motionEvent.getY() > p1Var.e.getTop()) {
                return false;
            }
        } else if (!this.W2 && p1Var != null && p1Var.e != null && p1Var.f && motionEvent.getY() < p1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Z2.G) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.qm0, android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        pb0 pb0Var = this.Z2;
        pb0Var.invalidate();
        pb0Var.b();
    }
}
