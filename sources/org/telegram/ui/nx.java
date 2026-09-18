package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class nx extends ai.b0 {
    public final /* synthetic */ wy O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(wy wyVar, Context context, wy wyVar2, int i10, int i11) {
        super(context, wyVar2, i10, i11);
        this.O0 = wyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.O0).actionBar;
        return !kVar.s() && super.dispatchTouchEvent(motionEvent);
    }
}
