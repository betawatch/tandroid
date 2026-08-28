package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v90 extends wk0 {
    public boolean T2;
    public boolean U2;
    public int V2;
    public int W2;
    public final /* synthetic */ w90 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v90(w90 w90Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.X2 = w90Var;
        setOnScrollListener(new kn(this, 5));
        i(new u90(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i9, int i10) {
        w90 w90Var = this.X2;
        w90Var.invalidate();
        w90Var.b();
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        w90 w90Var = this.X2;
        of.f1 f1Var = w90Var.f;
        of.k1 k1Var = w90Var.e;
        if (!w90Var.c.t ? this.U2 || k1Var == null || k1Var.e == null || !k1Var.f || motionEvent.getY() >= k1Var.e.getBottom() : this.U2 || k1Var == null || k1Var.e == null || !k1Var.f || motionEvent.getY() <= k1Var.e.getTop()) {
            boolean z10 = !this.T2 && org.telegram.ui.ht.q().r(motionEvent, w90Var.b, null, this.l2);
            if (((f1Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && f1Var.N()) {
                if (f1Var.j0 == null) {
                    of.b1 b1Var = new of.b1(f1Var, f1Var.f, f1Var.n, f1Var.r, 0);
                    f1Var.j0 = b1Var;
                    b1Var.a();
                }
                f1Var.j0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14 = i11 - i9;
        int i15 = i12 - i10;
        w90 w90Var = this.X2;
        boolean g10 = w90Var.g();
        f2.m0 currentLayoutManager = w90Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i13 = m10.getTop() - (g10 ? 0 : this.W2 - i15);
        } else {
            i13 = 0;
        }
        super.onLayout(z10, i9, i10, i11, i12);
        if (w90Var.D) {
            w90Var.C = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i9, i10, i11, i12);
            w90Var.C = false;
            w90Var.D = false;
        } else if (L0 != -1 && i14 == this.V2 && i15 - this.W2 != 0) {
            w90Var.C = true;
            currentLayoutManager.i1(L0, i13, false);
            super.onLayout(false, i9, i10, i11, i12);
            w90Var.C = false;
        }
        this.W2 = i15;
        this.V2 = i14;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        w90 w90Var = this.X2;
        of.k1 k1Var = w90Var.e;
        if (k1Var != null) {
            k1Var.d = Integer.valueOf(size);
            fh.l2 l2Var = k1Var.e;
            if (l2Var != null) {
                l2Var.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        w90Var.v = min;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        w90 w90Var = this.X2;
        of.k1 k1Var = w90Var.e;
        if (w90Var.c.t) {
            if (!this.U2 && k1Var != null && k1Var.e != null && k1Var.f && motionEvent.getY() > k1Var.e.getTop()) {
                return false;
            }
        } else if (!this.U2 && k1Var != null && k1Var.e != null && k1Var.f && motionEvent.getY() < k1Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.C) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.wk0, android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        w90 w90Var = this.X2;
        w90Var.invalidate();
        w90Var.b();
    }
}
