package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        r91 r91Var = vuVar.c;
        if (vuVar.F != null && r91Var.getVisibility() == 0 && (activity = vuVar.r) != null && r91Var.T && vuVar.M) {
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
