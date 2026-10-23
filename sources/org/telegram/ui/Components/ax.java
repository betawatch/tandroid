package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ax extends pg.d {
    public boolean Z2;
    public final /* synthetic */ tz a3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(tz tzVar, Context context) {
        super(context, null);
        this.a3 = tzVar;
    }

    @Override // pg.d, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.a3.n2.h++;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        bh.f fVar;
        tz tzVar = this.a3;
        oz ozVar = tzVar.z0;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = tzVar.j2) != null) {
            fVar.f(i10, i11);
        }
        if (tzVar.C0 != null) {
            tzVar.B0.setUnderlineHeight(tzVar.D0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (ozVar != null && getAdapter() == ozVar && ozVar.d == 0) {
            oz ozVar2 = ozVar.O.w;
            if (ozVar2.Q.G0.F || ozVar2.y) {
                return;
            }
            if (tzVar.E0.N0() + 50 > ozVar.h()) {
                mz mzVar = ozVar.O;
                Objects.requireNonNull(mzVar);
                AndroidUtilities.runOnUIThread(new zw(mzVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        tz tzVar = this.a3;
        if (tzVar.f) {
            return false;
        }
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        ax axVar = tzVar.D0;
        tzVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || o10.p(motionEvent, axVar, tzVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        tz tzVar = this.a3;
        if (tzVar.I0 && tzVar.y0.h() > 0) {
            this.Z2 = true;
            tzVar.E0.h1(0, 0);
            tzVar.I0 = false;
            this.Z2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        tzVar.r(true);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Z2) {
            return;
        }
        super.requestLayout();
    }
}
