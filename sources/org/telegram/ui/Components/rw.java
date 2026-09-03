package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rw extends cg.e {
    public boolean V2;
    public final /* synthetic */ mz W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(mz mzVar, Context context) {
        super(context, null);
        this.W2 = mzVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        og.e eVar;
        mz mzVar = this.W2;
        hz hzVar = mzVar.w0;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = mzVar.g2) != null) {
            eVar.f(i10, i11);
            mzVar.C();
        }
        if (mzVar.z0 != null) {
            mzVar.y0.setUnderlineHeight(mzVar.A0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (hzVar != null && getAdapter() == hzVar && hzVar.d == 0) {
            hz hzVar2 = hzVar.L.w;
            if (hzVar2.N.D0.C || hzVar2.y) {
                return;
            }
            if (mzVar.B0.N0() + 50 > hzVar.h()) {
                fz fzVar = hzVar.L;
                Objects.requireNonNull(fzVar);
                AndroidUtilities.runOnUIThread(new qw(fzVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mz mzVar = this.W2;
        if (mzVar.f) {
            return false;
        }
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        rw rwVar = mzVar.A0;
        mzVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, rwVar, mzVar.d2, this.m2);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        mz mzVar = this.W2;
        if (mzVar.F0 && mzVar.v0.h() > 0) {
            this.V2 = true;
            mzVar.B0.h1(0, 0);
            mzVar.F0 = false;
            this.V2 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        mzVar.q(true);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
