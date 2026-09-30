package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
