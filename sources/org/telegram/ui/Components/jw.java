package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jw extends ImageView {
    public final /* synthetic */ vy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw(vy vyVar, Context context) {
        super(context);
        this.a = vyVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vx vxVar;
        int action = motionEvent.getAction();
        vy vyVar = this.a;
        if (action == 0) {
            vyVar.P1 = true;
            vyVar.Q1 = false;
            org.telegram.messenger.i0.h3(new qq(vyVar, 350, 1), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            vyVar.P1 = false;
            if (!vyVar.Q1 && (vxVar = vyVar.t1) != null && vxVar.k()) {
                try {
                    vyVar.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
