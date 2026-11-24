// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jh3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk3 b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ LaunchActivity d;

    public /* synthetic */ jh3(nk3 nk3Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = nk3Var;
        this.c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        LaunchActivity launchActivity = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3Var.d4(tL_attachMenuBot, launchActivity);
                break;
            default:
                nk3Var.b4(tL_attachMenuBot, launchActivity);
                break;
        }
    }
}
