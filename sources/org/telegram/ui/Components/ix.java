package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ix extends og.d {
    public boolean W2;
    public final /* synthetic */ a00 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(a00 a00Var, Context context) {
        super(context, null);
        this.X2 = a00Var;
    }

    @Override // og.d, org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.X2.m2.h++;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        ah.h hVar;
        a00 a00Var = this.X2;
        vz vzVar = a00Var.z0;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = a00Var.j2) != null) {
            hVar.f(i10, i11);
        }
        if (a00Var.C0 != null) {
            a00Var.B0.setUnderlineHeight(a00Var.D0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (vzVar != null && getAdapter() == vzVar && vzVar.d == 0) {
            vz vzVar2 = vzVar.O.w;
            if (vzVar2.Q.G0.F || vzVar2.y) {
                return;
            }
            if (a00Var.E0.N0() + 50 > vzVar.h()) {
                tz tzVar = vzVar.O;
                Objects.requireNonNull(tzVar);
                AndroidUtilities.runOnUIThread(new hx(tzVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a00 a00Var = this.X2;
        if (a00Var.f) {
            return false;
        }
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        ix ixVar = a00Var.D0;
        a00Var.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, ixVar, a00Var.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a00 a00Var = this.X2;
        if (a00Var.I0 && a00Var.y0.h() > 0) {
            this.W2 = true;
            a00Var.E0.h1(0, 0);
            a00Var.I0 = false;
            this.W2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        a00Var.r(true);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.W2) {
            return;
        }
        super.requestLayout();
    }
}
