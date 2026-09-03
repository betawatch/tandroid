package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u7 extends jo0 {
    public final /* synthetic */ c8 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(c8 c8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.i0 = c8Var;
    }

    @Override // org.telegram.ui.Components.jo0
    public final boolean d(MotionEvent motionEvent) {
        if (this.i0.E0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
