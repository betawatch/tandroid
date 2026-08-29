package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fw extends jl0 {
    public boolean T2;
    public boolean U2;
    public final /* synthetic */ fz V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(fz fzVar, Context context) {
        super(context, null);
        this.V2 = fzVar;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
        fz fzVar = this.V2;
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, fzVar.d0, fzVar.c2, this.l2);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        fz fzVar = this.V2;
        if (fzVar.m0 && fzVar.j0.C > 1) {
            this.T2 = true;
            fzVar.e0.h1(0, 0);
            fzVar.k0.setVisibility(0);
            fzVar.l0.k(0, 0);
            fzVar.m0 = false;
            this.T2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        fz.f(fzVar, true);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.U2) {
            return;
        }
        this.V2.j0.l();
        this.U2 = true;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }
}
