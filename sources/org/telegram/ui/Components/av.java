package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class av extends OrientationEventListener {
    public final /* synthetic */ cv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(cv cvVar, Context context) {
        super(context);
        this.a = cvVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Activity activity;
        cv cvVar = this.a;
        u91 u91Var = cvVar.c;
        if (cvVar.F != null && u91Var.getVisibility() == 0 && (activity = cvVar.r) != null && u91Var.T && cvVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                cvVar.N = true;
                return;
            }
            if (!cvVar.N || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(cvVar.L);
                cvVar.M = false;
                cvVar.N = false;
            }
        }
    }
}
