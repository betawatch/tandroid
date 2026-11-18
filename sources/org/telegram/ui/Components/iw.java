package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class iw extends ImageView {
    public final /* synthetic */ ry a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(ry ryVar, Context context) {
        super(context);
        this.a = ryVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rx rxVar;
        int action = motionEvent.getAction();
        ry ryVar = this.a;
        if (action == 0) {
            ryVar.Q1 = true;
            ryVar.R1 = false;
            org.telegram.messenger.g0.h3(new org.telegram.ui.ii(ryVar, org.telegram.messenger.ks.V5, 12), org.telegram.messenger.ks.V5);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            ryVar.Q1 = false;
            if (!ryVar.R1 && (rxVar = ryVar.u1) != null && rxVar.k()) {
                try {
                    ryVar.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
