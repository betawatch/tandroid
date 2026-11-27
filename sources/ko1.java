// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ko1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.User d;

    public /* synthetic */ ko1(zu1 zu1Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = tL_attachMenuBot;
        this.d = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        TLRPC.User user = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new ro1(zu1Var, tL_error, tL_attachMenuBot, user));
                break;
            default:
                hl.c3(new ro1(zu1Var, tL_attachMenuBot, tL_error, user));
                break;
        }
    }
}
