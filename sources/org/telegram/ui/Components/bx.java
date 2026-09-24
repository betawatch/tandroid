package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class bx extends ImageView {
    public final /* synthetic */ lz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(lz lzVar, Context context) {
        super(context);
        this.a = lzVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        my myVar;
        int action = motionEvent.getAction();
        lz lzVar = this.a;
        if (action == 0) {
            lzVar.P1 = true;
            lzVar.Q1 = false;
            AndroidUtilities.runOnUIThread(new ld(lzVar, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            lzVar.P1 = false;
            if (!lzVar.Q1 && (myVar = lzVar.t1) != null && myVar.k()) {
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
