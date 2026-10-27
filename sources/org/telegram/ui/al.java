package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class al implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ wn a;

    public al(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            wn wnVar = this.a;
            if (wnVar.X6 && longValue == wnVar.j6) {
                return true;
            }
        }
        return false;
    }
}
