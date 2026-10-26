package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bv extends OrientationEventListener {
    public final /* synthetic */ dv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(dv dvVar, Context context) {
        super(context);
        this.a = dvVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        dv dvVar = this.a;
        ma1 ma1Var = dvVar.c;
        if (dvVar.F != null && ma1Var.getVisibility() == 0 && (activity = dvVar.r) != null && ma1Var.T && dvVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                dvVar.N = true;
                return;
            }
            if (!dvVar.N || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(dvVar.L);
                dvVar.M = false;
                dvVar.N = false;
            }
        }
    }
}
