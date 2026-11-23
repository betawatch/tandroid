package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
