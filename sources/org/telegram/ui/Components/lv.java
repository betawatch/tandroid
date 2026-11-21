package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class lv extends kv {
    public final /* synthetic */ mv P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(mv mvVar, Context context, int i7) {
        super(mvVar.s, context, i7);
        this.P = mvVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
