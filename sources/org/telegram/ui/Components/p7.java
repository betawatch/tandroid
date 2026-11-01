package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p7 extends on0 {
    public final /* synthetic */ w7 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(w7 w7Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, false);
        this.m0 = w7Var;
    }

    @Override // org.telegram.ui.Components.on0
    public final boolean d(MotionEvent motionEvent) {
        if (this.m0.x2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
