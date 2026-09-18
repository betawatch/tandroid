package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public class BaseController {
    protected final int currentAccount;
    private AccountInstance parentAccountInstance;

    public BaseController(int i10) {
        this.parentAccountInstance = AccountInstance.getInstance(i10);
        this.currentAccount = i10;
    }

    public final AccountInstance getAccountInstance() {
        return this.parentAccountInstance;
    }

    public final AppGlobalConfig getAppGlobalConfig() {
        return getMessagesController().config;
    }

    public final pg.u0 getColorPalette() {
        return this.parentAccountInstance.getColorPalette();
    }

    public final ConnectionsManager getConnectionsManager() {
        return this.parentAccountInstance.getConnectionsManager();
    }

    public final ContactsController getContactsController() {
        return this.parentAccountInstance.getContactsController();
    }

    public final DownloadController getDownloadController() {
        return this.parentAccountInstance.getDownloadController();
    }

    public final FileLoader getFileLoader() {
        return this.parentAccountInstance.getFileLoader();
    }

    public final FileRefController getFileRefController() {
        return this.parentAccountInstance.getFileRefController();
    }

    public final LocationController getLocationController() {
        return this.parentAccountInstance.getLocationController();
    }

    public final MediaDataController getMediaDataController() {
        return this.parentAccountInstance.getMediaDataController();
    }

    public final MemberRequestsController getMemberRequestsController() {
        return this.parentAccountInstance.getMemberRequestsController();
    }

    public final MessagesController getMessagesController() {
        return this.parentAccountInstance.getMessagesController();
    }

    public final MessagesStorage getMessagesStorage() {
        return this.parentAccountInstance.getMessagesStorage();
    }

    public final NotificationCenter getNotificationCenter() {
        return this.parentAccountInstance.getNotificationCenter();
    }

    public final NotificationsController getNotificationsController() {
        return this.parentAccountInstance.getNotificationsController();
    }

    public final SecretChatHelper getSecretChatHelper() {
        return this.parentAccountInstance.getSecretChatHelper();
    }

    public final SendMessagesHelper getSendMessagesHelper() {
        return this.parentAccountInstance.getSendMessagesHelper();
    }

    public final StatsController getStatsController() {
        return this.parentAccountInstance.getStatsController();
    }

    public final UserConfig getUserConfig() {
        return this.parentAccountInstance.getUserConfig();
    }
}
