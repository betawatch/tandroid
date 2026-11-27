// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class mb7 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;

    public /* synthetic */ mb7(uc7 uc7Var, byte b) {
        this.a = b;
        this.b = uc7Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                if (uc7Var.X4 != messages_availableeffects) {
                    uc7Var.X4 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        wl.g(uc7Var.currentAccount).f(uc7Var.X4.documents);
                    }
                    uc7Var.getNotificationCenter().k(jn7.w3, new Object[0]);
                }
                uc7Var.W4 = false;
                break;
            case 1:
                hl.c3(new mn6(uc7Var, (TLRPC.TL_help_appConfig) obj, (byte) 29));
                break;
            default:
                hl.c3(new o87(uc7Var, (TL_account.TL_webBrowserSettings) obj, (byte) 0));
                break;
        }
    }
}
