package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s7 extends x7 {
    public long d;
    public final /* synthetic */ c8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(c8 c8Var, Context context) {
        super(context);
        this.e = c8Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        c8 c8Var = this.e;
        if (action == 0) {
            if (this.a[this.b].getImageReceiver().hasBitmapImage()) {
                c8Var.z0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            c8Var.z0(false, true);
        }
        return true;
    }
}
