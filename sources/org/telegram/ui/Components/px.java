package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class px extends ImageView {
    public final /* synthetic */ a00 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(a00 a00Var, Context context) {
        super(context);
        this.a = a00Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        az azVar;
        int action = motionEvent.getAction();
        a00 a00Var = this.a;
        if (action == 0) {
            a00Var.P1 = true;
            a00Var.Q1 = false;
            AndroidUtilities.runOnUIThread(new nd(a00Var, 350, 3), 350);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            a00Var.P1 = false;
            if (!a00Var.Q1 && (azVar = a00Var.t1) != null && azVar.k()) {
                try {
                    a00Var.x.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
