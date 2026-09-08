package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class ContactsLoadingObserver {
    private final Callback callback;
    private final ContactsController contactsController;
    private final int currentAccount;
    private final Handler handler;
    private final NotificationCenter notificationCenter;
    private final NotificationCenter.NotificationCenterDelegate observer = new v1(this, 0);
    private final Runnable releaseRunnable;
    private boolean released;

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public interface Callback {
        void onResult(boolean z10);
    }

    private ContactsLoadingObserver(Callback callback) {
        this.callback = callback;
        int i10 = UserConfig.selectedAccount;
        this.currentAccount = i10;
        this.releaseRunnable = new d1(this, 17);
        this.contactsController = ContactsController.getInstance(i10);
        this.notificationCenter = NotificationCenter.getInstance(i10);
        this.handler = new Handler(Looper.myLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            onContactsLoadingStateUpdated(i11, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        onContactsLoadingStateUpdated(this.currentAccount, true);
    }

    public static void observe(Callback callback, long j3) {
        new ContactsLoadingObserver(callback).start(j3);
    }

    private boolean onContactsLoadingStateUpdated(int i10, boolean z10) {
        if (this.released) {
            return false;
        }
        boolean z11 = this.contactsController.contactsLoaded;
        if (!z11 && !z10) {
            return false;
        }
        release();
        this.callback.onResult(z11);
        return true;
    }

    public void release() {
        if (this.released) {
            return;
        }
        NotificationCenter notificationCenter = this.notificationCenter;
        if (notificationCenter != null) {
            notificationCenter.removeObserver(this.observer, NotificationCenter.contactsDidLoad);
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.releaseRunnable);
        }
        this.released = true;
    }

    public void start(long j3) {
        if (onContactsLoadingStateUpdated(this.currentAccount, false)) {
            return;
        }
        this.notificationCenter.addObserver(this.observer, NotificationCenter.contactsDidLoad);
        this.handler.postDelayed(this.releaseRunnable, j3);
    }
}
