// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f97 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;

    public /* synthetic */ f97(na7 na7Var, byte b) {
        this.a = b;
        this.b = na7Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                if (na7Var.V4 != messages_availableeffects) {
                    na7Var.V4 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        vl.g(na7Var.currentAccount).f(na7Var.V4.documents);
                    }
                    na7Var.getNotificationCenter().k(kk7.v3, new Object[0]);
                }
                na7Var.U4 = false;
                break;
            case 1:
                gl.d3(new t67(na7Var, (TLRPC.TL_help_appConfig) obj, (byte) 1));
                break;
            default:
                gl.d3(new p67(na7Var, (TL_account.TL_webBrowserSettings) obj, (byte) 0));
                break;
        }
    }
}
