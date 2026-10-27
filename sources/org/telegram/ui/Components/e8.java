package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e8 extends mp0 {
    public final /* synthetic */ m8 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(m8 m8Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, false);
        this.m0 = m8Var;
    }

    @Override // org.telegram.ui.Components.mp0
    public final boolean d(MotionEvent motionEvent) {
        if (this.m0.G0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
