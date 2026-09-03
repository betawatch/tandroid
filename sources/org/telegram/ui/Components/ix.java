package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ix extends ux {
    public final /* synthetic */ kz d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(kz kzVar, Context context) {
        super(kzVar, context);
        this.d3 = kzVar;
    }

    @Override // org.telegram.ui.Components.ux, org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d3.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
