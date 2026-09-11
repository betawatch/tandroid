package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class iy0 extends ll0 {
    public boolean X2;
    public boolean Y2;
    public final /* synthetic */ my0 Z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy0(my0 my0Var, Context context) {
        super(context, null);
        this.Z2 = my0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.X2 == canScrollHorizontally && this.Y2 == canScrollHorizontally2) {
            return;
        }
        ah.y yVar = this.Z2.d;
        if (yVar != null) {
            yVar.invalidate();
        }
        this.X2 = canScrollHorizontally;
        this.Y2 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.qt previewDelegate;
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        my0 my0Var = this.Z2;
        iy0 iy0Var = my0Var.e;
        previewDelegate = my0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, iy0Var, previewDelegate, this.p2);
    }
}
