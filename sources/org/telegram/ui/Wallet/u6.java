package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class u6 extends vg.e {
    public final /* synthetic */ v6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(v6 v6Var, Context context) {
        super(context);
        this.L = v6Var;
    }

    @Override // vg.e, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.L.y && super.onTouchEvent(motionEvent);
    }
}
