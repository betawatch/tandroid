package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class s90 extends ck0 {
    public boolean f3;
    public boolean g3;
    public int h3;
    public int i3;
    public final /* synthetic */ t90 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s90(t90 t90Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.j3 = t90Var;
        setOnScrollListener(new oa(this, 12));
        i(new r90(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        t90 t90Var = this.j3;
        t90Var.invalidate();
        t90Var.b();
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        t90 t90Var = this.j3;
        jg.h1 h1Var = t90Var.f;
        jg.n1 n1Var = t90Var.e;
        if (!t90Var.c.t ? this.g3 || n1Var == null || n1Var.e == null || !n1Var.f || motionEvent.getY() >= n1Var.e.getBottom() : this.g3 || n1Var == null || n1Var.e == null || !n1Var.f || motionEvent.getY() <= n1Var.e.getTop()) {
            boolean z10 = !this.f3 && org.telegram.ui.ns.p().q(motionEvent, t90Var.b, null, this.o2);
            if (((h1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && h1Var.N()) {
                if (h1Var.o0 == null) {
                    jg.d1 d1Var = new jg.d1(h1Var, h1Var.f, h1Var.n, h1Var.r, 0);
                    h1Var.o0 = d1Var;
                    d1Var.a();
                }
                h1Var.o0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i7;
        int i15 = i12 - i10;
        t90 t90Var = this.j3;
        boolean g10 = t90Var.g();
        v4.c0 currentLayoutManager = t90Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i13 = m10.getTop() - (g10 ? 0 : this.i3 - i15);
        } else {
            i13 = 0;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        if (t90Var.I) {
            t90Var.H = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i7, i10, i11, i12);
            t90Var.H = false;
            t90Var.I = false;
        } else if (L0 != -1 && i14 == this.h3 && i15 - this.i3 != 0) {
            t90Var.H = true;
            currentLayoutManager.i1(L0, i13, false);
            super.onLayout(false, i7, i10, i11, i12);
            t90Var.H = false;
        }
        this.i3 = i15;
        this.h3 = i14;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        t90 t90Var = this.j3;
        jg.n1 n1Var = t90Var.e;
        if (n1Var != null) {
            n1Var.d = Integer.valueOf(size);
            bi.i3 i3Var = n1Var.e;
            if (i3Var != null) {
                i3Var.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.q.y * 0.22f);
        t90Var.w = min;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t90 t90Var = this.j3;
        jg.n1 n1Var = t90Var.e;
        if (t90Var.c.t) {
            if (!this.g3 && n1Var != null && n1Var.e != null && n1Var.f && motionEvent.getY() > n1Var.e.getTop()) {
                return false;
            }
        } else if (!this.g3 && n1Var != null && n1Var.e != null && n1Var.f && motionEvent.getY() < n1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.j3.H) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ck0, android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        t90 t90Var = this.j3;
        t90Var.invalidate();
        t90Var.b();
    }
}
