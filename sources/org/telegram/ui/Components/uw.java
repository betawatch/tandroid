package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class uw extends og.d {
    public boolean Y2;
    public final /* synthetic */ mz Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(mz mzVar, Context context) {
        super(context, null);
        this.Z2 = mzVar;
    }

    @Override // og.d, org.telegram.ui.Components.yl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.Z2.m2.h++;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        ah.h hVar;
        mz mzVar = this.Z2;
        hz hzVar = mzVar.z0;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = mzVar.j2) != null) {
            hVar.f(i10, i11);
        }
        if (mzVar.C0 != null) {
            mzVar.B0.setUnderlineHeight(mzVar.D0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (hzVar != null && getAdapter() == hzVar && hzVar.d == 0) {
            hz hzVar2 = hzVar.O.w;
            if (hzVar2.Q.G0.F || hzVar2.y) {
                return;
            }
            if (mzVar.E0.N0() + 50 > hzVar.h()) {
                fz fzVar = hzVar.O;
                Objects.requireNonNull(fzVar);
                AndroidUtilities.runOnUIThread(new tw(fzVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mz mzVar = this.Z2;
        if (mzVar.f) {
            return false;
        }
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        uw uwVar = mzVar.D0;
        mzVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, uwVar, mzVar.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mz mzVar = this.Z2;
        if (mzVar.I0 && mzVar.y0.h() > 0) {
            this.Y2 = true;
            mzVar.E0.h1(0, 0);
            mzVar.I0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        mzVar.q(true);
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}
