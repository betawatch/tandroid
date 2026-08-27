package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pd0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ sd0 a;

    public pd0(sd0 sd0Var) {
        this.a = sd0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        sd0 sd0Var = this.a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                sd0Var.B = (GoogleSignInAccount) g7.m8.b(intent).getResult(com.google.android.gms.common.api.f.class);
                sd0Var.h(null);
            } catch (com.google.android.gms.common.api.f e9) {
                FileLog.e(e9);
            }
        }
    }
}
