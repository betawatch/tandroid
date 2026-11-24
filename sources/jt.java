// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class jt implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ gk7 d;

    public /* synthetic */ jt(na7 na7Var, long j, int i) {
        this.d = na7Var;
        this.b = j;
        this.c = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        gk7 gk7Var = this.d;
        switch (b) {
            case 0:
                gl.c3(new o57((o) gk7Var, tLObject, this.c, this.b, (byte) 2));
                break;
            default:
                na7 na7Var = (na7) gk7Var;
                na7Var.g5.remove(this.b + "_" + this.c);
                if (tL_error == null && tLObject != null) {
                    na7Var.R3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jt(o oVar, int i, long j) {
        this.d = oVar;
        this.c = i;
        this.b = j;
    }
}
