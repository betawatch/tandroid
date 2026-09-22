package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class y7 extends d8 {
    public long d;
    public final /* synthetic */ i8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(i8 i8Var, Context context) {
        super(context);
        this.e = i8Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        i8 i8Var = this.e;
        if (action == 0) {
            if (this.a[this.b].getImageReceiver().hasBitmapImage()) {
                i8Var.A0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            i8Var.A0(false, true);
        }
        return true;
    }
}
