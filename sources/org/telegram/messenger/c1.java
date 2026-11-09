package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        return getMessagesController().x7;
    }

    public final sg.l0 getColorPalette() {
        return sg.l0.e(this.parentAccountInstance.a);
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

    public final sd getLocationController() {
        return sd.f(this.parentAccountInstance.a);
    }

    public final ui getMediaDataController() {
        return ui.b0(this.parentAccountInstance.a);
    }

    public final vi getMemberRequestsController() {
        return vi.b(this.parentAccountInstance.a);
    }

    public final qp getMessagesController() {
        return qp.s1(this.parentAccountInstance.a);
    }

    public final yr getMessagesStorage() {
        return yr.a0(this.parentAccountInstance.a);
    }

    public final qs getNotificationCenter() {
        return qs.f(this.parentAccountInstance.a);
    }

    public final dt getNotificationsController() {
        return dt.t(this.parentAccountInstance.a);
    }

    public final dw getSecretChatHelper() {
        return dw.i(this.parentAccountInstance.a);
    }

    public final gz getSendMessagesHelper() {
        return gz.C(this.parentAccountInstance.a);
    }

    public final jz getStatsController() {
        return jz.e(this.parentAccountInstance.a);
    }

    public final p10 getUserConfig() {
        return p10.i(this.parentAccountInstance.a);
    }
}
