package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class a6 extends tg.f {
    public final /* synthetic */ b6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(b6 b6Var, Context context) {
        super(context);
        this.L = b6Var;
    }

    @Override // tg.f, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.L.x && super.onTouchEvent(motionEvent);
    }
}
