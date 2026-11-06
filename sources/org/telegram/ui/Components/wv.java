package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
            org.telegram.messenger.g0.i3(new r2(gyVar, 350, 6), 350);
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
