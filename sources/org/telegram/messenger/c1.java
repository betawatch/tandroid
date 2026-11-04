package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c1 {
    protected final int currentAccount;
    private c parentAccountInstance;

    public c1(int i3) {
        this.parentAccountInstance = c.a(i3);
        this.currentAccount = i3;
    }

    public final c getAccountInstance() {
        return this.parentAccountInstance;
    }

    public final p0 getAppGlobalConfig() {
        return getMessagesController().x7;
    }

    public final tg.k0 getColorPalette() {
        return tg.k0.e(this.parentAccountInstance.a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.a);
    }

    public final g5 getContactsController() {
        return g5.r(this.parentAccountInstance.a);
    }

    public final z5 getDownloadController() {
        return z5.q(this.parentAccountInstance.a);
    }

    public final w7 getFileLoader() {
        return w7.G(this.parentAccountInstance.a);
    }

    public final r8 getFileRefController() {
        return r8.n(this.parentAccountInstance.a);
    }

    public final ld getLocationController() {
        return ld.f(this.parentAccountInstance.a);
    }

    public final li getMediaDataController() {
        return li.b0(this.parentAccountInstance.a);
    }

    public final mi getMemberRequestsController() {
        return mi.b(this.parentAccountInstance.a);
    }

    public final hp getMessagesController() {
        return hp.s1(this.parentAccountInstance.a);
    }

    public final qr getMessagesStorage() {
        return qr.a0(this.parentAccountInstance.a);
    }

    public final hs getNotificationCenter() {
        return hs.f(this.parentAccountInstance.a);
    }

    public final us getNotificationsController() {
        return us.t(this.parentAccountInstance.a);
    }

    public final vv getSecretChatHelper() {
        return vv.i(this.parentAccountInstance.a);
    }

    public final yy getSendMessagesHelper() {
        return yy.C(this.parentAccountInstance.a);
    }

    public final bz getStatsController() {
        return bz.e(this.parentAccountInstance.a);
    }

    public final h10 getUserConfig() {
        return h10.i(this.parentAccountInstance.a);
    }
}
