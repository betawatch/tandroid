package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yw extends ng.d {
    public boolean Y2;
    public final /* synthetic */ rz Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(rz rzVar, Context context) {
        super(context, null);
        this.Z2 = rzVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        zg.e eVar;
        rz rzVar = this.Z2;
        mz mzVar = rzVar.z0;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = rzVar.j2) != null) {
            eVar.f(i10, i11);
            rzVar.C();
        }
        if (rzVar.C0 != null) {
            rzVar.B0.setUnderlineHeight(rzVar.D0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (mzVar != null && getAdapter() == mzVar && mzVar.d == 0) {
            mz mzVar2 = mzVar.O.w;
            if (mzVar2.Q.G0.F || mzVar2.y) {
                return;
            }
            if (rzVar.E0.N0() + 50 > mzVar.h()) {
                kz kzVar = mzVar.O;
                Objects.requireNonNull(kzVar);
                AndroidUtilities.runOnUIThread(new xw(kzVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        rz rzVar = this.Z2;
        if (rzVar.f) {
            return false;
        }
        org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
        yw ywVar = rzVar.D0;
        rzVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, ywVar, rzVar.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        rz rzVar = this.Z2;
        if (rzVar.I0 && rzVar.y0.h() > 0) {
            this.Y2 = true;
            rzVar.E0.h1(0, 0);
            rzVar.I0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        rzVar.q(true);
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}
