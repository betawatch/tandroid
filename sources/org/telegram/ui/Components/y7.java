package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class y7 extends bn0 {
    public final /* synthetic */ f8 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(f8 f8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, false);
        this.n0 = f8Var;
    }

    @Override // org.telegram.ui.Components.bn0
    public final boolean d(MotionEvent motionEvent) {
        if (this.n0.B2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
