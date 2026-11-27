// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class nt implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ fn7 d;

    public /* synthetic */ nt(uc7 uc7Var, long j, int i) {
        this.d = uc7Var;
        this.b = j;
        this.c = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                hl.c3(new r77((o) fn7Var, tLObject, this.c, this.b, (byte) 2));
                break;
            default:
                uc7 uc7Var = (uc7) fn7Var;
                uc7Var.h5.remove(this.b + "_" + this.c);
                if (tL_error == null && tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nt(o oVar, int i, long j) {
        this.d = oVar;
        this.c = i;
        this.b = j;
    }
}
