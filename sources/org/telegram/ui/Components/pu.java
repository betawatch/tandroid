package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pu extends OrientationEventListener {
    public final /* synthetic */ ru a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu(ru ruVar, Context context) {
        super(context);
        this.a = ruVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        ru ruVar = this.a;
        e91 e91Var = ruVar.c;
        if (ruVar.C != null && e91Var.getVisibility() == 0 && (activity = ruVar.r) != null && e91Var.Q && ruVar.J) {
            if (i10 >= 240 && i10 <= 300) {
                ruVar.K = true;
                return;
            }
            if (!ruVar.K || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(ruVar.I);
                ruVar.J = false;
                ruVar.K = false;
            }
        }
    }
}
