package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class v6 extends vg.e {
    public final /* synthetic */ w6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(w6 w6Var, Context context) {
        super(context);
        this.L = w6Var;
    }

    @Override // vg.e, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.L.y && super.onTouchEvent(motionEvent);
    }
}
