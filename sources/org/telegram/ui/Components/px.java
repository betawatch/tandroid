package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class px extends cy {
    public final /* synthetic */ rz g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(rz rzVar, Context context) {
        super(rzVar, context);
        this.g3 = rzVar;
    }

    @Override // org.telegram.ui.Components.cy, org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.g3.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
