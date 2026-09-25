package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class nw extends wl0 {
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ lz Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(lz lzVar, Context context) {
        super(context, null);
        this.Z2 = lzVar;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        lz lzVar = this.Z2;
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, lzVar.h0, lzVar.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        lz lzVar = this.Z2;
        if (lzVar.q0 && lzVar.n0.G > 1) {
            this.X2 = true;
            lzVar.i0.h1(0, 0);
            lzVar.o0.setVisibility(0);
            lzVar.p0.k(0, 0);
            lzVar.q0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        lz.f(lzVar, true);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.Y2) {
            return;
        }
        this.Z2.n0.l();
        this.Y2 = true;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }
}
