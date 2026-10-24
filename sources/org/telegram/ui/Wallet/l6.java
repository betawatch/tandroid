package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
