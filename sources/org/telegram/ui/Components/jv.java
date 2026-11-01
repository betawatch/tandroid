package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jv extends iv {
    public final /* synthetic */ kv O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(kv kvVar, Context context, int i10) {
        super(kvVar.s, context, i10);
        this.O = kvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.O.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
