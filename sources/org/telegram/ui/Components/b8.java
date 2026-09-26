package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class b8 extends so0 {
    public final /* synthetic */ j8 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(j8 j8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.l0 = j8Var;
    }

    @Override // org.telegram.ui.Components.so0
    public final boolean d(MotionEvent motionEvent) {
        if (this.l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
