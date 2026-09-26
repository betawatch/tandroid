package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class z7 extends e8 {
    public long d;
    public final /* synthetic */ j8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(j8 j8Var, Context context) {
        super(context);
        this.e = j8Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        j8 j8Var = this.e;
        if (action == 0) {
            if (this.a[this.b].getImageReceiver().hasBitmapImage()) {
                j8Var.A0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            j8Var.A0(false, true);
        }
        return true;
    }
}
