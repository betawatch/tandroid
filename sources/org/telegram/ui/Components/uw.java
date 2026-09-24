package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class uw extends og.d {
    public boolean Y2;
    public final /* synthetic */ lz Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(lz lzVar, Context context) {
        super(context, null);
        this.Z2 = lzVar;
    }

    @Override // og.d, org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.Z2.m2.h++;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        ah.h hVar;
        lz lzVar = this.Z2;
        gz gzVar = lzVar.z0;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = lzVar.j2) != null) {
            hVar.f(i10, i11);
        }
        if (lzVar.C0 != null) {
            lzVar.B0.setUnderlineHeight(lzVar.D0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (gzVar != null && getAdapter() == gzVar && gzVar.d == 0) {
            gz gzVar2 = gzVar.O.w;
            if (gzVar2.Q.G0.F || gzVar2.y) {
                return;
            }
            if (lzVar.E0.N0() + 50 > gzVar.h()) {
                ez ezVar = gzVar.O;
                Objects.requireNonNull(ezVar);
                AndroidUtilities.runOnUIThread(new tw(ezVar, 0));
            }
        }
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        lz lzVar = this.Z2;
        if (lzVar.f) {
            return false;
        }
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        uw uwVar = lzVar.D0;
        lzVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, uwVar, lzVar.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        lz lzVar = this.Z2;
        if (lzVar.I0 && lzVar.y0.h() > 0) {
            this.Y2 = true;
            lzVar.E0.h1(0, 0);
            lzVar.I0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        lzVar.q(true);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}
