// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class og3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ LaunchActivity d;

    public /* synthetic */ og3(cj3 cj3Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = cj3Var;
        this.c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        LaunchActivity launchActivity = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3Var.Y3(tL_attachMenuBot, launchActivity);
                break;
            default:
                cj3Var.a4(tL_attachMenuBot, launchActivity);
                break;
        }
    }
}
