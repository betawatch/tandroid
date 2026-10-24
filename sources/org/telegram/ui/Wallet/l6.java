package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class l6 extends tg.f {
    public final /* synthetic */ m6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(m6 m6Var, Context context) {
        super(context);
        this.L = m6Var;
    }

    @Override // tg.f, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.L.x && super.onTouchEvent(motionEvent);
    }
}
