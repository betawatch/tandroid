package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nu extends OrientationEventListener {
    public final /* synthetic */ pu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu(pu puVar, Context context) {
        super(context);
        this.a = puVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        pu puVar = this.a;
        e91 e91Var = puVar.c;
        if (puVar.C != null && e91Var.getVisibility() == 0 && (activity = puVar.r) != null && e91Var.Q && puVar.J) {
            if (i10 >= 240 && i10 <= 300) {
                puVar.K = true;
                return;
            }
            if (!puVar.K || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(puVar.I);
                puVar.J = false;
                puVar.K = false;
            }
        }
    }
}
