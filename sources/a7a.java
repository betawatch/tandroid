// default package

import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
