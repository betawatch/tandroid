package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class kx extends wx {
    public final /* synthetic */ kz g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(kz kzVar, Context context) {
        super(kzVar, context);
        this.g3 = kzVar;
    }

    @Override // org.telegram.ui.Components.wx, org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.g3.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
