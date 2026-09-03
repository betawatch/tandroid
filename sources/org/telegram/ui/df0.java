package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class df0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ ef0 a;

    public df0(ef0 ef0Var) {
        this.a = ef0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ef0 ef0Var = this.a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                ef0Var.y = (GoogleSignInAccount) k7.z.b(intent).getResult(com.google.android.gms.common.api.f.class);
                ef0Var.h(null);
            } catch (com.google.android.gms.common.api.f e6) {
                FileLog.e(e6);
            }
        }
    }
}
