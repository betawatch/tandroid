package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class cz0 extends im0 {
    public boolean V2;
    public boolean W2;
    public final /* synthetic */ gz0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz0(gz0 gz0Var, Context context) {
        super(context, null);
        this.X2 = gz0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.V2 == canScrollHorizontally && this.W2 == canScrollHorizontally2) {
            return;
        }
        ah.x xVar = this.X2.d;
        if (xVar != null) {
            xVar.invalidate();
        }
        this.V2 = canScrollHorizontally;
        this.W2 = canScrollHorizontally2;
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.et previewDelegate;
        org.telegram.ui.gt q6 = org.telegram.ui.gt.q();
        gz0 gz0Var = this.X2;
        cz0 cz0Var = gz0Var.e;
        previewDelegate = gz0Var.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || q6.r(motionEvent, cz0Var, previewDelegate, this.n2);
    }
}
