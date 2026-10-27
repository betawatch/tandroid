package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c8 extends h8 {
    public long d;
    public final /* synthetic */ m8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(m8 m8Var, Context context) {
        super(context);
        this.e = m8Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        m8 m8Var = this.e;
        if (action == 0) {
            if (this.a[this.b].getImageReceiver().hasBitmapImage()) {
                m8Var.H0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            m8Var.H0(false, true);
        }
        return true;
    }
}
