package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dx extends qx {
    public final /* synthetic */ fz c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(fz fzVar, Context context) {
        super(fzVar, context);
        this.c3 = fzVar;
    }

    @Override // org.telegram.ui.Components.qx, org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.c3.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
