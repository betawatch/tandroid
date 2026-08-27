package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ rn a;

    public mk(rn rnVar) {
        this.a = rnVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            rn rnVar = this.a;
            if (rnVar.D6 && longValue == rnVar.P5) {
                return true;
            }
        }
        return false;
    }
}
