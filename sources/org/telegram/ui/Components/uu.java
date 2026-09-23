package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        b91 b91Var = wuVar.c;
        if (wuVar.F != null && b91Var.getVisibility() == 0 && (activity = wuVar.r) != null && b91Var.T && wuVar.M) {
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
