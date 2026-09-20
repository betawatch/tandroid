package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        p91 p91Var = vuVar.c;
        if (vuVar.F != null && p91Var.getVisibility() == 0 && (activity = vuVar.r) != null && p91Var.T && vuVar.M) {
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
