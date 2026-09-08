package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.a) {
            case 0:
                ((ContactsLoadingObserver) this.b).lambda$new$0(i10, i11, objArr);
                break;
            default:
                ((TelegramMediaSession) this.b).lambda$new$0(i10, i11, objArr);
                break;
        }
    }
}
