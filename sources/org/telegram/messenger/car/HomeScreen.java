package org.telegram.messenger.car;

import androidx.car.app.m;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class HomeScreen extends m implements e, NotificationCenter.NotificationCenterDelegate {
    @Override // androidx.lifecycle.e
    public final void a(t tVar) {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.notificationsCountUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.activeAccountChanged);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.activeAccountChanged) {
            throw null;
        }
        if ((i9 == NotificationCenter.pushMessagesUpdated || i9 == NotificationCenter.notificationsCountUpdated) && "tab_notifications".equals(null)) {
            throw null;
        }
    }

    @Override // androidx.lifecycle.e
    public final void e(t tVar) {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.notificationsCountUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.activeAccountChanged);
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void b(t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void f(t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void h(t tVar) {
    }

    @Override // androidx.lifecycle.e
    public final /* synthetic */ void i(t tVar) {
    }
}
