// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mp1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.User d;

    public /* synthetic */ mp1(yv1 yv1Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = tL_attachMenuBot;
        this.d = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        TLRPC.User user = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new np1(yv1Var, tL_attachMenuBot, tL_error, user));
                break;
            default:
                gm.c3(new np1(yv1Var, tL_error, tL_attachMenuBot, user));
                break;
        }
    }
}
