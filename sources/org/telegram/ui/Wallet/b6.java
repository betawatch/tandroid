package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class b6 extends tg.f {
    public final /* synthetic */ c6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(c6 c6Var, Context context) {
        super(context);
        this.L = c6Var;
    }

    @Override // tg.f, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.L.x && super.onTouchEvent(motionEvent);
    }
}
