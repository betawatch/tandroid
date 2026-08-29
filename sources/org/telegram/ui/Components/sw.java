package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sw extends ImageView {
    public final /* synthetic */ fz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(fz fzVar, Context context) {
        super(context);
        this.a = fzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fy fyVar;
        int action = motionEvent.getAction();
        fz fzVar = this.a;
        if (action == 0) {
            fzVar.L1 = true;
            fzVar.M1 = false;
            AndroidUtilities.runOnUIThread(new i8(fzVar, 350, 4), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            fzVar.L1 = false;
            if (!fzVar.M1 && (fyVar = fzVar.p1) != null && fyVar.k()) {
                try {
                    fzVar.x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
