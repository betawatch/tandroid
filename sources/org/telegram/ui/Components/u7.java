package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u7 extends pn0 {
    public final /* synthetic */ c8 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(c8 c8Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false);
        this.h0 = c8Var;
    }

    @Override // org.telegram.ui.Components.pn0
    public final boolean d(MotionEvent motionEvent) {
        if (this.h0.D0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
