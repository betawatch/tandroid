// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g7a implements RequestDelegate {
    public final /* synthetic */ String a;
    public final /* synthetic */ i7a b;

    public g7a(i7a i7aVar, String str) {
        this.b = i7aVar;
        this.a = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new en9(this, this.a, (byte) 24));
    }
}
