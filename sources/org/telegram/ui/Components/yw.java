package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yw extends ImageView {
    public final /* synthetic */ mz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(mz mzVar, Context context) {
        super(context);
        this.a = mzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        my myVar;
        int action = motionEvent.getAction();
        mz mzVar = this.a;
        if (action == 0) {
            mzVar.M1 = true;
            mzVar.N1 = false;
            AndroidUtilities.runOnUIThread(new jm(mzVar, 350, 1), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            mzVar.M1 = false;
            if (!mzVar.N1 && (myVar = mzVar.q1) != null && myVar.k()) {
                try {
                    mzVar.x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
