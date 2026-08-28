package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mw extends ImageView {
    public final /* synthetic */ wy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(wy wyVar, Context context) {
        super(context);
        this.a = wyVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wx wxVar;
        int action = motionEvent.getAction();
        wy wyVar = this.a;
        if (action == 0) {
            wyVar.L1 = true;
            wyVar.M1 = false;
            AndroidUtilities.runOnUIThread(new qd(wyVar, 350, 2), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            wyVar.L1 = false;
            if (!wyVar.M1 && (wxVar = wyVar.p1) != null && wxVar.k()) {
                try {
                    wyVar.x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
