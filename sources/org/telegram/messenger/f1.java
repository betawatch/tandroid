package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class f1 {
    protected final int currentAccount;
    private c parentAccountInstance;

    public f1(int i10) {
        this.parentAccountInstance = c.a(i10);
        this.currentAccount = i10;
    }

    public final c getAccountInstance() {
        return this.parentAccountInstance;
    }

    public final s0 getAppGlobalConfig() {
        return getMessagesController().y7;
    }

    public final ig.s0 getColorPalette() {
        return ig.s0.e(this.parentAccountInstance.a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.a);
    }

    public final i5 getContactsController() {
        return i5.r(this.parentAccountInstance.a);
    }

    public final b6 getDownloadController() {
        return b6.q(this.parentAccountInstance.a);
    }

    public final b8 getFileLoader() {
        return b8.G(this.parentAccountInstance.a);
    }

    public final w8 getFileRefController() {
        return w8.n(this.parentAccountInstance.a);
    }

    public final od getLocationController() {
        return od.f(this.parentAccountInstance.a);
    }

    public final vi getMediaDataController() {
        return vi.b0(this.parentAccountInstance.a);
    }

    public final wi getMemberRequestsController() {
        return wi.b(this.parentAccountInstance.a);
    }

    public final wp getMessagesController() {
        return wp.r1(this.parentAccountInstance.a);
    }

    public final is getMessagesStorage() {
        return is.a0(this.parentAccountInstance.a);
    }

    public final at getNotificationCenter() {
        return at.f(this.parentAccountInstance.a);
    }

    public final pt getNotificationsController() {
        return pt.t(this.parentAccountInstance.a);
    }

    public final pw getSecretChatHelper() {
        return pw.i(this.parentAccountInstance.a);
    }

    public final rz getSendMessagesHelper() {
        return rz.C(this.parentAccountInstance.a);
    }

    public final vz getStatsController() {
        return vz.e(this.parentAccountInstance.a);
    }

    public final e20 getUserConfig() {
        return e20.i(this.parentAccountInstance.a);
    }
}
