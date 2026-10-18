package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class r6 extends tg.f {
    public final /* synthetic */ s6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(s6 s6Var, Context context) {
        super(context);
        this.L = s6Var;
    }

    @Override // tg.f, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.L.x && super.onTouchEvent(motionEvent);
    }
}
