package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hw extends ImageView {
    public final /* synthetic */ qy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(qy qyVar, Context context) {
        super(context);
        this.a = qyVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qx qxVar;
        int action = motionEvent.getAction();
        qy qyVar = this.a;
        if (action == 0) {
            qyVar.Q1 = true;
            qyVar.R1 = false;
            org.telegram.messenger.g0.h3(new org.telegram.ui.ii(qyVar, org.telegram.messenger.ks.V5, 14), org.telegram.messenger.ks.V5);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            qyVar.Q1 = false;
            if (!qyVar.R1 && (qxVar = qyVar.u1) != null && qxVar.k()) {
                try {
                    qyVar.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
