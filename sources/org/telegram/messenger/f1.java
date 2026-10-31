package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    public final nd getLocationController() {
        return nd.f(this.parentAccountInstance.a);
    }

    public final ui getMediaDataController() {
        return ui.b0(this.parentAccountInstance.a);
    }

    public final vi getMemberRequestsController() {
        return vi.b(this.parentAccountInstance.a);
    }

    public final vp getMessagesController() {
        return vp.r1(this.parentAccountInstance.a);
    }

    public final hs getMessagesStorage() {
        return hs.a0(this.parentAccountInstance.a);
    }

    public final zs getNotificationCenter() {
        return zs.f(this.parentAccountInstance.a);
    }

    public final ot getNotificationsController() {
        return ot.t(this.parentAccountInstance.a);
    }

    public final ow getSecretChatHelper() {
        return ow.i(this.parentAccountInstance.a);
    }

    public final qz getSendMessagesHelper() {
        return qz.C(this.parentAccountInstance.a);
    }

    public final uz getStatsController() {
        return uz.e(this.parentAccountInstance.a);
    }

    public final d20 getUserConfig() {
        return d20.i(this.parentAccountInstance.a);
    }
}
