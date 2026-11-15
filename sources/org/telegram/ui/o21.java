package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o21 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ o21(SessionsActivity sessionsActivity, int i7) {
        this.a = i7;
        this.b = sessionsActivity;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f = connectedbots.connected_bots;
                    if (sessionsActivity.a != null) {
                        sessionsActivity.r0();
                        sessionsActivity.a.f();
                        break;
                    }
                }
                break;
            default:
                SessionsActivity.a0(this.b, (Boolean) obj);
                break;
        }
    }
}
