package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class av extends OrientationEventListener {
    public final /* synthetic */ cv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(cv cvVar, Context context) {
        super(context);
        this.a = cvVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        cv cvVar = this.a;
        u91 u91Var = cvVar.c;
        if (cvVar.F != null && u91Var.getVisibility() == 0 && (activity = cvVar.r) != null && u91Var.T && cvVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                cvVar.N = true;
                return;
            }
            if (!cvVar.N || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(cvVar.L);
                cvVar.M = false;
                cvVar.N = false;
            }
        }
    }
}
