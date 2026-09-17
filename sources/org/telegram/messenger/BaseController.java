package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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

    public final qg.s0 getColorPalette() {
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
