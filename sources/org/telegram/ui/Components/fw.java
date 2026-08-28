package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fw extends wf.d {
    public boolean U2;
    public final /* synthetic */ wy V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(wy wyVar, Context context) {
        super(context, null);
        this.V2 = wyVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i9, int i10) {
        ig.e eVar;
        wy wyVar = this.V2;
        ry ryVar = wyVar.v0;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = wyVar.f2) != null) {
            eVar.f(i9, i10);
            wyVar.C();
        }
        if (wyVar.y0 != null) {
            wyVar.x0.setUnderlineHeight(wyVar.z0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (ryVar != null && getAdapter() == ryVar && ryVar.d == 0) {
            ry ryVar2 = ryVar.K.w;
            if (ryVar2.M.C0.B || ryVar2.y) {
                return;
            }
            if (wyVar.A0.N0() + 50 > ryVar.h()) {
                py pyVar = ryVar.K;
                Objects.requireNonNull(pyVar);
                AndroidUtilities.runOnUIThread(new ew(pyVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wy wyVar = this.V2;
        if (wyVar.f) {
            return false;
        }
        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
        fw fwVar = wyVar.z0;
        wyVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, fwVar, wyVar.c2, this.l2);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        wy wyVar = this.V2;
        if (wyVar.E0 && wyVar.u0.h() > 0) {
            this.U2 = true;
            wyVar.A0.h1(0, 0);
            wyVar.E0 = false;
            this.U2 = false;
        }
        super.onLayout(z10, i9, i10, i11, i12);
        wyVar.q(true);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }
}
