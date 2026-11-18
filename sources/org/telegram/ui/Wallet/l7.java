package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
