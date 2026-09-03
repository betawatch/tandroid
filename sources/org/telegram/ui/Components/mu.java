package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mu extends OrientationEventListener {
    public final /* synthetic */ ou a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(ou ouVar, Context context) {
        super(context);
        this.a = ouVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        ou ouVar = this.a;
        e91 e91Var = ouVar.c;
        if (ouVar.C != null && e91Var.getVisibility() == 0 && (activity = ouVar.r) != null && e91Var.Q && ouVar.J) {
            if (i10 >= 240 && i10 <= 300) {
                ouVar.K = true;
                return;
            }
            if (!ouVar.K || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(ouVar.I);
                ouVar.J = false;
                ouVar.K = false;
            }
        }
    }
}
