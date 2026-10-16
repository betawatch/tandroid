package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fv extends OrientationEventListener {
    public final /* synthetic */ hv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv(hv hvVar, Context context) {
        super(context);
        this.a = hvVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        hv hvVar = this.a;
        da1 da1Var = hvVar.c;
        if (hvVar.F != null && da1Var.getVisibility() == 0 && (activity = hvVar.r) != null && da1Var.T && hvVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                hvVar.N = true;
                return;
            }
            if (!hvVar.N || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(hvVar.L);
                hvVar.M = false;
                hvVar.N = false;
            }
        }
    }
}
