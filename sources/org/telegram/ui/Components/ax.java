package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ax extends ImageView {
    public final /* synthetic */ lz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(lz lzVar, Context context) {
        super(context);
        this.a = lzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ly lyVar;
        int action = motionEvent.getAction();
        lz lzVar = this.a;
        if (action == 0) {
            lzVar.P1 = true;
            lzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new kd(lzVar, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            lzVar.P1 = false;
            if (!lzVar.Q1 && (lyVar = lzVar.t1) != null && lyVar.k()) {
                try {
                    lzVar.x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
