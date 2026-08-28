package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x1 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object[] objArr) {
        switch (this.a) {
            case 0:
                ((ContactsLoadingObserver) this.b).lambda$new$0(i9, i10, objArr);
                break;
            default:
                ((TelegramMediaSession) this.b).lambda$new$0(i9, i10, objArr);
                break;
        }
    }
}
