package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class x7 extends c8 {
    public long d;
    public final /* synthetic */ h8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(h8 h8Var, Context context) {
        super(context);
        this.e = h8Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        h8 h8Var = this.e;
        if (action == 0) {
            if (this.a[this.b].getImageReceiver().hasBitmapImage()) {
                h8Var.A0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            h8Var.A0(false, true);
        }
        return true;
    }
}
