package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class ax extends ImageView {
    public final /* synthetic */ kz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(kz kzVar, Context context) {
        super(context);
        this.a = kzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ly lyVar;
        int action = motionEvent.getAction();
        kz kzVar = this.a;
        if (action == 0) {
            kzVar.P1 = true;
            kzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new m8(kzVar, 350, 4), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            kzVar.P1 = false;
            if (!kzVar.Q1 && (lyVar = kzVar.t1) != null && lyVar.k()) {
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
