package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class l7 extends vg.e {
    public final /* synthetic */ m7 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(m7 m7Var, Context context) {
        super(context);
        this.M = m7Var;
    }

    @Override // vg.e, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.M.y && super.onTouchEvent(motionEvent);
    }
}
