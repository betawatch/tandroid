package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class vw extends og.d {
    public boolean f3;
    public final /* synthetic */ nz g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(nz nzVar, Context context) {
        super(context, null);
        this.g3 = nzVar;
    }

    @Override // og.d, org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.g3.m2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        nz nzVar = this.g3;
        iz izVar = nzVar.z0;
        if (nzVar.C0 != null) {
            nzVar.B0.setUnderlineHeight(nzVar.D0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (izVar == null || getAdapter() != izVar || izVar.d != 0 || izVar.O.a() || izVar.O.w.y) {
            return;
        }
        if (nzVar.E0.N0() + 50 > izVar.h()) {
            gz gzVar = izVar.O;
            Objects.requireNonNull(gzVar);
            AndroidUtilities.runOnUIThread(new uw(gzVar, 0));
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        nz nzVar = this.g3;
        if (nzVar.f) {
            return false;
        }
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        vw vwVar = nzVar.D0;
        nzVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, vwVar, nzVar.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nz nzVar = this.g3;
        if (nzVar.I0 && nzVar.y0.h() > 0) {
            this.f3 = true;
            nzVar.E0.h1(0, 0);
            nzVar.I0 = false;
            this.f3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        nzVar.q(true);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
