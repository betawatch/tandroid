package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        da1 da1Var = cvVar.c;
        if (cvVar.F != null && da1Var.getVisibility() == 0 && (activity = cvVar.r) != null && da1Var.T && cvVar.M) {
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
