package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fx extends ImageView {
    public final /* synthetic */ rz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(rz rzVar, Context context) {
        super(context);
        this.a = rzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sy syVar;
        int action = motionEvent.getAction();
        rz rzVar = this.a;
        if (action == 0) {
            rzVar.P1 = true;
            rzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new zd(rzVar, 350, 2), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            rzVar.P1 = false;
            if (!rzVar.Q1 && (syVar = rzVar.t1) != null && syVar.k()) {
                try {
                    rzVar.x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
