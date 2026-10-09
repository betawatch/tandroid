package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jv extends OrientationEventListener {
    public final /* synthetic */ lv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(lv lvVar, Context context) {
        super(context);
        this.a = lvVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        lv lvVar = this.a;
        ha1 ha1Var = lvVar.c;
        if (lvVar.F != null && ha1Var.getVisibility() == 0 && (activity = lvVar.r) != null && ha1Var.T && lvVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                lvVar.N = true;
                return;
            }
            if (!lvVar.N || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(lvVar.L);
                lvVar.M = false;
                lvVar.N = false;
            }
        }
    }
}
