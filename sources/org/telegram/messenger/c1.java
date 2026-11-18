package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class c1 {
    protected final int currentAccount;
    private c parentAccountInstance;

    public c1(int i7) {
        this.parentAccountInstance = c.a(i7);
        this.currentAccount = i7;
    }

    public final c getAccountInstance() {
        return this.parentAccountInstance;
    }

    public final p0 getAppGlobalConfig() {
        return getMessagesController().A7;
    }

    public final sg.k0 getColorPalette() {
        return sg.k0.e(this.parentAccountInstance.a);
    }

    public final ConnectionsManager getConnectionsManager() {
        return ConnectionsManager.getInstance(this.parentAccountInstance.a);
    }

    public final i5 getContactsController() {
        return i5.r(this.parentAccountInstance.a);
    }

    public final a6 getDownloadController() {
        return a6.q(this.parentAccountInstance.a);
    }

    public final w7 getFileLoader() {
        return w7.G(this.parentAccountInstance.a);
    }

    public final r8 getFileRefController() {
        return r8.n(this.parentAccountInstance.a);
    }

    public final qd getLocationController() {
        return qd.f(this.parentAccountInstance.a);
    }

    public final ri getMediaDataController() {
        return ri.d0(this.parentAccountInstance.a);
    }

    public final si getMemberRequestsController() {
        return si.b(this.parentAccountInstance.a);
    }

    public final mp getMessagesController() {
        return mp.u1(this.parentAccountInstance.a);
    }

    public final tr getMessagesStorage() {
        return tr.a0(this.parentAccountInstance.a);
    }

    public final ks getNotificationCenter() {
        return ks.f(this.parentAccountInstance.a);
    }

    public final xs getNotificationsController() {
        return xs.t(this.parentAccountInstance.a);
    }

    public final xv getSecretChatHelper() {
        return xv.i(this.parentAccountInstance.a);
    }

    public final zy getSendMessagesHelper() {
        return zy.C(this.parentAccountInstance.a);
    }

    public final cz getStatsController() {
        return cz.e(this.parentAccountInstance.a);
    }

    public final j10 getUserConfig() {
        return j10.i(this.parentAccountInstance.a);
    }
}
