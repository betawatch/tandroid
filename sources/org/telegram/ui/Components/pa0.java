package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pa0 extends rl0 {
    public boolean U2;
    public boolean V2;
    public int W2;
    public int X2;
    public final /* synthetic */ qa0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa0(qa0 qa0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.Y2 = qa0Var;
        setOnScrollListener(new eg.f2(this, 29));
        i(new oa0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        qa0 qa0Var = this.Y2;
        qa0Var.invalidate();
        qa0Var.b();
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        qa0 qa0Var = this.Y2;
        tf.u0 u0Var = qa0Var.f;
        tf.z0 z0Var = qa0Var.e;
        if (!qa0Var.c.t ? this.V2 || z0Var == null || z0Var.e == null || !z0Var.f || motionEvent.getY() >= z0Var.e.getBottom() : this.V2 || z0Var == null || z0Var.e == null || !z0Var.f || motionEvent.getY() <= z0Var.e.getTop()) {
            boolean z4 = !this.U2 && org.telegram.ui.rt.q().r(motionEvent, qa0Var.b, null, this.m2);
            if (((u0Var.N() && motionEvent.getAction() == 0) || motionEvent.getAction() == 2) && u0Var.N()) {
                if (u0Var.k0 == null) {
                    zw zwVar = new zw(u0Var, u0Var.f, u0Var.n, u0Var.r, 1);
                    u0Var.k0 = zwVar;
                    zwVar.a();
                }
                u0Var.k0.b();
            }
            if (super.onInterceptTouchEvent(motionEvent) || z4) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        qa0 qa0Var = this.Y2;
        boolean g10 = qa0Var.g();
        f2.i0 currentLayoutManager = qa0Var.getCurrentLayoutManager();
        int L0 = g10 ? currentLayoutManager.L0() : currentLayoutManager.N0();
        View m9 = currentLayoutManager.m(L0);
        if (m9 != null) {
            i14 = m9.getTop() - (g10 ? 0 : this.X2 - i16);
        } else {
            i14 = 0;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        if (qa0Var.E) {
            qa0Var.D = true;
            currentLayoutManager.h1(0, 100000);
            super.onLayout(false, i10, i11, i12, i13);
            qa0Var.D = false;
            qa0Var.E = false;
        } else if (L0 != -1 && i15 == this.W2 && i16 - this.X2 != 0) {
            qa0Var.D = true;
            currentLayoutManager.i1(L0, i14, false);
            super.onLayout(false, i10, i11, i12, i13);
            qa0Var.D = false;
        }
        this.X2 = i16;
        this.W2 = i15;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        qa0 qa0Var = this.Y2;
        tf.z0 z0Var = qa0Var.e;
        if (z0Var != null) {
            z0Var.d = Integer.valueOf(size);
            org.telegram.ui.nw0 nw0Var = z0Var.e;
            if (nw0Var != null) {
                nw0Var.requestLayout();
            }
        }
        float min = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        qa0Var.v = min;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size + ((int) min), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qa0 qa0Var = this.Y2;
        tf.z0 z0Var = qa0Var.e;
        if (qa0Var.c.t) {
            if (!this.V2 && z0Var != null && z0Var.e != null && z0Var.f && motionEvent.getY() > z0Var.e.getTop()) {
                return false;
            }
        } else if (!this.V2 && z0Var != null && z0Var.e != null && z0Var.f && motionEvent.getY() < z0Var.e.getBottom()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y2.D) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.rl0, android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        qa0 qa0Var = this.Y2;
        qa0Var.invalidate();
        qa0Var.b();
    }
}
