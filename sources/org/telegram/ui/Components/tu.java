package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
