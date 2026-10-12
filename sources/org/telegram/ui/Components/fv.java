package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        ca1 ca1Var = hvVar.c;
        if (hvVar.F != null && ca1Var.getVisibility() == 0 && (activity = hvVar.r) != null && ca1Var.T && hvVar.M) {
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
