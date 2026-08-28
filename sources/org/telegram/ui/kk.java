package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ qn a;

    public kk(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i9, int i10, Object[] objArr) {
        if (i9 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            qn qnVar = this.a;
            if (qnVar.D6 && longValue == qnVar.P5) {
                return true;
            }
        }
        return false;
    }
}
