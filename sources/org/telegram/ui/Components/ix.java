package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ix extends ux {
    public final /* synthetic */ kz d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(kz kzVar, Context context) {
        super(kzVar, context);
        this.d3 = kzVar;
    }

    @Override // org.telegram.ui.Components.ux, org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d3.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
