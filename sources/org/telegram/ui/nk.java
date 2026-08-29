package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ tn a;

    public nk(tn tnVar) {
        this.a = tnVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            tn tnVar = this.a;
            if (tnVar.D6 && longValue == tnVar.P5) {
                return true;
            }
        }
        return false;
    }
}
