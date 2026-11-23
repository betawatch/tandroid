package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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

    public final rd getLocationController() {
        return rd.f(this.parentAccountInstance.a);
    }

    public final si getMediaDataController() {
        return si.d0(this.parentAccountInstance.a);
    }

    public final ti getMemberRequestsController() {
        return ti.b(this.parentAccountInstance.a);
    }

    public final np getMessagesController() {
        return np.u1(this.parentAccountInstance.a);
    }

    public final ur getMessagesStorage() {
        return ur.a0(this.parentAccountInstance.a);
    }

    public final ls getNotificationCenter() {
        return ls.f(this.parentAccountInstance.a);
    }

    public final ys getNotificationsController() {
        return ys.t(this.parentAccountInstance.a);
    }

    public final yv getSecretChatHelper() {
        return yv.i(this.parentAccountInstance.a);
    }

    public final az getSendMessagesHelper() {
        return az.C(this.parentAccountInstance.a);
    }

    public final dz getStatsController() {
        return dz.e(this.parentAccountInstance.a);
    }

    public final k10 getUserConfig() {
        return k10.i(this.parentAccountInstance.a);
    }
}
