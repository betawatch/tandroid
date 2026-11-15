package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cw extends ImageView {
    public final /* synthetic */ ly a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(ly lyVar, Context context) {
        super(context);
        this.a = lyVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        mx mxVar;
        int action = motionEvent.getAction();
        ly lyVar = this.a;
        if (action == 0) {
            lyVar.Q1 = true;
            lyVar.R1 = false;
            org.telegram.messenger.g0.i3(new a2(lyVar, 350, 9), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            lyVar.Q1 = false;
            if (!lyVar.R1 && (mxVar = lyVar.u1) != null && mxVar.k()) {
                try {
                    lyVar.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
