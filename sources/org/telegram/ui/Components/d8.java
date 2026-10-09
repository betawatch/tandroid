package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d8 extends kp0 {
    public final /* synthetic */ l8 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(l8 l8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.l0 = l8Var;
    }

    @Override // org.telegram.ui.Components.kp0
    public final boolean d(MotionEvent motionEvent) {
        if (this.l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
