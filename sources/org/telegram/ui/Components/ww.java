package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ww extends ImageView {
    public final /* synthetic */ kz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(kz kzVar, Context context) {
        super(context);
        this.a = kzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ky kyVar;
        int action = motionEvent.getAction();
        kz kzVar = this.a;
        if (action == 0) {
            kzVar.M1 = true;
            kzVar.N1 = false;
            AndroidUtilities.runOnUIThread(new dw(kzVar, 350, 0), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            kzVar.M1 = false;
            if (!kzVar.N1 && (kyVar = kzVar.q1) != null && kyVar.k()) {
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
