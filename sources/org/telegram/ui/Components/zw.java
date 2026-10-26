package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zw extends qg.d {
    public boolean g3;
    public final /* synthetic */ sz h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(sz szVar, Context context) {
        super(context, null);
        this.h3 = szVar;
    }

    @Override // qg.d, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.h3.n2.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i10) {
        sz szVar = this.h3;
        nz nzVar = szVar.z0;
        if (szVar.C0 != null) {
            szVar.B0.setUnderlineHeight(szVar.D0.canScrollVertically(-1) ? AndroidUtilities.getShadowHeight() : 0);
        }
        if (nzVar == null || getAdapter() != nzVar || nzVar.d != 0 || nzVar.O.a() || nzVar.O.w.y) {
            return;
        }
        if (szVar.E0.N0() + 50 > nzVar.h()) {
            lz lzVar = nzVar.O;
            Objects.requireNonNull(lzVar);
            AndroidUtilities.runOnUIThread(new yw(lzVar, 0));
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        sz szVar = this.h3;
        if (szVar.f) {
            return false;
        }
        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
        zw zwVar = szVar.D0;
        szVar.getMeasuredHeight();
        return super.onInterceptTouchEvent(motionEvent) || o10.p(motionEvent, zwVar, szVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        sz szVar = this.h3;
        if (szVar.I0 && szVar.y0.h() > 0) {
            this.g3 = true;
            szVar.E0.h1(0, 0);
            szVar.I0 = false;
            this.g3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        szVar.q(true);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }
}
