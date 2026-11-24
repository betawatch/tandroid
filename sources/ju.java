// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ju implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ jm7 d;

    public /* synthetic */ ju(oc7 oc7Var, long j, int i) {
        this.d = oc7Var;
        this.b = j;
        this.c = i;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                gm.c3(new o77((o) jm7Var, tLObject, this.c, this.b, (byte) 2));
                break;
            default:
                oc7 oc7Var = (oc7) jm7Var;
                oc7Var.i5.remove(this.b + "_" + this.c);
                if (tL_error == null && tLObject != null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ju(o oVar, int i, long j) {
        this.d = oVar;
        this.c = i;
        this.b = j;
    }
}
