package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wv extends ImageView {
    public final /* synthetic */ gy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(gy gyVar, Context context) {
        super(context);
        this.a = gyVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hx hxVar;
        int action = motionEvent.getAction();
        gy gyVar = this.a;
        if (action == 0) {
            gyVar.P1 = true;
            gyVar.Q1 = false;
            org.telegram.messenger.g0.i3(new q2(gyVar, 350, 6), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            gyVar.P1 = false;
            if (!gyVar.Q1 && (hxVar = gyVar.t1) != null && hxVar.k()) {
                try {
                    gyVar.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
