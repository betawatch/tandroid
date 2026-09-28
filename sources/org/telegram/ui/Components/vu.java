package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class vu extends OrientationEventListener {
    public final /* synthetic */ xu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(xu xuVar, Context context) {
        super(context);
        this.a = xuVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        xu xuVar = this.a;
        q91 q91Var = xuVar.c;
        if (xuVar.F != null && q91Var.getVisibility() == 0 && (activity = xuVar.r) != null && q91Var.T && xuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                xuVar.N = true;
                return;
            }
            if (!xuVar.N || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(xuVar.L);
                xuVar.M = false;
                xuVar.N = false;
            }
        }
    }
}
