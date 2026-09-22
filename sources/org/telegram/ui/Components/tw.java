package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class tw extends og.d {
    public boolean Y2;
    public final /* synthetic */ kz Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(kz kzVar, Context context) {
        super(context, null);
        this.Z2 = kzVar;
    }

    @Override // og.d, org.telegram.ui.Components.yl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.Z2.m2.g++;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10, int i11) {
        ah.i iVar;
        kz kzVar = this.Z2;
        fz fzVar = kzVar.z0;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = kzVar.j2) != null) {
            iVar.f(i10, i11);
        }
        if (kzVar.C0 != null) {
            kzVar.B0.setUnderlineHeight(kzVar.D0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (fzVar != null && getAdapter() == fzVar && fzVar.d == 0) {
            fz fzVar2 = fzVar.O.w;
            if (fzVar2.Q.G0.F || fzVar2.y) {
                return;
            }
            if (kzVar.E0.N0() + 50 > fzVar.h()) {
                dz dzVar = fzVar.O;
                Objects.requireNonNull(dzVar);
                AndroidUtilities.runOnUIThread(new sw(dzVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        kz kzVar = this.Z2;
        if (kzVar.f) {
            return false;
        }
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        tw twVar = kzVar.D0;
        kzVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, twVar, kzVar.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        kz kzVar = this.Z2;
        if (kzVar.I0 && kzVar.y0.h() > 0) {
            this.Y2 = true;
            kzVar.E0.h1(0, 0);
            kzVar.I0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        kzVar.q(true);
    }

    @Override // org.telegram.ui.Components.yl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}
