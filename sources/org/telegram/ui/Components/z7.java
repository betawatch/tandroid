package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z7 extends ym0 {
    public final /* synthetic */ g8 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(g8 g8Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, false);
        this.n0 = g8Var;
    }

    @Override // org.telegram.ui.Components.ym0
    public final boolean d(MotionEvent motionEvent) {
        if (this.n0.B2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
