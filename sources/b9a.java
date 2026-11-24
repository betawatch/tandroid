// default package

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b9a implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ b9a(SessionsActivity sessionsActivity, byte b) {
        this.a = b;
        this.b = sessionsActivity;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        SessionsActivity sessionsActivity = this.b;
        switch (b) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
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
                sessionsActivity.n0((Boolean) obj);
                break;
        }
    }
}
