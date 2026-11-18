package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class iw extends ImageView {
    public final /* synthetic */ ry a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(ry ryVar, Context context) {
        super(context);
        this.a = ryVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rx rxVar;
        int action = motionEvent.getAction();
        ry ryVar = this.a;
        if (action == 0) {
            ryVar.Q1 = true;
            ryVar.R1 = false;
            org.telegram.messenger.g0.h3(new org.telegram.ui.ii(ryVar, org.telegram.messenger.ks.V5, 12), org.telegram.messenger.ks.V5);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            ryVar.Q1 = false;
            if (!ryVar.R1 && (rxVar = ryVar.u1) != null && rxVar.k()) {
                try {
                    ryVar.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
