package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gx extends ImageView {
    public final /* synthetic */ sz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(sz szVar, Context context) {
        super(context);
        this.a = szVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ty tyVar;
        int action = motionEvent.getAction();
        sz szVar = this.a;
        if (action == 0) {
            szVar.P1 = true;
            szVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new h2(szVar, 350, 7), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            szVar.P1 = false;
            if (!szVar.Q1 && (tyVar = szVar.t1) != null && tyVar.k()) {
                try {
                    szVar.x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
