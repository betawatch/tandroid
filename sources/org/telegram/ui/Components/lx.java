package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class lx extends ImageView {
    public final /* synthetic */ wz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(wz wzVar, Context context) {
        super(context);
        this.a = wzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wy wyVar;
        int action = motionEvent.getAction();
        wz wzVar = this.a;
        if (action == 0) {
            wzVar.P1 = true;
            wzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new o8(wzVar, 350, 5), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            wzVar.P1 = false;
            if (!wzVar.Q1 && (wyVar = wzVar.t1) != null && wyVar.k()) {
                try {
                    wzVar.x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
