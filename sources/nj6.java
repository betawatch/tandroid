// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class nj6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ck6 b;

    public /* synthetic */ nj6(ck6 ck6Var, byte b) {
        this.a = b;
        this.b = ck6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        ck6 ck6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new z56(ck6Var, tL_error, (byte) 26));
                break;
            default:
                hl.c3(new mj6(ck6Var, tL_error, tLObject, (byte) 1));
                break;
        }
    }
}
