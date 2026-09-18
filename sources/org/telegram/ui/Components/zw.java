package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class zw extends ImageView {
    public final /* synthetic */ kz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(kz kzVar, Context context) {
        super(context);
        this.a = kzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ky kyVar;
        int action = motionEvent.getAction();
        kz kzVar = this.a;
        if (action == 0) {
            kzVar.P1 = true;
            kzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new id(kzVar, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            kzVar.P1 = false;
            if (!kzVar.Q1 && (kyVar = kzVar.t1) != null && kyVar.k()) {
                try {
                    kzVar.x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
