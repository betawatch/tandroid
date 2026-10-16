package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ex extends pg.d {
    public boolean W2;
    public final /* synthetic */ wz X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(wz wzVar, Context context) {
        super(context, null);
        this.X2 = wzVar;
    }

    @Override // pg.d, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.X2.m2.h++;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        bh.f fVar;
        wz wzVar = this.X2;
        rz rzVar = wzVar.z0;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = wzVar.j2) != null) {
            fVar.f(i10, i11);
        }
        if (wzVar.C0 != null) {
            wzVar.B0.setUnderlineHeight(wzVar.D0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (rzVar != null && getAdapter() == rzVar && rzVar.d == 0) {
            rz rzVar2 = rzVar.O.w;
            if (rzVar2.Q.G0.F || rzVar2.y) {
                return;
            }
            if (wzVar.E0.N0() + 50 > rzVar.h()) {
                pz pzVar = rzVar.O;
                Objects.requireNonNull(pzVar);
                AndroidUtilities.runOnUIThread(new dx(pzVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wz wzVar = this.X2;
        if (wzVar.f) {
            return false;
        }
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        ex exVar = wzVar.D0;
        wzVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, exVar, wzVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        wz wzVar = this.X2;
        if (wzVar.I0 && wzVar.y0.h() > 0) {
            this.W2 = true;
            wzVar.E0.h1(0, 0);
            wzVar.I0 = false;
            this.W2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        wzVar.r(true);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.W2) {
            return;
        }
        super.requestLayout();
    }
}
