package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes3.dex */
public final class ContactsLoadingObserver {
    private final Callback callback;
    private final ContactsController contactsController;
    private final int currentAccount;
    private final Handler handler;
    private final NotificationCenter notificationCenter;
    private final NotificationCenter.NotificationCenterDelegate observer = new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.messenger.ContactsLoadingObserver$$ExternalSyntheticLambda0
        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public final void didReceivedNotification(int i, int i2, Object[] objArr) {
            ContactsLoadingObserver.$r8$lambda$U2XpPtohMROBuh2rWH3LHh87PCE(ContactsLoadingObserver.this, i, i2, objArr);
        }
    };
    private final Runnable releaseRunnable;
    private boolean released;

    public interface Callback {
        void onResult(boolean z);
    }

    public static void observe(Callback callback, long j) {
        new ContactsLoadingObserver(callback).start(j);
    }

    public static /* synthetic */ void $r8$lambda$U2XpPtohMROBuh2rWH3LHh87PCE(ContactsLoadingObserver contactsLoadingObserver, int i, int i2, Object[] objArr) {
        contactsLoadingObserver.getClass();
        if (i == NotificationCenter.contactsDidLoad) {
            contactsLoadingObserver.onContactsLoadingStateUpdated(i2, false);
        }
    }

    private ContactsLoadingObserver(Callback callback) {
        this.callback = callback;
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.releaseRunnable = new Runnable() { // from class: org.telegram.messenger.ContactsLoadingObserver$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                r0.onContactsLoadingStateUpdated(ContactsLoadingObserver.this.currentAccount, true);
            }
        };
        this.contactsController = ContactsController.getInstance(i);
        this.notificationCenter = NotificationCenter.getInstance(i);
        this.handler = new Handler(Looper.myLooper());
    }

    public void start(long j) {
        if (onContactsLoadingStateUpdated(this.currentAccount, false)) {
            return;
        }
        this.notificationCenter.addObserver(this.observer, NotificationCenter.contactsDidLoad);
        this.handler.postDelayed(this.releaseRunnable, j);
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

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onContactsLoadingStateUpdated(int i, boolean z) {
        if (this.released) {
            return false;
        }
        boolean z2 = this.contactsController.contactsLoaded;
        if (!z2 && !z) {
            return false;
        }
        release();
        this.callback.onResult(z2);
        return true;
    }
}
