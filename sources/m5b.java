// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class m5b implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ pcc b;
    public final /* synthetic */ c6b c;

    public m5b(c6b c6bVar, long j, pcc pccVar) {
        this.c = c6bVar;
        this.a = j;
        this.b = pccVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new y09((Object) this, (Object) tLObject, this.a, (Object) this.b, (byte) 12));
    }
}
