package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e8 extends lp0 {
    public final /* synthetic */ m8 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(m8 m8Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, false);
        this.m0 = m8Var;
    }

    @Override // org.telegram.ui.Components.lp0
    public final boolean d(MotionEvent motionEvent) {
        if (this.m0.G0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
