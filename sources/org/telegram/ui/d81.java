package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d81 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ d81(SessionsActivity sessionsActivity, int i10) {
        this.a = i10;
        this.b = sessionsActivity;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                SessionsActivity sessionsActivity = this.b;
                sessionsActivity.getClass();
                if (connectedbots != null) {
                    sessionsActivity.h = connectedbots.connected_bots;
                    if (sessionsActivity.a != null) {
                        sessionsActivity.m0();
                        sessionsActivity.a.l();
                        break;
                    }
                }
                break;
            default:
                SessionsActivity.V(this.b, (Boolean) obj);
                break;
        }
    }
}
