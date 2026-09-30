package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class cx extends ImageView {
    public final /* synthetic */ mz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx(mz mzVar, Context context) {
        super(context);
        this.a = mzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ny nyVar;
        int action = motionEvent.getAction();
        mz mzVar = this.a;
        if (action == 0) {
            mzVar.P1 = true;
            mzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new ld(mzVar, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            mzVar.P1 = false;
            if (!mzVar.Q1 && (nyVar = mzVar.t1) != null && nyVar.k()) {
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
