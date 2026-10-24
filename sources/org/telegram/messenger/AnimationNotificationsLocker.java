package org.telegram.messenger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class AnimationNotificationsLocker {
    final int[] allowedNotifications;
    int currentAccount;
    boolean disabled;
    int globalNotificationsIndex;
    int notificationsIndex;

    public AnimationNotificationsLocker() {
        this(null);
    }

    public void disable() {
        this.disabled = true;
    }

    public void lock() {
        if (this.disabled) {
            return;
        }
        int i10 = UserConfig.selectedAccount;
        if (this.currentAccount != i10) {
            NotificationCenter.getInstance(i10).onAnimationFinish(this.notificationsIndex);
            this.notificationsIndex = -1;
            this.currentAccount = i10;
        }
        this.notificationsIndex = NotificationCenter.getInstance(i10).setAnimationInProgress(this.notificationsIndex, this.allowedNotifications);
        this.globalNotificationsIndex = NotificationCenter.getGlobalInstance().setAnimationInProgress(this.globalNotificationsIndex, this.allowedNotifications);
    }

    public void unlock() {
        if (this.disabled) {
            return;
        }
        NotificationCenter.getInstance(this.currentAccount).onAnimationFinish(this.notificationsIndex);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.globalNotificationsIndex);
    }

    public AnimationNotificationsLocker(int[] iArr) {
        this.currentAccount = UserConfig.selectedAccount;
        this.notificationsIndex = -1;
        this.globalNotificationsIndex = -1;
        this.allowedNotifications = iArr;
    }
}
