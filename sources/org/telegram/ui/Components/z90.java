package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z90 extends zk0 {
    public boolean T2;
    public boolean U2;
    public int V2;
    public int W2;
    public final /* synthetic */ aa0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z90(aa0 aa0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.X2 = aa0Var;
        setOnScrollListener(new xm(this, 6));
        i(new y90(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        aa0 aa0Var = this.X2;
        aa0Var.invalidate();
        aa0Var.b();
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        aa0 aa0Var = this.X2;
        pf.u0 u0Var = aa0Var.f;
        pf.z0 z0Var = aa0Var.e;
        if (!aa0Var.c.t ? this.U2 || z0Var == null || z0Var.e == null || !z0Var.f || motionEvent.getY() >= z0Var.e.getBottom() : this.U2 || z0Var == null || z0Var.e == null || !z0Var.f || motionEvent.getY() <= z0Var.e.getTop()) {
            boolean z10 = !this.T2 && org.telegram.ui.kt.q().r(motionEvent, aa0Var.b, null, this.l2);
            if (((u0Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && u0Var.N()) {
                if (u0Var.j0 == null) {
                    ow owVar = new ow(u0Var, u0Var.f, u0Var.n, u0Var.r, 1);
                    u0Var.j0 = owVar;
                    owVar.a();
                }
                u0Var.j0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z10) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        aa0 aa0Var = this.X2;
        boolean g10 = aa0Var.g();
        f2.k0 currentLayoutManager = aa0Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m10 = currentLayoutManager.m(L0);
        if (m10 != null) {
            i14 = m10.getTop() - (g10 ? 0 : this.W2 - i16);
        } else {
            i14 = 0;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (aa0Var.D) {
            aa0Var.C = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            aa0Var.C = false;
            aa0Var.D = false;
        } else if (L0 != -1 && i15 == this.V2 && i16 - this.W2 != 0) {
            aa0Var.C = true;
            currentLayoutManager.i1(L0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            aa0Var.C = false;
        }
        this.W2 = i16;
        this.V2 = i15;
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        aa0 aa0Var = this.X2;
        pf.z0 z0Var = aa0Var.e;
        if (z0Var != null) {
            z0Var.d = Integer.valueOf(size);
            org.telegram.ui.aj0 aj0Var = z0Var.e;
            if (aj0Var != null) {
                aj0Var.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        aa0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        aa0 aa0Var = this.X2;
        pf.z0 z0Var = aa0Var.e;
        if (aa0Var.c.t) {
            if (!this.U2 && z0Var != null && z0Var.e != null && z0Var.f && motionEvent.getY() > z0Var.e.getTop()) {
                return false;
            }
        } else if (!this.U2 && z0Var != null && z0Var.e != null && z0Var.f && motionEvent.getY() < z0Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.C) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.zk0, android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        aa0 aa0Var = this.X2;
        aa0Var.invalidate();
        aa0Var.b();
    }
}
