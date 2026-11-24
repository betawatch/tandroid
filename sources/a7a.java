// default package

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class a7a implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ a7a(SessionsActivity sessionsActivity, byte b) {
        this.a = b;
        this.b = sessionsActivity;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        SessionsActivity sessionsActivity = this.b;
        switch (b) {
            case 0:
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
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
                sessionsActivity.m0((Boolean) obj);
                break;
        }
    }
}
