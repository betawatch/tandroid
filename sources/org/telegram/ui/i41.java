package org.telegram.ui;

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i41 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ i41(SessionsActivity sessionsActivity, int i10) {
        this.a = i10;
        this.b = sessionsActivity;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.f = connectedbots.connected_bots;
                    if (sessionsActivity.a != null) {
                        sessionsActivity.q0();
                        sessionsActivity.a.f();
                        break;
                    }
                }
                break;
            default:
                SessionsActivity.Z(this.b, (Boolean) obj);
                break;
        }
    }
}
