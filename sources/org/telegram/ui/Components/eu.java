package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class eu extends OrientationEventListener {
    public final /* synthetic */ gu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(gu guVar, Context context) {
        super(context);
        this.a = guVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i9) {
        Activity activity;
        gu guVar = this.a;
        g81 g81Var = guVar.c;
        if (guVar.B != null && g81Var.getVisibility() == 0 && (activity = guVar.r) != null && g81Var.P && guVar.I) {
            if (i9 >= 240 && i9 <= 300) {
                guVar.J = true;
                return;
            }
            if (!guVar.J || i9 <= 0) {
                return;
            }
            if (i9 >= 330 || i9 <= 30) {
                activity.setRequestedOrientation(guVar.H);
                guVar.I = false;
                guVar.J = false;
            }
        }
    }
}
