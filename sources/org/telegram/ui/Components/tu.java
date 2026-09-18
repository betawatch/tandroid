package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class tu extends OrientationEventListener {
    public final /* synthetic */ vu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(vu vuVar, Context context) {
        super(context);
        this.a = vuVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        vu vuVar = this.a;
        q91 q91Var = vuVar.c;
        if (vuVar.F != null && q91Var.getVisibility() == 0 && (activity = vuVar.r) != null && q91Var.T && vuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                vuVar.N = true;
                return;
            }
            if (!vuVar.N || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(vuVar.L);
                vuVar.M = false;
                vuVar.N = false;
            }
        }
    }
}
