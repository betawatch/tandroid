package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kz0 extends qm0 {
    public boolean V2;
    public boolean W2;
    public final /* synthetic */ oz0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(oz0 oz0Var, Context context) {
        super(context, null);
        this.X2 = oz0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.V2 == canScrollHorizontally && this.W2 == canScrollHorizontally2) {
            return;
        }
        ai.f0 f0Var = this.X2.d;
        if (f0Var != null) {
            f0Var.invalidate();
        }
        this.V2 = canScrollHorizontally;
        this.W2 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.pt previewDelegate;
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        oz0 oz0Var = this.X2;
        kz0 kz0Var = oz0Var.e;
        previewDelegate = oz0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, kz0Var, previewDelegate, this.n2);
    }
}
