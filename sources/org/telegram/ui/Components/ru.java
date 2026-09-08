package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ru extends OrientationEventListener {
    public final /* synthetic */ tu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru(tu tuVar, Context context) {
        super(context);
        this.a = tuVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        tu tuVar = this.a;
        b91 b91Var = tuVar.c;
        if (tuVar.F != null && b91Var.getVisibility() == 0 && (activity = tuVar.r) != null && b91Var.T && tuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                tuVar.N = true;
                return;
            }
            if (!tuVar.N || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(tuVar.L);
                tuVar.M = false;
                tuVar.N = false;
            }
        }
    }
}
