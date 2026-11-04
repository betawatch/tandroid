package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s7 extends pm0 {
    public final /* synthetic */ z7 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(z7 z7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.n0 = z7Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean d(MotionEvent motionEvent) {
        if (this.n0.y2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
