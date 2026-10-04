package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class xu extends OrientationEventListener {
    public final /* synthetic */ zu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(zu zuVar, Context context) {
        super(context);
        this.a = zuVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        zu zuVar = this.a;
        z91 z91Var = zuVar.c;
        if (zuVar.F != null && z91Var.getVisibility() == 0 && (activity = zuVar.r) != null && z91Var.T && zuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                zuVar.N = true;
                return;
            }
            if (!zuVar.N || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(zuVar.L);
                zuVar.M = false;
                zuVar.N = false;
            }
        }
    }
}
