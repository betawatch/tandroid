package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u7 extends ko0 {
    public final /* synthetic */ c8 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(c8 c8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.i0 = c8Var;
    }

    @Override // org.telegram.ui.Components.ko0
    public final boolean d(MotionEvent motionEvent) {
        if (this.i0.E0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
