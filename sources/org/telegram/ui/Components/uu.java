package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class uu extends OrientationEventListener {
    public final /* synthetic */ wu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(wu wuVar, Context context) {
        super(context);
        this.a = wuVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        wu wuVar = this.a;
        o91 o91Var = wuVar.c;
        if (wuVar.F != null && o91Var.getVisibility() == 0 && (activity = wuVar.r) != null && o91Var.T && wuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                wuVar.N = true;
                return;
            }
            if (!wuVar.N || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(wuVar.L);
                wuVar.M = false;
                wuVar.N = false;
            }
        }
    }
}
