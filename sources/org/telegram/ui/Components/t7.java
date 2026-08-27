package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t7 extends qn0 {
    public final /* synthetic */ b8 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(b8 b8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.h0 = b8Var;
    }

    @Override // org.telegram.ui.Components.qn0
    public final boolean d(MotionEvent motionEvent) {
        if (this.h0.D0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
