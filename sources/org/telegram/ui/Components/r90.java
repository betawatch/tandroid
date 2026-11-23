package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r90 extends ek0 {
    public boolean f3;
    public boolean g3;
    public int h3;
    public int i3;
    public final /* synthetic */ s90 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r90(s90 s90Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.j3 = s90Var;
        setOnScrollListener(new na(this, 12));
        i(new q90(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7) {
        s90 s90Var = this.j3;
        s90Var.invalidate();
        s90Var.b();
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        s90 s90Var = this.j3;
        jg.h1 h1Var = s90Var.f;
        jg.n1 n1Var = s90Var.e;
        if (!s90Var.c.t ? this.g3 || n1Var == null || n1Var.e == null || !n1Var.f || motionEvent.getY() >= n1Var.e.getBottom() : this.g3 || n1Var == null || n1Var.e == null || !n1Var.f || motionEvent.getY() <= n1Var.e.getTop()) {
            boolean z10 = !this.f3 && org.telegram.ui.ns.p().q(motionEvent, s90Var.b, null, this.o2);
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

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i7;
        int i15 = i12 - i10;
        s90 s90Var = this.j3;
        boolean g10 = s90Var.g();
        v4.c0 currentLayoutManager = s90Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i13 = m10.getTop() - (g10 ? 0 : this.i3 - i15);
        } else {
            i13 = 0;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        if (s90Var.I) {
            s90Var.H = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i7, i10, i11, i12);
            s90Var.H = false;
            s90Var.I = false;
        } else if (L0 != -1 && i14 == this.h3 && i15 - this.i3 != 0) {
            s90Var.H = true;
            currentLayoutManager.i1(L0, i13, false);
            super.onLayout(false, i7, i10, i11, i12);
            s90Var.H = false;
        }
        this.i3 = i15;
        this.h3 = i14;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        s90 s90Var = this.j3;
        jg.n1 n1Var = s90Var.e;
        if (n1Var != null) {
            n1Var.d = Integer.valueOf(size);
            bi.o3 o3Var = n1Var.e;
            if (o3Var != null) {
                o3Var.requestLayout();
            }
        }
        float min = (int) Math.min(org.telegram.messenger.g0.L(126.0f), org.telegram.messenger.g0.q.y * 0.22f);
        s90Var.w = min;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s90 s90Var = this.j3;
        jg.n1 n1Var = s90Var.e;
        if (s90Var.c.t) {
            if (!this.g3 && n1Var != null && n1Var.e != null && n1Var.f && motionEvent.getY() > n1Var.e.getTop()) {
                return false;
            }
        } else if (!this.g3 && n1Var != null && n1Var.e != null && n1Var.f && motionEvent.getY() < n1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.j3.H) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ek0, android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        s90 s90Var = this.j3;
        s90Var.invalidate();
        s90Var.b();
    }
}
