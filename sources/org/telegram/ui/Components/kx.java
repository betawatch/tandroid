package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kx extends wx {
    public final /* synthetic */ mz d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(mz mzVar, Context context) {
        super(mzVar, context);
        this.d3 = mzVar;
    }

    @Override // org.telegram.ui.Components.wx, org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d3.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
