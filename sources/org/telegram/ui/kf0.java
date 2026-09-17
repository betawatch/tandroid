package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class kf0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ lf0 a;

    public kf0(lf0 lf0Var) {
        this.a = lf0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        lf0 lf0Var = this.a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                lf0Var.y = (GoogleSignInAccount) w7.d9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                lf0Var.h(null);
            } catch (com.google.android.gms.common.api.f e7) {
                FileLog.e(e7);
            }
        }
    }
}
