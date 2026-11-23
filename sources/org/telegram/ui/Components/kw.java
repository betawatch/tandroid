package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class kw extends ImageView {
    public final /* synthetic */ ty a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(ty tyVar, Context context) {
        super(context);
        this.a = tyVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tx txVar;
        int action = motionEvent.getAction();
        ty tyVar = this.a;
        if (action == 0) {
            tyVar.Q1 = true;
            tyVar.R1 = false;
            org.telegram.messenger.g0.h3(new org.telegram.ui.ii(tyVar, org.telegram.messenger.ls.V5, 12), org.telegram.messenger.ls.V5);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            tyVar.Q1 = false;
            if (!tyVar.R1 && (txVar = tyVar.u1) != null && txVar.k()) {
                try {
                    tyVar.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
