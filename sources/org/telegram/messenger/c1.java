package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    public final sg.j0 getColorPalette() {
        return sg.j0.e(this.parentAccountInstance.a);
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

    public final q8 getFileRefController() {
        return q8.n(this.parentAccountInstance.a);
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

    public final i10 getUserConfig() {
        return i10.i(this.parentAccountInstance.a);
    }
}
