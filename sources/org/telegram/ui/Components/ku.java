package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ku extends OrientationEventListener {
    public final /* synthetic */ mu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(mu muVar, Context context) {
        super(context);
        this.a = muVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        mu muVar = this.a;
        s81 s81Var = muVar.c;
        if (muVar.B != null && s81Var.getVisibility() == 0 && (activity = muVar.r) != null && s81Var.P && muVar.I) {
            if (i10 >= 240 && i10 <= 300) {
                muVar.J = true;
                return;
            }
            if (!muVar.J || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(muVar.H);
                muVar.I = false;
                muVar.J = false;
            }
        }
    }
}
