package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class xv extends ImageView {
    public final /* synthetic */ hy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(hy hyVar, Context context) {
        super(context);
        this.a = hyVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ix ixVar;
        int action = motionEvent.getAction();
        hy hyVar = this.a;
        if (action == 0) {
            hyVar.P1 = true;
            hyVar.Q1 = false;
            org.telegram.messenger.g0.i3(new r2(hyVar, 350, 6), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            hyVar.P1 = false;
            if (!hyVar.Q1 && (ixVar = hyVar.t1) != null && ixVar.k()) {
                try {
                    hyVar.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
