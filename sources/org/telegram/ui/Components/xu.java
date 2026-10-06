package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class xu extends OrientationEventListener {
    public final /* synthetic */ zu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(zu zuVar, Context context) {
        super(context);
        this.a = zuVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        zu zuVar = this.a;
        aa1 aa1Var = zuVar.c;
        if (zuVar.F != null && aa1Var.getVisibility() == 0 && (activity = zuVar.r) != null && aa1Var.T && zuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                zuVar.N = true;
                return;
            }
            if (!zuVar.N || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(zuVar.L);
                zuVar.M = false;
                zuVar.N = false;
            }
        }
    }
}
