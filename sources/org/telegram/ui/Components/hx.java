package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class hx extends ImageView {
    public final /* synthetic */ tz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(tz tzVar, Context context) {
        super(context);
        this.a = tzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        uy uyVar;
        int action = motionEvent.getAction();
        tz tzVar = this.a;
        if (action == 0) {
            tzVar.P1 = true;
            tzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new d2(tzVar, 350, 7), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            tzVar.P1 = false;
            if (!tzVar.Q1 && (uyVar = tzVar.t1) != null && uyVar.k()) {
                try {
                    tzVar.x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
