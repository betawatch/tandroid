package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class du extends OrientationEventListener {
    public final /* synthetic */ fu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(fu fuVar, Context context) {
        super(context);
        this.a = fuVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        fu fuVar = this.a;
        i81 i81Var = fuVar.c;
        if (fuVar.B != null && i81Var.getVisibility() == 0 && (activity = fuVar.r) != null && i81Var.P && fuVar.I) {
            if (i10 >= 240 && i10 <= 300) {
                fuVar.J = true;
                return;
            }
            if (!fuVar.J || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(fuVar.H);
                fuVar.I = false;
                fuVar.J = false;
            }
        }
    }
}
