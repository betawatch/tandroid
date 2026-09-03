package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pw extends bg.e {
    public boolean V2;
    public final /* synthetic */ kz W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(kz kzVar, Context context) {
        super(context, null);
        this.W2 = kzVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        ng.e eVar;
        kz kzVar = this.W2;
        fz fzVar = kzVar.w0;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = kzVar.g2) != null) {
            eVar.f(i10, i11);
            kzVar.C();
        }
        if (kzVar.z0 != null) {
            kzVar.y0.setUnderlineHeight(kzVar.A0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (fzVar != null && getAdapter() == fzVar && fzVar.d == 0) {
            fz fzVar2 = fzVar.L.w;
            if (fzVar2.N.D0.C || fzVar2.y) {
                return;
            }
            if (kzVar.B0.N0() + 50 > fzVar.h()) {
                dz dzVar = fzVar.L;
                Objects.requireNonNull(dzVar);
                AndroidUtilities.runOnUIThread(new ow(dzVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        kz kzVar = this.W2;
        if (kzVar.f) {
            return false;
        }
        org.telegram.ui.rt q10 = org.telegram.ui.rt.q();
        pw pwVar = kzVar.A0;
        kzVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, pwVar, kzVar.d2, this.m2);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        kz kzVar = this.W2;
        if (kzVar.F0 && kzVar.v0.h() > 0) {
            this.V2 = true;
            kzVar.B0.h1(0, 0);
            kzVar.F0 = false;
            this.V2 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        kzVar.q(true);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }
}
