package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        f91 f91Var = ruVar.c;
        if (ruVar.C != null && f91Var.getVisibility() == 0 && (activity = ruVar.r) != null && f91Var.Q && ruVar.J) {
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
