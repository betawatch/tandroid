// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class gb7 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;

    public /* synthetic */ gb7(oc7 oc7Var, byte b) {
        this.a = b;
        this.b = oc7Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                TLRPC.messages_AvailableEffects messages_availableeffects = (TLRPC.messages_AvailableEffects) obj;
                if (oc7Var.X4 != messages_availableeffects) {
                    oc7Var.X4 = messages_availableeffects;
                    if (messages_availableeffects != null) {
                        vm.g(oc7Var.currentAccount).f(oc7Var.X4.documents);
                    }
                    oc7Var.getNotificationCenter().k(nm7.w3, new Object[0]);
                }
                oc7Var.W4 = false;
                break;
            case 1:
                gm.c3(new q87(oc7Var, (TLRPC.TL_help_appConfig) obj, (byte) 3));
                break;
            default:
                gm.c3(new r87(oc7Var, (TL_account.TL_webBrowserSettings) obj, (byte) 0));
                break;
        }
    }
}
