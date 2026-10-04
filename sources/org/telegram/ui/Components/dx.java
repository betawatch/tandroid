package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class dx extends ImageView {
    public final /* synthetic */ nz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx(nz nzVar, Context context) {
        super(context);
        this.a = nzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        oy oyVar;
        int action = motionEvent.getAction();
        nz nzVar = this.a;
        if (action == 0) {
            nzVar.P1 = true;
            nzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new ld(nzVar, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            nzVar.P1 = false;
            if (!nzVar.Q1 && (oyVar = nzVar.t1) != null && oyVar.k()) {
                try {
                    nzVar.x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
