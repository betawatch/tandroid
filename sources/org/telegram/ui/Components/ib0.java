package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ib0 extends mm0 {
    public boolean Y2;
    public boolean Z2;
    public int a3;
    public int b3;
    public final /* synthetic */ jb0 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib0(jb0 jb0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.c3 = jb0Var;
        setOnScrollListener(new kv(this, 3));
        i(new hb0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        jb0 jb0Var = this.c3;
        jb0Var.invalidate();
        jb0Var.b();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jb0 jb0Var = this.c3;
        hg.j1 j1Var = jb0Var.f;
        hg.p1 p1Var = jb0Var.e;
        if (!jb0Var.c.t ? this.Z2 || p1Var == null || p1Var.e == null || !p1Var.f || motionEvent.getY() >= p1Var.e.getBottom() : this.Z2 || p1Var == null || p1Var.e == null || !p1Var.f || motionEvent.getY() <= p1Var.e.getTop()) {
            boolean z10 = !this.Y2 && org.telegram.ui.ht.o().p(motionEvent, jb0Var.b, null, this.n2);
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
        jb0 jb0Var = this.c3;
        boolean g10 = jb0Var.g();
        s4.b0 currentLayoutManager = jb0Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i14 = m10.getTop() - (g10 ? 0 : this.b3 - i16);
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (jb0Var.H) {
            jb0Var.G = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            jb0Var.G = false;
            jb0Var.H = false;
        } else if (L0 != -1 && i15 == this.a3 && i16 - this.b3 != 0) {
            jb0Var.G = true;
            currentLayoutManager.i1(L0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            jb0Var.G = false;
        }
        this.b3 = i16;
        this.a3 = i15;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        jb0 jb0Var = this.c3;
        hg.p1 p1Var = jb0Var.e;
        if (p1Var != null) {
            p1Var.d = Integer.valueOf(size);
            ai.jc jcVar = p1Var.e;
            if (jcVar != null) {
                jcVar.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        jb0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jb0 jb0Var = this.c3;
        hg.p1 p1Var = jb0Var.e;
        if (jb0Var.c.t) {
            if (!this.Z2 && p1Var != null && p1Var.e != null && p1Var.f && motionEvent.getY() > p1Var.e.getTop()) {
                return false;
            }
        } else if (!this.Z2 && p1Var != null && p1Var.e != null && p1Var.f && motionEvent.getY() < p1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c3.G) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.mm0, android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        jb0 jb0Var = this.c3;
        jb0Var.invalidate();
        jb0Var.b();
    }
}
