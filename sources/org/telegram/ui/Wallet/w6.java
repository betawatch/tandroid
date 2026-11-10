package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class w6 extends vg.e {
    public final /* synthetic */ x6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(x6 x6Var, Context context) {
        super(context);
        this.L = x6Var;
    }

    @Override // vg.e, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.L.y && super.onTouchEvent(motionEvent);
    }
}
