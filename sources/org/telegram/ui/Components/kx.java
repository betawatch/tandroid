package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class kx extends wx {
    public final /* synthetic */ mz d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(mz mzVar, Context context) {
        super(mzVar, context);
        this.d3 = mzVar;
    }

    @Override // org.telegram.ui.Components.wx, org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d3.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
