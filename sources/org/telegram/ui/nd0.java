package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nd0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ pd0 a;

    public nd0(pd0 pd0Var) {
        this.a = pd0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        pd0 pd0Var = this.a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                pd0Var.B = (GoogleSignInAccount) i7.l.b(intent).getResult(com.google.android.gms.common.api.f.class);
                pd0Var.h(null);
            } catch (com.google.android.gms.common.api.f e10) {
                FileLog.e(e10);
            }
        }
    }
}
