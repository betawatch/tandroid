// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cz5 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ cz5(LaunchActivity launchActivity, byte b) {
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
                    gl.c3(new hb5(launchActivity, (TL_account.Password) tLObject, (byte) 25));
                    break;
                }
                break;
            default:
                String str2 = LaunchActivity.C1;
                gl.c3(new hb5(launchActivity, tLObject, (byte) 21));
                break;
        }
    }
}
