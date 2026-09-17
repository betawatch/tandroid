package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
