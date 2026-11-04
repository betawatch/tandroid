package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vv extends ImageView {
    public final /* synthetic */ ey a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv(ey eyVar, Context context) {
        super(context);
        this.a = eyVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fx fxVar;
        int action = motionEvent.getAction();
        ey eyVar = this.a;
        if (action == 0) {
            eyVar.Q1 = true;
            eyVar.R1 = false;
            org.telegram.messenger.g0.i3(new o2(eyVar, 350, 6), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            eyVar.Q1 = false;
            if (!eyVar.R1 && (fxVar = eyVar.u1) != null && fxVar.k()) {
                try {
                    eyVar.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
