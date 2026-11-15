package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r7 extends qm0 {
    public final /* synthetic */ y7 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(y7 y7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.n0 = y7Var;
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean d(MotionEvent motionEvent) {
        if (this.n0.B2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
