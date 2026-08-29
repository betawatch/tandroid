package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lw extends zf.d {
    public boolean U2;
    public final /* synthetic */ fz V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(fz fzVar, Context context) {
        super(context, null);
        this.V2 = fzVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        lg.e eVar;
        fz fzVar = this.V2;
        az azVar = fzVar.v0;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = fzVar.f2) != null) {
            eVar.f(i10, i11);
            fzVar.C();
        }
        if (fzVar.y0 != null) {
            fzVar.x0.setUnderlineHeight(fzVar.z0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (azVar != null && getAdapter() == azVar && azVar.d == 0) {
            az azVar2 = azVar.K.w;
            if (azVar2.M.C0.B || azVar2.y) {
                return;
            }
            if (fzVar.A0.N0() + 50 > azVar.h()) {
                yy yyVar = azVar.K;
                Objects.requireNonNull(yyVar);
                AndroidUtilities.runOnUIThread(new kw(yyVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fz fzVar = this.V2;
        if (fzVar.f) {
            return false;
        }
        org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
        lw lwVar = fzVar.z0;
        fzVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, lwVar, fzVar.c2, this.l2);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        fz fzVar = this.V2;
        if (fzVar.E0 && fzVar.u0.h() > 0) {
            this.U2 = true;
            fzVar.A0.h1(0, 0);
            fzVar.E0 = false;
            this.U2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        fzVar.q(true);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }
}
