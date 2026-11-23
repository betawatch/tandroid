package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
