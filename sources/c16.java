// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class c16 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ c16(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                if (tLObject != null) {
                    gm.c3(new fd5(launchActivity, (TL_account.Password) tLObject, (byte) 26));
                    break;
                }
                break;
            default:
                String str2 = LaunchActivity.C1;
                gm.c3(new fd5(launchActivity, tLObject, (byte) 22));
                break;
        }
    }
}
