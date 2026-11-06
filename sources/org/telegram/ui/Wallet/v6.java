package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
