package org.telegram.ui.Components;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ew extends xf.d {
    public boolean U2;
    public final /* synthetic */ yy V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(yy yyVar, Context context) {
        super(context, null);
        this.V2 = yyVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        jg.e eVar;
        yy yyVar = this.V2;
        ty tyVar = yyVar.v0;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = yyVar.f2) != null) {
            eVar.f(i10, i11);
            yyVar.D();
        }
        if (yyVar.y0 != null) {
            yyVar.x0.setUnderlineHeight(yyVar.z0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (tyVar != null && getAdapter() == tyVar && tyVar.d == 0) {
            ty tyVar2 = tyVar.K.w;
            if (tyVar2.M.C0.B || tyVar2.y) {
                return;
            }
            if (yyVar.A0.N0() + 50 > tyVar.h()) {
                ry ryVar = tyVar.K;
                Objects.requireNonNull(ryVar);
                AndroidUtilities.runOnUIThread(new dw(ryVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        yy yyVar = this.V2;
        if (yyVar.f) {
            return false;
        }
        org.telegram.ui.kt q6 = org.telegram.ui.kt.q();
        ew ewVar = yyVar.z0;
        yyVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, ewVar, yyVar.c2, this.l2);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yy yyVar = this.V2;
        if (yyVar.E0 && yyVar.u0.h() > 0) {
            this.U2 = true;
            yyVar.A0.h1(0, 0);
            yyVar.E0 = false;
            this.U2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        yyVar.r(true);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }
}
