package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class a8 extends uo0 {
    public final /* synthetic */ i8 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(i8 i8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false);
        this.l0 = i8Var;
    }

    @Override // org.telegram.ui.Components.uo0
    public final boolean d(MotionEvent motionEvent) {
        if (this.l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
