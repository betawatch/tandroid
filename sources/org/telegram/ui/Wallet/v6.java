package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
